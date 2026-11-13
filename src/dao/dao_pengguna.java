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
import model.model_pengguna;
import sun.security.util.Password;

/**
 *
 * @author by
 */
public class dao_pengguna implements service.service_pengguna{

    private Connection connection;
    
    public dao_pengguna() {
        connection = koneksi.getConnection();
}
   
    @Override
    public void tambahData(model_pengguna mod_pengguna) {
       PreparedStatement st = null;
       String sql = "INSERT INTO user(id_user,nama,username,password,telp_user,alamat_user,jabatan) VALUES (?,?,?,?,?,?,?)";
       try{
           st = connection.prepareStatement(sql);
           
           st.setString(1, mod_pengguna.getId_pengguna());
           st.setString(2, mod_pengguna.getNama_pengguna());
           st.setString(3, mod_pengguna.getUsername());
           st.setString(4, encrypt.getmd5java(mod_pengguna.getPassword()));
           st.setString(5, mod_pengguna.getTelp_pengguna());
           st.setString(6, mod_pengguna.getAlamat_pengguna());
           st.setString(7, mod_pengguna.getJabatan());
           
           st.executeUpdate();
       }catch (SQLException ex){
           Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
       } finally {
           if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
       }
    }


    @Override
    public void perbaruiData(model_pengguna mod_pengguna) {
        PreparedStatement st = null;
        String sql = "UPDATE user SET nama=?,username=?,telp_user=?,alamat_user=?,jabatan=? WHERE id_user=?";
        try{
           st = connection.prepareStatement(sql);
            
           st.setString(1, mod_pengguna.getNama_pengguna());
           st.setString(2, mod_pengguna.getUsername());
//           st.setString(4, encrypt.getmd5java(mod_pengguna.getPassword()));
           st.setString(3, mod_pengguna.getTelp_pengguna());
           st.setString(4, mod_pengguna.getAlamat_pengguna());
           st.setString(5, mod_pengguna.getJabatan());
           st.setString(6, mod_pengguna.getId_pengguna());
            
            st.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public void hapusData(model_pengguna mod_pengguna) {
        PreparedStatement st = null;
        String sql = "DELETE FROM user WHERE id_user=?";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_pengguna.getId_pengguna());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public model_pengguna getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_pengguna> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM user";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_pengguna mopeng = new model_pengguna();
                mopeng.setId_pengguna(rs.getString("id_user"));
                mopeng.setNama_pengguna(rs.getString("nama"));
                mopeng.setUsername(rs.getString("username"));
                mopeng.setTelp_pengguna(rs.getString("telp_user"));
                mopeng.setAlamat_pengguna(rs.getString("alamat_user"));
                mopeng.setJabatan(rs.getString("jabatan"));
                
                list.add(mopeng);
            }
            return list;
        }catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_pengguna> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM user WHERE id_user LIKE '%"+id+
                     "%' OR nama LIKE '%"+id+"%' OR username LIKE '%"+id+"%' OR telp_user LIKE '%"+id+"%' ";
        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_pengguna mopeng = new model_pengguna();
                mopeng.setId_pengguna(rs.getString("id_user"));
                mopeng.setNama_pengguna(rs.getString("nama"));
                mopeng.setUsername(rs.getString("username"));
                mopeng.setTelp_pengguna(rs.getString("telp_user"));
                mopeng.setAlamat_pengguna(rs.getString("alamat_user"));
                mopeng.setJabatan(rs.getString("jabatan"));
                
                list.add(mopeng);
            }
            return list;
        }
        catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
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
       
       String sql = "SELECT RIGHT(id_user, 3) AS Nomor "+
                    "FROM user "+
                    "WHERE id_user LIKE 'PGW"+ no + "%' "+
                    "ORDER BY id_user DESC " + 
                    "LIMIT 1";
       try {
           st = connection.prepareStatement(sql);
           rs = st.executeQuery();
           
           if(rs.next()){
               int nomor = Integer.parseInt(rs.getString("Nomor"));
               nomor++;
               urutan = "PGW" + no + String.format("%03d", nomor);
           }else {
               urutan = "PGW" + no + "001";
           }
       }catch (SQLException ex){
           java.util.logging.Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_pengguna.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
       return urutan;
    }
    
    @Override
    public boolean validateOldPassword(String username, String oldPassword) {
        String encryptedOldPassword = encrypt.getmd5java(oldPassword);
        //return userDao.validateOldPassword(koneksi.getConnection(), username, encryptedOldPassword);
        try{
           String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
           PreparedStatement st = connection.prepareStatement(sql);
           st.setString(1, username);
           st.setString(2, encryptedOldPassword);
           ResultSet rs = st.executeQuery();
           return rs.next();
        }catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
    
    @Override
    public boolean changePassword(String username,String oldPassword, String newPassword) {
        
        String encryptedNewPassword = encrypt.getmd5java(newPassword);
        String encryptedOldPassword = encrypt.getmd5java(oldPassword);
        try{
           String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
           PreparedStatement st = connection.prepareStatement(sql); 
           st.setString(1, username);
           st.setString(2, encryptedOldPassword);
           ResultSet rs = st.executeQuery();
           if (rs.next()){
               String sqlUpdate = "UPDATE user SET password = ? WHERE username = ?";
               PreparedStatement stUpdate = connection.prepareStatement(sqlUpdate);
               stUpdate.setString(1, encryptedNewPassword);
               stUpdate.setString(2, username);
               int result = stUpdate.executeUpdate();
               return result > 0;
           }else {
               return false;
           }
        }catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
