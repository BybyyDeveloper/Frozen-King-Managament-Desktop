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
import model.model_supplier;

/**
 *
 * @author by
 */
public class dao_supplier implements service.service_supplier{

    private Connection connection;
    
    public dao_supplier() {
        connection = koneksi.getConnection();
}
    
    @Override
    public void tambahData(model_supplier mod_sup) {
       PreparedStatement st = null;
       String sql = "INSERT INTO supplier(id_supplier,nama_supplier,telp_supplier,alamat_supplier) VALUES (?,?,?,?)";
       try{
           st = connection.prepareStatement(sql);
           
           st.setString(1, mod_sup.getId_supplier());
           st.setString(2, mod_sup.getNama_supplier());
           st.setString(3, mod_sup.getTelp_supplier());
           st.setString(4, mod_sup.getAlamat_supplier());
           
           st.executeUpdate();
       }catch (SQLException ex){
           Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
       } finally {
           if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
       }
    }

    @Override
    public void perbaruiData(model_supplier mod_sup) {
        PreparedStatement st = null;
        String sql = "UPDATE supplier SET nama_supplier=?,telp_supplier=?,alamat_supplier=? WHERE id_supplier=?";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_sup.getNama_supplier());
            st.setString(2, mod_sup.getTelp_supplier());
            st.setString(3, mod_sup.getAlamat_supplier());
            st.setString(4, mod_sup.getId_supplier());
            
            st.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public void hapusData(model_supplier mod_sup) {
        PreparedStatement st = null;
        String sql = "DELETE FROM supplier WHERE id_supplier=?";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_sup.getId_supplier());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public model_supplier getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_supplier> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supplier";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_supplier mosup = new model_supplier();
                mosup.setId_supplier(rs.getString("id_supplier"));
                mosup.setNama_supplier(rs.getString("nama_supplier"));
                mosup.setTelp_supplier(rs.getString("telp_supplier"));
                mosup.setAlamat_supplier(rs.getString("alamat_supplier"));
                
                list.add(mosup);
            }
            return list;
        }catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }
    
    @Override
    public List<model_supplier> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM supplier WHERE id_supplier LIKE '%"+id+
                     "%' OR nama_supplier LIKE '%"+id+"%' OR telp_supplier LIKE '%"+id+"%'";
        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_supplier mosup = new model_supplier();
                mosup.setId_supplier(rs.getString("id_supplier"));
                mosup.setNama_supplier(rs.getString("nama_supplier"));
                mosup.setTelp_supplier(rs.getString("telp_supplier"));
                mosup.setAlamat_supplier(rs.getString("alamat_supplier"));
                
                list.add(mosup);
            }
            return list;
        }
        catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
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
       
       String sql = "SELECT RIGHT(id_supplier, 3) AS Nomor "+
                    "FROM supplier "+
                    "WHERE id_supplier LIKE 'SP"+ no + "%' "+
                    "ORDER BY id_supplier DESC " + 
                    "LIMIT 1";
       try {
           st = connection.prepareStatement(sql);
           rs = st.executeQuery();
           
           if(rs.next()){
               int nomor = Integer.parseInt(rs.getString("Nomor"));
               nomor++;
               urutan = "SP" + no + String.format("%03d", nomor);
           }else {
               urutan = "SP" + no + "001";
           }
       }catch (SQLException ex){
           java.util.logging.Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_supplier.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
       return urutan;
    }
}