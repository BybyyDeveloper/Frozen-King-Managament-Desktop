/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Main.MenuUtama;
import config.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.model_login;
import service.service_login;
import View.FormLogin;

public class dao_login implements service_login{
    private Connection conn;
    
    public dao_login(){
        conn = koneksi.getConnection();
    }

    @Override
    public void prosesLogin(model_login mod_login) {
    PreparedStatement st = null;
    ResultSet rs = null;
    String sql = "SELECT * FROM user WHERE (id_user = ? OR username = ?) AND password = ?";
    
    try {
        st = conn.prepareStatement(sql);
        st.setString(1, mod_login.getId_user());
        st.setString(2, mod_login.getUsername_user());
        st.setString(3, encrypt.getmd5java(mod_login.getPass_user()));
        
        rs = st.executeQuery();
        if (rs.next()) {
            // Update data yang belum ada di mod_login
            mod_login.setId_user(rs.getString("id_user"));
            mod_login.setNama(rs.getString("nama"));
            mod_login.setJabatan(rs.getString("jabatan"));
            
            // Kirim mod_login ke MenuUtama
            MenuUtama menu = new MenuUtama(mod_login);
            menu.setVisible(true);

            // Tutup form login yang sedang aktif
            FormLogin lg = new FormLogin();
            lg.tutup = true;
        } else {
            JOptionPane.showMessageDialog(null, "Username dan Password Salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (SQLException ex) {
        Logger.getLogger(dao_login.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            if (rs != null) rs.close();
            if (st != null) st.close();
        } catch (SQLException e) {
            Logger.getLogger(dao_login.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
    
}
