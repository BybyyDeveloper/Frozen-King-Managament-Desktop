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
import model.model_barangkeluar;
import model.model_pengguna;
import service.service_barangkeluar;

/**
 *
 * @author by
 */
public class dao_barangkeluar implements service_barangkeluar{

    private Connection conn;

    public dao_barangkeluar() {
    conn = koneksi.getConnection();
    }
    
    @Override
    public void tambahData(model_barangkeluar mod_keluar) {
        PreparedStatement st = null;
        String sql ="INSERT INTO barang_keluar (no_keluar, tgl_keluar, total_keluar, id_pengguna) VALUES (?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_keluar.getNo_keluar());
            st.setString(2, mod_keluar.getTgl_keluar());
            st.setLong(3, mod_keluar.getTotal_keluar());
            st.setString(4, mod_keluar.getMod_pengguna().getId_pengguna());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }}
    
    @Override
    public void hapusData(model_barangkeluar mod_keluar) {
        PreparedStatement st = null;
        String sql = "DELETE FROM barang_keluar WHERE no_keluar=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_keluar.getNo_keluar());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }}

    @Override
    public model_barangkeluar getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_barangkeluar> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM barang_keluar";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_barangkeluar brg = new model_barangkeluar();
                model_pengguna pgn = new model_pengguna();
                
                brg.setNo_keluar(rs.getString("no_keluar"));
                brg.setTgl_keluar(rs.getString("tgl_keluar"));
                brg.setTotal_keluar(rs.getLong("total_keluar"));
                pgn.setId_pengguna(rs.getString("id_pengguna"));
                
                brg.setMod_pengguna(pgn);
                list.add(brg);
            }
            return list;
        }catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }}

    @Override
    public List<model_barangkeluar> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM barang_keluar WHERE no_keluar LIKE '%" + id +
             "%' OR tgl_keluar LIKE '%" + id +
             "%' OR total_keluar LIKE '%" + id +
             "%' OR id_pengguna LIKE '%" + id + "%'";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_barangkeluar brg = new model_barangkeluar();
                model_pengguna pgn = new model_pengguna();
                
                brg.setNo_keluar(rs.getString("no_keluar"));
                brg.setTgl_keluar(rs.getString("tgl_keluar"));
                brg.setTotal_keluar(rs.getLong("total_keluar"));
                pgn.setId_pengguna(rs.getString("id_pengguna"));
                
                brg.setMod_pengguna(pgn);
                list.add(brg);
            }
            return list;
        }
        catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
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
       
       String sql = "SELECT RIGHT(no_keluar, 3) AS Nomor "+
                    "FROM barang_keluar "+
                    "WHERE no_keluar LIKE 'BK"+ no + "%' "+
                    "ORDER BY no_keluar DESC " + 
                    "LIMIT 1";
       try {
           st = conn.prepareStatement(sql);
           rs = st.executeQuery();
           
           if(rs.next()){
               int nomor = Integer.parseInt(rs.getString("Nomor"));
               nomor++;
               urutan = "BK" + no + String.format("%03d", nomor);
           }else {
               urutan = "BK" + no + "001";
           }
       }catch (SQLException ex){
           java.util.logging.Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_barangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
       return urutan;
    }
}
