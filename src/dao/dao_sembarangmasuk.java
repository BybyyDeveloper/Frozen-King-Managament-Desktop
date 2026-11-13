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
import javax.swing.JOptionPane;
import model.model_barang;
import model.model_detbarangmasuk;
import model.model_detpemesanan;
import model.model_sembarangmasuk;
import model.model_sempemesanan;
import service.service_sembarangmasuk;

/**
 *
 * @author fazri
 */
public class dao_sembarangmasuk implements service_sembarangmasuk{
private Connection conn;

    public dao_sembarangmasuk() {
        conn = koneksi.getConnection();
    }
    
    @Override
    public void tambahData(model_sembarangmasuk mod_masuk) {
        PreparedStatement st = null;
        String sql ="INSERT INTO sementara_barang_masuk (kode_barang, nama_barang, harga, jml_masuk, subtotal_masuk) VALUES (?,?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_masuk.getMod_barang().getKode_barang());
            st.setString(2, mod_masuk.getMod_barang().getNama_barang());
            st.setLong(3, mod_masuk.getMod_barang().getHarga());
            st.setLong(4, mod_masuk.getMod_detmasuk().getJml_masuk());
            st.setLong(5, mod_masuk.getMod_detmasuk().getSubtotal_masuk());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_sembarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sembarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void perbaruiData(model_sembarangmasuk mod_masuk) {
        PreparedStatement st = null;
        String sql = "UPDATE sementara_barang_masuk SET nama_barang=?, harga =?, jml_masuk=?, subtotal_masuk=? WHERE kode_barang='"
                +mod_masuk.getMod_barang().getKode_barang()+"'";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_masuk.getMod_barang().getNama_barang());
            st.setLong(2, mod_masuk.getMod_barang().getHarga());
            st.setLong(3, mod_masuk.getMod_detmasuk().getJml_masuk());
            st.setLong(4, mod_masuk.getMod_detmasuk().getSubtotal_masuk());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(dao_sembarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sembarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusData(model_sembarangmasuk mod_masuk) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_barang_masuk WHERE kode_barang=? AND nama_barang=? AND harga=? AND jml_masuk=? "
                + "AND subtotal_masuk=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_masuk.getMod_barang().getKode_barang());
            st.setString(2, mod_masuk.getMod_barang().getNama_barang());
            st.setLong(3, mod_masuk.getMod_barang().getHarga());
            st.setLong(4, mod_masuk.getMod_detmasuk().getJml_masuk());
            st.setLong(5, mod_masuk.getMod_detmasuk().getSubtotal_masuk());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_sembarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_sembarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public model_sembarangmasuk getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_sembarangmasuk> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM sementara_barang_masuk";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_sembarangmasuk smt = new model_sembarangmasuk();
                model_barang brg = new model_barang();
                model_detbarangmasuk det_masuk = new model_detbarangmasuk();
                
                brg.setKode_barang(rs.getString("kode_barang"));
                brg.setNama_barang(rs.getString("nama_barang"));
                brg.setHarga(rs.getLong("harga"));
                
                det_masuk.setJml_masuk(rs.getInt("jml_masuk"));
                det_masuk.setSubtotal_masuk(rs.getLong("subtotal_masuk"));
                
                smt.setMod_barang(brg);
                smt.setMod_detmasuk(det_masuk);
                
                list.add(smt);
            }
            return list;
        } catch (SQLException ex) {
               Logger.getLogger(dao_sembarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sembarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sembarangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
}
