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
import model.model_detbarangkeluar;
import model.model_sembarangkeluar;

/**
 *
 * @author by
 */
public class dao_sembarangkeluar implements service.service_sembarangkeluar{
private Connection conn;

    public dao_sembarangkeluar() {
        conn = koneksi.getConnection();
    }
    
    @Override
    public void tambahData(model_sembarangkeluar mod_keluar) {
        PreparedStatement st = null;
        String sql ="INSERT INTO sementara_barang_keluar (kode_barang, nama_barang, harga, jml_keluar, subtotal_keluar) VALUES (?,?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_keluar.getMod_barang().getKode_barang());
            st.setString(2, mod_keluar.getMod_barang().getNama_barang());
            st.setLong(3, mod_keluar.getMod_barang().getHarga());
            st.setLong(4, mod_keluar.getMod_detkeluar().getJml_keluar());
            st.setLong(5, mod_keluar.getMod_detkeluar().getSubtotal_keluar());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_sembarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sembarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }}

    @Override
    public void perbaruiData(model_sembarangkeluar mod_keluar) {
        PreparedStatement st = null;
        String sql = "UPDATE sementara_barang_keluar SET nama_barang=?, harga =?, jml_keluar=?, subtotal_keluar=? WHERE kode_barang='"
                +mod_keluar.getMod_barang().getKode_barang()+"'";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_keluar.getMod_barang().getNama_barang());
            st.setLong(2, mod_keluar.getMod_barang().getHarga());
            st.setLong(3, mod_keluar.getMod_detkeluar().getJml_keluar());
            st.setLong(4, mod_keluar.getMod_detkeluar().getSubtotal_keluar());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(dao_sembarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sembarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusData(model_sembarangkeluar mod_keluar) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_barang_keluar WHERE kode_barang=? AND nama_barang=? AND harga=? AND jml_keluar=? "
                + "AND subtotal_keluar=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_keluar.getMod_barang().getKode_barang());
            st.setString(2, mod_keluar.getMod_barang().getNama_barang());
            st.setLong(3, mod_keluar.getMod_barang().getHarga());
            st.setLong(4, mod_keluar.getMod_detkeluar().getJml_keluar());
            st.setLong(5, mod_keluar.getMod_detkeluar().getSubtotal_keluar());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_sembarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_sembarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }}

    @Override
    public model_sembarangkeluar getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_sembarangkeluar> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM sementara_barang_keluar";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_sembarangkeluar smt = new model_sembarangkeluar();
                model_barang brg = new model_barang();
                model_detbarangkeluar det_keluar = new model_detbarangkeluar();
                
                brg.setKode_barang(rs.getString("kode_barang"));
                brg.setNama_barang(rs.getString("nama_barang"));
                brg.setHarga(rs.getLong("harga"));
                
                det_keluar.setJml_keluar(rs.getInt("jml_keluar"));
                det_keluar.setSubtotal_keluar(rs.getLong("subtotal_keluar"));
                
                smt.setMod_barang(brg);
                smt.setMod_detkeluar(det_keluar);
                
                list.add(smt);
            }
            return list;
        } catch (SQLException ex) {
               Logger.getLogger(dao_sembarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sembarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sembarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
}
