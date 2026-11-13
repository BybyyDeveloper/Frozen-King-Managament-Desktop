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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.model_barangmasuk;
import model.model_pemesanan;
import model.model_pengguna;
import model.model_supplier;
import service.service_barangmasuk;

/**
 *
 * @author by
 */
public class dao_barangmasuk implements service_barangmasuk{
    private Connection conn;

    public dao_barangmasuk() {
    conn = koneksi.getConnection();
    }
    
    @Override
    public void tambahData(model_barangmasuk mod_masuk) {
        PreparedStatement st = null;
        String sql ="INSERT INTO barang_masuk (no_masuk, tgl_masuk, total_masuk, id_supplier, id_pengguna) VALUES (?,?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_masuk.getNo_masuk());
            st.setString(2, mod_masuk.getTgl_masuk());
            st.setLong(3, mod_masuk.getTotal_masuk());
            st.setString(4, mod_masuk.getMod_supplier().getId_supplier());
            st.setString(5, mod_masuk.getMod_pengguna().getId_pengguna());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
    @Override
    public void hapusData(model_barangmasuk mod_masuk) {
        PreparedStatement st = null;
        String sql = "DELETE FROM barang_masuk WHERE no_masuk=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_masuk.getNo_masuk());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }
    
    @Override
    public void perbaruiStatur(String kode_barang) {
        PreparedStatement st = null;
        String sql = "UPDATE detail_pemasanan SET status='Barang Telah Datang' WHERE kode_barang='"+kode_barang+"'";
        
        try{
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"Gagal Perbarui Status Barang");
            java.util.logging.Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    

    @Override
    public model_barangmasuk getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_barangmasuk> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM barang_masuk";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_barangmasuk masuk = new model_barangmasuk();
                model_supplier spl = new model_supplier();
                model_pengguna pgn = new model_pengguna();
                
                masuk.setNo_masuk(rs.getString("no_masuk"));
                masuk.setTgl_masuk(rs.getString("tgl_masuk"));
                masuk.setTotal_masuk(rs.getLong("total_masuk"));
                spl.setId_supplier(rs.getString("id_supplier"));
                pgn.setId_pengguna(rs.getString("id_pengguna"));
                
                masuk.setMod_supplier(spl);
                masuk.setMod_pengguna(pgn);
                list.add(masuk);
            }
            return list;
        }catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_barangmasuk> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM barang_masuk WHERE no_masuk LIKE '%"+id+
                     "%' OR tgl_masuk LIKE '%"+id+
                     "%' OR total_masuk LIKE '%"+id+
                     "%' OR id_supplier LIKE '%"+id+ "%'";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_barangmasuk psn = new model_barangmasuk();
                model_supplier sup = new model_supplier();
                model_pengguna pgn = new model_pengguna();
                
                psn.setNo_masuk(rs.getString("no_masuk"));
                psn.setTgl_masuk(rs.getString("tgl_masuk"));
                psn.setTotal_masuk(rs.getLong("total_masuk"));
                sup.setId_supplier(rs.getString("id_supplier"));
                pgn.setId_pengguna(rs.getString("id_pengguna"));
                
                psn.setMod_pengguna(pgn);
                psn.setMod_supplier(sup);
                
                list.add(psn);
            }
            return list;
        }
        catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangmasuk.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public String nomor() {
       PreparedStatement st = null;
       ResultSet rs = null;
       String urutan = null;
       
       Date now = new Date();
       SimpleDateFormat tanggal = new SimpleDateFormat("yyyy-MM-dd");
       SimpleDateFormat noformat = new SimpleDateFormat("yyMMdd");
       String tgl = tanggal.format(now);
       String no = noformat.format(now);
       
       String sql = "SELECT RIGHT(no_masuk, 3) AS Nomor "+
                    "FROM barang_masuk "+
                    "WHERE no_masuk LIKE 'BM"+ no + "%' "+
                    "ORDER BY no_masuk DESC " + 
                    "LIMIT 1";
       try {
           st = conn.prepareStatement(sql);
           rs = st.executeQuery();
           
           if(rs.next()){
               int nomor = Integer.parseInt(rs.getString("Nomor"));
               nomor++;
               urutan = "BM" + no + String.format("%03d", nomor);
           }else {
               urutan = "BM" + no + "001";
           }
       }catch (SQLException ex){
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
       return urutan;
    }
}   
