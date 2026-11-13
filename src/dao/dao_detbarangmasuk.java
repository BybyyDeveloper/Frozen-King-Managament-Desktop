/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.model_barang;
import model.model_barangmasuk;
import model.model_detbarangmasuk;
import service.service_detbarangmasuk;

/**
 * 
 * @author fazri
 */
public class dao_detbarangmasuk implements service_detbarangmasuk {
    private Connection conn;

    public dao_detbarangmasuk() {
    conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_detbarangmasuk mod_detmasuk) {
       PreparedStatement st = null;
        String sql ="INSERT INTO detail_barang_masuk (no_masuk, kode_barang, jml_masuk, subtotal_masuk) SELECT '"
                + mod_detmasuk.getMod_masuk().getNo_masuk()+"', kode_barang, jml_masuk, subtotal_masuk FROM "
                + "sementara_barang_masuk";
        try {
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_detbarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detbarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }  
    }

    @Override
    public void sumTotal(model_detbarangmasuk mod_detmasuk) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT SUM(subtotal_masuk) FROM sementara_barang_masuk";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                mod_detmasuk.setSubtotal_masuk(rs.getLong(1));
            }
        }catch (SQLException ex) {
           Logger.getLogger(dao_detbarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detbarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusSementara(model_detbarangmasuk mod_detmasuk) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_barang_masuk";
        try{
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_detbarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_detbarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public model_detbarangmasuk getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_detbarangmasuk> getData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT det_masuk.no_masuk, det_masuk.kode_barang, brg.nama_barang, "
                + "brg.harga, det_masuk.jml_masuk, det_masuk.subtotal_masuk "
                +"FROM detail_barang_masuk det_masuk "
                +"INNER JOIN barang_masuk masuk ON masuk.no_masuk = det_masuk.no_masuk "
                +"INNER JOIN barang brg ON brg.kode_barang = det_masuk.kode_barang "
                +"WHERE det_masuk.no_masuk='"+id+"' ORDER BY no_masuk ASC";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_barangmasuk masuk = new model_barangmasuk();
                model_detbarangmasuk det_masuk = new model_detbarangmasuk();
                model_barang brg = new model_barang();
                
                masuk.setNo_masuk(String.valueOf(rs.getString("det_masuk.no_masuk")));
                det_masuk.setMod_masuk(masuk);
                
                brg.setKode_barang(rs.getString("kode_barang"));
                brg.setNama_barang(rs.getString("nama_barang"));
                brg.setHarga(rs.getLong("harga"));
                det_masuk.setJml_masuk(rs.getInt("jml_masuk"));
                det_masuk.setSubtotal_masuk(rs.getLong("subtotal_masuk"));
                
                det_masuk.setMod_barang(brg);
                list.add(det_masuk);
            }
            return list;
        } catch (SQLException ex) {
           Logger.getLogger(dao_detbarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detbarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detbarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void cekDanUpdateStatusPemesanan(String kodeBarang) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Connection conn = koneksi.getConnection();

        try {
            String sql = "SELECT * FROM detail_pemesanan WHERE kode_barang = ? AND status = 'Sedang di pesan'";
            st = conn.prepareStatement(sql);
            st.setString(1, kodeBarang);
            rs = st.executeQuery();

            if (rs.next()) {
                String updateSql = "UPDATE detail_pemesanan SET status = 'Sudah masuk barang' WHERE kode_barang = ?";
                PreparedStatement stUpdate = conn.prepareStatement(updateSql);
                stUpdate.setString(1, kodeBarang);
                stUpdate.executeUpdate();
                stUpdate.close();
                
                System.out.println("Status berhasil diubah.");
            } else {
                System.out.println("Data tidak ditemukan atau status bukan 'Sedang di pesan'");
            }
        } catch (SQLException ex){
           java.util.logging.Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
}