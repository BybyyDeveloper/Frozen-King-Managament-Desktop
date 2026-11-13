/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.swing.JLabel;
import model.model_pengguna;

/**
 *
 * @author by
 */
public interface service_pengguna {
    void tambahData (model_pengguna mod_pengguna);
    void perbaruiData (model_pengguna mod_pengguna);
    void hapusData (model_pengguna mod_pengguna);
    
    model_pengguna getByid (String id);
    
    List<model_pengguna> ambilData();
    List<model_pengguna> pencarian(String id);
    
    String nomor();
    boolean validateOldPassword(String username, String oldPassword);
    boolean changePassword(String username,String oldPassword, String newPassword);
    
    
}
