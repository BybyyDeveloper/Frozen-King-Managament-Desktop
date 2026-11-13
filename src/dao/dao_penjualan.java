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
import model.model_penjualan;
import model.model_member;
import service.service_penjualan;

/**
 *
 * @author by
 */
public class dao_penjualan implements service_penjualan{

    private Connection conn;

    public dao_penjualan() {
    conn = koneksi.getConnection();
    }
    
    @Override
    public void tambahData(model_penjualan mod_penjualan) {
    PreparedStatement st = null;
    String sql = "INSERT INTO penjualan (no_jual, tgl_jual, total_jual, pembayaran, id_member) VALUES (?,?,?,?,?)";
    try {
        st = conn.prepareStatement(sql);

        st.setString(1, mod_penjualan.getNo_jual());
        st.setString(2, mod_penjualan.getTgl_jual());

        // kalau null kasih default 0
        st.setLong(3, mod_penjualan.getTotal_jual() == null ? 0L : mod_penjualan.getTotal_jual());
        st.setDouble(4, mod_penjualan.getPembayaran() == null ? 0.0 : mod_penjualan.getPembayaran());

        // cek dulu biar ga null pointer
        if (mod_penjualan.getMod_member() != null) {
            st.setString(5, mod_penjualan.getMod_member().getId_member());
        } else {
            st.setNull(5, java.sql.Types.VARCHAR);
        }

        st.executeUpdate();
    } catch (SQLException ex) {
        Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException ex) {
                Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

    
    @Override
    public void hapusData(model_penjualan mod_penjualan) {
        PreparedStatement st = null;
        String sql = "DELETE FROM penjualan WHERE no_jual=?";
        try{
            st = conn.prepareStatement(sql);
            
            st.setString(1, mod_penjualan.getNo_jual());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }}

    @Override
    public model_penjualan getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_penjualan> getData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM penjualan";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_penjualan pjual = new model_penjualan();
                model_member mbm = new model_member();
                
                pjual.setNo_jual(rs.getString("no_jual"));
                pjual.setTgl_jual(rs.getString("tgl_jual"));
                pjual.setTotal_jual(rs.getLong("total_jual"));
                pjual.setPembayaran(rs.getDouble("pembayaran"));
                mbm.setId_member(rs.getString("id_member"));
                
                pjual.setMod_member(mbm);
                list.add(pjual);
            }
            return list;
        }catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }}

    @Override
    public List<model_penjualan> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM penjualan WHERE no_jual LIKE '%" + id +
             "%' OR tgl_jual LIKE '%" + id +
             "%' OR total_jual LIKE '%" + id +
             "%' OR id_member LIKE '%" + id + "%'";

        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_penjualan pjual = new model_penjualan();
                model_member mbm = new model_member();
                
                pjual.setNo_jual(rs.getString("no_jual"));
                pjual.setTgl_jual(rs.getString("tgl_jual"));
                pjual.setTotal_jual(rs.getLong("total_jual"));
                mbm.setId_member(rs.getString("id_member"));
                
                pjual.setMod_member(mbm);
                list.add(pjual);
            }
            return list;
        }
        catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
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
       
       String sql = "SELECT RIGHT(no_jual, 3) AS Nomor "+
                    "FROM penjualan "+
                    "WHERE no_jual LIKE 'PJ"+ no + "%' "+
                    "ORDER BY no_jual DESC " + 
                    "LIMIT 1";
       try {
           st = conn.prepareStatement(sql);
           rs = st.executeQuery();
           
           if(rs.next()){
               int nomor = Integer.parseInt(rs.getString("Nomor"));
               nomor++;
               urutan = "PJ" + no + String.format("%03d", nomor);
           }else {
               urutan = "PJ" + no + "001";
           }
       }catch (SQLException ex){
           java.util.logging.Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_penjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
       return urutan;
    }
}
