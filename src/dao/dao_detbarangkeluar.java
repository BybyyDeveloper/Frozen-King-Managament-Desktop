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
import model.model_barang;
import model.model_barangkeluar;
import model.model_detbarangkeluar;
import service.service_detbarangkeluar;

/**
 *
 * @author by
 */
public class dao_detbarangkeluar implements service_detbarangkeluar{

    private Connection conn;

    public dao_detbarangkeluar() {
    conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_detbarangkeluar mod_detkeluar) {
        PreparedStatement st = null;
        String sql ="INSERT INTO detail_barang_keluar (no_keluar, kode_barang, jml_keluar, subtotal_keluar) SELECT '"
                + mod_detkeluar.getMod_keluar().getNo_keluar()+"', kode_barang, jml_keluar, subtotal_keluar FROM "
                + "sementara_barang_keluar";
        try {
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_detbarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detbarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }  
    }

    @Override
    public void sumTotal(model_detbarangkeluar mod_detkeluar) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT SUM(subtotal_keluar) FROM sementara_barang_keluar";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                mod_detkeluar.setSubtotal_keluar(rs.getLong(1));
            }
        }catch (SQLException ex) {
           Logger.getLogger(dao_detbarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detbarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }}

    @Override
    public void hapusSementara(model_detbarangkeluar mod_detkeluar) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_barang_keluar";
        try{
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_detbarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_detbarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }}

    @Override
    public model_detbarangkeluar getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_detbarangkeluar> getData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT det_keluar.no_keluar, det_keluar.kode_barang, brg.nama_barang, "
                + "brg.harga, det_keluar.jml_keluar, det_keluar.subtotal_keluar "
                +"FROM detail_barang_keluar det_keluar "
                +"INNER JOIN barang_keluar keluar ON keluar.no_keluar = det_keluar.no_keluar "
                +"INNER JOIN barang brg ON brg.kode_barang = det_keluar.kode_barang "
                +"WHERE det_keluar.no_keluar='"+id+"' ORDER BY no_keluar ASC";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_barangkeluar keluar = new model_barangkeluar();
                model_detbarangkeluar det_keluar = new model_detbarangkeluar();
                model_barang brg = new model_barang();
                
                keluar.setNo_keluar(String.valueOf(rs.getString("det_keluar.no_keluar")));
                det_keluar.setMod_keluar(keluar);
                
                brg.setKode_barang(rs.getString("kode_barang"));
                brg.setNama_barang(rs.getString("nama_barang"));
                brg.setHarga(rs.getLong("harga"));
                det_keluar.setJml_keluar(rs.getInt("jml_keluar"));
                det_keluar.setSubtotal_keluar(rs.getLong("subtotal_keluar"));
                
                det_keluar.setMod_barang(brg);
                list.add(det_keluar);
            }
            return list;
        } catch (SQLException ex) {
           Logger.getLogger(dao_detbarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detbarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detbarangkeluar.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_detbarangkeluar> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validasiStok(model_detbarangkeluar mod_detkeluar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
