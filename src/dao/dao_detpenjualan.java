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
import model.model_penjualan;
import model.model_detpenjualan;
import service.service_detpenjualan;

/**
 *
 * @author by
 */
public class dao_detpenjualan implements service_detpenjualan{

    private Connection conn;

    public dao_detpenjualan() {
    conn = koneksi.getConnection();
    }

    @Override
    public void tambahData(model_detpenjualan mod_detpenjualan) {
        PreparedStatement st = null;
        String sql ="INSERT INTO detail_penjualan (no_penjualan, kode_barang, jml_jual, subtotal_jual) SELECT '"
                + mod_detpenjualan.getMod_penjualan().getNo_jual()+"', kode_barang, jml_jual, subtotal_jual FROM "
                + "sementara_penjualan";
        try {
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(dao_detpenjualan.class.getName()).log(Level.SEVERE,null,ex);
        } finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detpenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }  
    }

    @Override
    public void sumTotal(model_detpenjualan mod_detpenjualan) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "SELECT SUM(subtotal_jual) FROM sementara_penjualan";
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            if(rs.next()){
                mod_detpenjualan.setSubtotal_jual(rs.getLong(1));
            }
        }catch (SQLException ex) {
           Logger.getLogger(dao_detpenjualan.class.getName()).log(Level.SEVERE,null,ex);
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detpenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }}

    @Override
    public void hapusSementara(model_detpenjualan mod_detpenjualan) {
        PreparedStatement st = null;
        String sql = "DELETE FROM sementara_penjualan";
        try{
            st = conn.prepareStatement(sql);
            st.executeUpdate();
        }catch (SQLException ex) {
            Logger.getLogger(dao_detpenjualan.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if (st!= null) {
               try {
                   st.close();
               }catch (SQLException ex) {
                   Logger.getLogger(dao_detpenjualan.class.getName()).log(Level.SEVERE,null,ex);
               }
           }
        }}

    @Override
    public model_detpenjualan getByid(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<model_detpenjualan> getData(String id) {
        PreparedStatement st = null;
        List list = new ArrayList();
        ResultSet rs = null;
        String sql = "SELECT det_penjualan.no_penjualan, det_penjualan.kode_barang, brg.nama_barang, "
                + "brg.harga, det_penjualan.jml_jual, det_penjualan.subtotal_jual "
                +"FROM detail_penjualan det_penjualan "
                +"INNER JOIN penjualan jual ON jual.no_jual = det_penjualan.no_penjualan "
                +"INNER JOIN barang brg ON brg.kode_barang = det_penjualan.kode_barang "
                +"WHERE det_penjualan.no_penjualan='"+id+"' ORDER BY no_penjualan ASC";
        try {
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()) {
                model_penjualan penjualan = new model_penjualan();
                model_detpenjualan det_penjualan = new model_detpenjualan();
                model_barang brg = new model_barang();
                
                penjualan.setNo_jual(String.valueOf(rs.getString("det_penjualan.no_penjualan")));
                det_penjualan.setMod_penjualan(penjualan);
                
                brg.setKode_barang(rs.getString("kode_barang"));
                brg.setNama_barang(rs.getString("nama_barang"));
                brg.setHarga(rs.getLong("harga"));
                det_penjualan.setJml_jual(rs.getInt("jml_jual"));
                det_penjualan.setSubtotal_jual(rs.getLong("subtotal_jual"));
                
                det_penjualan.setMod_barang(brg);
                list.add(det_penjualan);
            }
            return list;
        } catch (SQLException ex) {
           Logger.getLogger(dao_detpenjualan.class.getName()).log(Level.SEVERE,null,ex);
           return null;
        }finally {
            if (st!= null) {
                try {
                    st.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detpenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!= null) {
                try {
                    rs.close();
                } catch (SQLException ex){
                    Logger.getLogger(dao_detpenjualan.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }
    }

    @Override
    public List<model_detpenjualan> pencarian(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validasiStok(model_detpenjualan mod_detpenjualan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
