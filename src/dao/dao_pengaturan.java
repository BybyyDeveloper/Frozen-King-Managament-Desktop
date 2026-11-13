/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author by
 */
import java.sql.*;
import java.util.*;
import model.model_pengaturan;

public class dao_pengaturan {
    private Connection conn;

    public dao_pengaturan(Connection conn) {
        this.conn = conn;
    }

    // Ambil semua pengaturan
    public List<model_pengaturan> getAllPengaturan() {
        List<model_pengaturan> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM pengaturan";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                model_pengaturan mp = new model_pengaturan();
                mp.setId(rs.getInt("id"));
                mp.setNama(rs.getString("nama"));
                mp.setNilai(rs.getString("nilai"));
                list.add(mp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // Ambil pengaturan berdasarkan nama
    public model_pengaturan getPengaturan(String nama) {
        model_pengaturan mp = null;
        try {
            String sql = "SELECT * FROM pengaturan WHERE nama=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, nama);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mp = new model_pengaturan();
                mp.setId(rs.getInt("id"));
                mp.setNama(rs.getString("nama"));
                mp.setNilai(rs.getString("nilai"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mp;
    }

    // Update pengaturan
    public void updatePengaturan(model_pengaturan mp) {
        try {
            String sql = "UPDATE pengaturan SET nilai=? WHERE nama=?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, mp.getNilai());
            ps.setString(2, mp.getNama());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public double getDiskon() {
        double diskon = 0.0;
        try {
            String sql = "SELECT nilai FROM pengaturan WHERE nama='diskon'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                diskon = Double.parseDouble(rs.getString("nilai"));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return diskon;
    }
}

