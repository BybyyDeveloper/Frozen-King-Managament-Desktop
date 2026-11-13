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
import model.model_detpemesanan;
import model.model_sempemesanan;
import service.service_sempemesanan;

/**
 *
 * @author by
 */
public class dao_sempemesanan implements service_sempemesanan{
    
    private Connection conn;

    public dao_sempemesanan() {
        conn = koneksi.getConnection();
    }
    
    @Override
    public void tambahData(model_sempemesanan mod_pesan) {
        PreparedStatement st = null;
        String sql ="INSERT INTO sementara_pemesanan (kode_barang, nama_barang, harga, jml_pesan, subtotal_pesan, status) VALUES (?,?,?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_pesan.getMod_barang().getKode_barang());
            st.setString(2, mod_pesan.getMod_barang().getNama_barang());
            st.setLong(3, mod_pesan.getMod_barang().getHarga());
            st.setLong(4, mod_pesan.getMod_detpesan().getJml_pesan());
            st.setLong(5, mod_pesan.getMod_detpesan().getSubtotal());
            st.setString(6, mod_pesan.getMod_detpesan().getStatus());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_sempemesanan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sempemesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void perbaruiData(model_sempemesanan mod_sempesan) {
        PreparedStatement st = null;
        String sql = "UPDATE sementara_pemesanan SET nama_barang=?, harga =?, jml_pesan=?, subtotal_pesan=? WHERE kode_barang='"
                +mod_sempesan.getMod_barang().getKode_barang()+"'";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_sempesan.getMod_barang().getNama_barang());
            st.setLong(2, mod_sempesan.getMod_barang().getHarga());
            st.setLong(3, mod_sempesan.getMod_detpesan().getJml_pesan());
            st.setLong(4, mod_sempesan.getMod_detpesan().getSubtotal());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(dao_sempemesanan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sempemesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
     }

    @Override
    public void hapusData(model_sempemesanan mod_pesan) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_pemesanan WHERE kode_barang=? AND nama_barang=? AND harga=? AND jml_pesan=? "
                + "AND subtotal_pesan=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_pesan.getMod_barang().getKode_barang());
            st.setString(2, mod_pesan.getMod_barang().getNama_barang());
            st.setLong(3, mod_pesan.getMod_barang().getHarga());
            st.setLong(4, mod_pesan.getMod_detpesan().getJml_pesan());
            st.setLong(5, mod_pesan.getMod_detpesan().getSubtotal());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_sempemesanan.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_sempemesanan.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public model_sempemesanan getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_sempemesanan> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM sementara_pemesanan";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_sempemesanan smt = new model_sempemesanan();
                model_barang brg = new model_barang();
                model_detpemesanan det_psn = new model_detpemesanan();
                
                brg.setKode_barang(rs.getString("kode_barang"));
                brg.setNama_barang(rs.getString("nama_barang"));
                brg.setHarga(rs.getLong("harga"));
                
                det_psn.setJml_pesan(rs.getLong("jml_pesan"));
                det_psn.setSubtotal(rs.getLong("subtotal_pesan"));
                
                smt.setMod_barang(brg);
                smt.setMod_detpesan(det_psn);
                
                list.add(smt);
            }
            return list;
        } catch (SQLException ex) {
               Logger.getLogger(dao_sempemesanan.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sempemesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
    
}
