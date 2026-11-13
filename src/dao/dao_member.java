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
import model.model_member;
import sun.security.util.Password;

/**
 *
 * @author by
 */
public class dao_member implements service.service_member{

    private Connection connection;
    
    public dao_member() {
        connection = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_member mod_member) {
       PreparedStatement st = null;
       String sql = "INSERT INTO member(id_member,nama_member,telp_member,alamat_member) VALUES (?,?,?,?)";
       try{
           st = connection.prepareStatement(sql);
           
           st.setString(1, mod_member.getId_member());
           st.setString(2, mod_member.getNama_member());
           st.setString(3, mod_member.getTelp_member());
           st.setString(4, mod_member.getAlamat_member());
           
           st.executeUpdate();
       }catch (SQLException ex){
           Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
       } finally {
           if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
       }
    }

    @Override
    public void hapusData(model_member mod_member) {
        PreparedStatement st = null;
        String sql = "DELETE FROM member WHERE id_member=?";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_member.getId_member());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public void perbaruiData(model_member mod_member) {
        PreparedStatement st = null;
        String sql = "UPDATE member SET nama_member=?,telp_member=?,alamat_member =? WHERE id_member=?";
        try{
           st = connection.prepareStatement(sql);
            
           st.setString(1, mod_member.getNama_member());
           st.setString(2, mod_member.getTelp_member());
           st.setString(3, mod_member.getAlamat_member());
           st.setString(4, mod_member.getId_member());
            
            st.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public model_member getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_member> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM member";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_member momem = new model_member();
                momem.setId_member(rs.getString("id_member"));
                momem.setNama_member(rs.getString("nama_member"));
                momem.setTelp_member(rs.getString("telp_member"));
                momem.setAlamat_member(rs.getString("alamat_member"));
                
                list.add(momem);
            }
            return list;
        }catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_member> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM member WHERE id_member LIKE '%"+id+
                     "%' OR nama_member LIKE '%"+id+"%' OR telp_member LIKE '%"+id+"%' OR alamat_member LIKE '%"+id+"%' ";
        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_member momem = new model_member();
                momem.setId_member(rs.getString("id_member"));
                momem.setNama_member(rs.getString("nama_member"));
                momem.setTelp_member(rs.getString("telp_member"));
                momem.setAlamat_member(rs.getString("alamat_member"));
                
                list.add(momem);
            }
            return list;
        }
        catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
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
       SimpleDateFormat noformat = new SimpleDateFormat("yyMM");
       String tgl = tanggal.format(now);
       String no = noformat.format(now);
       
       String sql = "SELECT RIGHT(id_member, 3) AS Nomor "+
                    "FROM member "+
                    "WHERE id_member LIKE 'MEM"+ no + "%' "+
                    "ORDER BY id_member DESC " + 
                    "LIMIT 1";
       try {
           st = connection.prepareStatement(sql);
           rs = st.executeQuery();
           
           if(rs.next()){
               int nomor = Integer.parseInt(rs.getString("Nomor"));
               nomor++;
               urutan = "MEM" + no + String.format("%03d", nomor);
           }else {
               urutan = "MEM" + no + "001";
           }
       }catch (SQLException ex){
           java.util.logging.Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_member.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
       return urutan;
    }
}   