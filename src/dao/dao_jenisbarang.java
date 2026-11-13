package dao;

import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import service.service_jenisbarang;
import model.model_jenisbarang;

public class dao_jenisbarang implements service_jenisbarang{
    
    private Connection connection;
    
    public dao_jenisbarang(){
        connection = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_jenisbarang mod_jenbar) {
       PreparedStatement st = null;
       String sql = "INSERT INTO jenis_barang(kode_jenis,nama_jenis) VALUES (?,?)";
       try{
           st = connection.prepareStatement(sql);
           
           st.setString(1, mod_jenbar.getKode_jenis());
           st.setString(2, mod_jenbar.getNama_jenis());
           
           st.executeUpdate();
       }catch (SQLException ex){
           Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
       } finally {
           if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
       }
    }

    @Override
    public void perbaruiData(model_jenisbarang mod_jenbar) {
        PreparedStatement st = null;
        String sql = "UPDATE jenis_barang SET nama_jenis=? WHERE kode_jenis=?";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_jenbar.getNama_jenis());
            st.setString(2, mod_jenbar.getKode_jenis());
            
            st.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Perbarui Data Gagal");
            Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public void hapusData(model_jenisbarang mod_jenbar) {
        PreparedStatement st = null;
        String sql = "DELETE FROM jenis_barang WHERE kode_jenis=?";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, mod_jenbar.getKode_jenis());
            
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }
    }

    @Override
    public model_jenisbarang getByid(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        model_jenisbarang mokat = null;
        String sql = "SELECT * FROM jenis_barang WHERE kode_jenis=?";
        try {
            st = connection.prepareStatement(sql);
            model_jenisbarang ang = new model_jenisbarang();
            st.setString(1, ang.getKode_jenis());
            st.setString(2, ang.getNama_jenis());
            
            rs = st.executeQuery();
            while (rs.next()){
                mokat = new model_jenisbarang();
                mokat.setKode_jenis(rs.getString("kode_jenis"));
                mokat.setNama_jenis(rs.getString("nama_jenis"));
            }
            return mokat;
        }catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_jenisbarang> ambilData() {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM jenis_barang";
        try{
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                model_jenisbarang mokat = new model_jenisbarang();
                mokat.setKode_jenis(rs.getString("kode_jenis"));
                mokat.setNama_jenis(rs.getString("nama_jenis"));
                
                list.add(mokat);
            }
            return list;
        }catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_jenisbarang> pencarian(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT * FROM jenis_barang WHERE kode_jenis LIKE '%"+id+
                     "%' OR nama_jenis LIKE '%"+id+"%'";
        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_jenisbarang mokat = new model_jenisbarang();
                mokat.setKode_jenis(rs.getString("kode_jenis"));
                mokat.setNama_jenis(rs.getString("nama_jenis"));
                
                list.add(mokat);
            }
            return list;
        }
        catch (SQLException ex) {
           java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public String nomor() {
       PreparedStatement st = null;
       ResultSet rs = null;
       String urutan = null;
       
       String sql = "SELECT RIGHT(kode_jenis,3) AS Nomor FROM jenis_barang ORDER BY Nomor DESC LIMIT 1";
       try {
           st = connection.prepareStatement(sql);
           rs = st.executeQuery();
           
           if(rs.next()){
               int nomor = Integer.parseInt(rs.getString("Nomor"));
               nomor++;
               urutan = String.format("JB%03d", nomor);
           }else {
               urutan = "JB001";
           }
       }catch (SQLException ex){
           java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
       return urutan;
    }

    @Override
    public boolean validasiNamaJenisBarang(model_jenisbarang mod_jenbar) {
       PreparedStatement st = null;
       ResultSet rs = null;
       boolean valid = false;
       
       String sql = "SELECT nama_jenis FROM jenis_barang WHERE kode_jenis!='"+mod_jenbar.getKode_jenis()+
                    "' AND nama_jenis LIKE BINARY '"+mod_jenbar.getNama_jenis()+"'";
       try {
           st = connection.prepareStatement(sql);
           rs = st.executeQuery();
           if(rs.next()){
               JOptionPane.showMessageDialog(null, "Nama Jenis Barang Telah ada\nSilakan Ganti Nama Jenis Barang Yang Lain","Peringatan",JOptionPane.WARNING_MESSAGE);
           }else {
               valid = true;
           }
       }catch (SQLException ex){
           java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
       }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    java.util.logging.Logger.getLogger(dao_jenisbarang.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
       return valid;
    }
}
