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
import model.model_detpenjualan;
import model.model_sempenjualan;

/**
 *
 * @author by
 */
public class dao_sempenjualan implements service.service_sempenjualan{
private Connection conn;

    public dao_sempenjualan() {
        conn = koneksi.getConnection();
    }
    
    @Override
    public void tambahData(model_sempenjualan mod_penjualan) {
        PreparedStatement st = null;
        String sql ="INSERT INTO sementara_penjualan (kode_barang, nama_barang, harga, jml_jual, subtotal_jual) VALUES (?,?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_penjualan.getMod_barang().getKode_barang());
            st.setString(2, mod_penjualan.getMod_barang().getNama_barang());
            st.setLong(3, mod_penjualan.getMod_barang().getHarga());
            st.setLong(4, mod_penjualan.getMod_detpenjualan().getJml_jual());
            st.setLong(5, mod_penjualan.getMod_detpenjualan().getSubtotal_jual());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_sempenjualan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sempenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }}

    @Override
    public void perbaruiData(model_sempenjualan mod_penjualan) {
        PreparedStatement st = null;
        String sql = "UPDATE sementara_penjualan SET nama_barang=?, harga =?, jml_jual=?, subtotal_jual=? WHERE kode_barang='"
                +mod_penjualan.getMod_barang().getKode_barang()+"'";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_penjualan.getMod_barang().getNama_barang());
            st.setLong(2, mod_penjualan.getMod_barang().getHarga());
            st.setLong(3, mod_penjualan.getMod_detpenjualan().getJml_jual());
            st.setLong(4, mod_penjualan.getMod_detpenjualan().getSubtotal_jual());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(dao_sempenjualan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sempenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public void hapusData(model_sempenjualan mod_penjualan) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_penjualan WHERE kode_barang=? AND nama_barang=? AND harga=? AND jml_jual=? "
                + "AND subtotal_jual=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_penjualan.getMod_barang().getKode_barang());
            st.setString(2, mod_penjualan.getMod_barang().getNama_barang());
            st.setLong(3, mod_penjualan.getMod_barang().getHarga());
            st.setLong(4, mod_penjualan.getMod_detpenjualan().getJml_jual());
            st.setLong(5, mod_penjualan.getMod_detpenjualan().getSubtotal_jual());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_sempenjualan.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_sempenjualan.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }}

    @Override
    public model_sempenjualan getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_sempenjualan> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM sementara_penjualan";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_sempenjualan pjl = new model_sempenjualan();
                model_barang brg = new model_barang();
                model_detpenjualan det_penjualan = new model_detpenjualan();
                
                brg.setKode_barang(rs.getString("kode_barang"));
                brg.setNama_barang(rs.getString("nama_barang"));
                brg.setHarga(rs.getLong("harga"));
                
                det_penjualan.setJml_jual(rs.getInt("jml_jual"));
                det_penjualan.setSubtotal_jual(rs.getLong("subtotal_jual"));
                
                pjl.setMod_barang(brg);
                pjl.setMod_detpenjualan(det_penjualan);
                
                list.add(pjl);
            }
            return list;
        } catch (SQLException ex) {
               Logger.getLogger(dao_sempenjualan.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sempenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_sempenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
}
