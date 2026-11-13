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
import model.model_pemesanan;
import model.model_pengguna;
import model.model_supplier;
import service.service_pemesanan;

/**
 *
 * @author by
 */
public class dao_pemesanan implements service_pemesanan{

    private Connection conn;

    public dao_pemesanan() {
        conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_pemesanan mod_pesan) {
        PreparedStatement st = null;
        String sql ="INSERT INTO pemesanan (no_pesan, tgl_pesan, total_pesan, id_supplier, id_pengguna) VALUES (?,?,?,?,?)";
        try {
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_pesan.getNo_pesan());
            st.setString(2, mod_pesan.getTgl_pesan());
            st.setLong(3, mod_pesan.getTotal_pesan());
            st.setString(4, mod_pesan.getMod_supplier().getId_supplier());
            st.setString(5, mod_pesan.getMod_pengguna().getId_pengguna());
            
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public model_pemesanan getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_pemesanan> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pemesanan";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_pemesanan psn = new model_pemesanan();
                model_supplier spl = new model_supplier();
                model_pengguna pgn = new model_pengguna();
                
                psn.setNo_pesan(rs.getString("no_pesan"));
                psn.setTgl_pesan(rs.getString("tgl_pesan"));
                psn.setTotal_pesan(rs.getLong("total_pesan"));
                spl.setId_supplier(rs.getString("id_supplier"));
                pgn.setId_pengguna(rs.getString("id_pengguna"));
                
                psn.setMod_supplier(spl);
                psn.setMod_pengguna(pgn);
                list.add(psn);
            }
            return list;
        }catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_pemesanan> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM pemesanan WHERE no_pesan LIKE '%" + id + "%' " +
                     "OR tgl_pesan LIKE '%" + id + "%' " +
                     "OR total_pesan LIKE '%" + id + "%' " +
                     "OR id_supplier LIKE '%" + id + "%'";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_pemesanan psn = new model_pemesanan();
                model_supplier sup = new model_supplier();
                model_pengguna pgn = new model_pengguna();
                
                psn.setNo_pesan(rs.getString("no_pesan"));
                psn.setTgl_pesan(rs.getString("tgl_pesan"));
                psn.setTotal_pesan(rs.getLong("total_pesan"));
                sup.setId_supplier(rs.getString("id_supplier"));
                pgn.setId_pengguna(rs.getString("id_pengguna"));
                
                psn.setMod_pengguna(pgn);
                psn.setMod_supplier(sup);
                
                list.add(psn);
            }
            return list;
        }
        catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
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
       
       String sql = "SELECT RIGHT(no_pesan, 3) AS Nomor "+
                    "FROM pemesanan "+
                    "WHERE no_pesan LIKE 'PB"+ no + "%' "+
                    "ORDER BY no_pesan DESC " + 
                    "LIMIT 1";
       try {
           st = conn.prepareStatement(sql);
           rs = st.executeQuery();
           
           if(rs.next()){
               int nomor = Integer.parseInt(rs.getString("Nomor"));
               nomor++;
               urutan = "PB" + no + String.format("%03d", nomor);
           }else {
               urutan = "PB" + no + "001";
           }
       }catch (SQLException ex){
           java.util.logging.Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
       return urutan;
    }

    @Override
    public void perbaruiData(model_pemesanan mod_pesan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hapusData(model_pemesanan mod_pesan) {
        PreparedStatement st = null;
        String sql = "DELETE FROM pemesanan WHERE no_pesan=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_pesan.getNo_pesan());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_pemesanan.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }
    
   
}
