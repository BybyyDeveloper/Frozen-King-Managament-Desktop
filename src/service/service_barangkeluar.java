/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_barangkeluar;

/**
 *
 * @author by
 */
public interface service_barangkeluar {
    void tambahData (model_barangkeluar mod_keluar);
    void hapusData (model_barangkeluar mod_keluar);
    
    model_barangkeluar getByid (String id);
    List<model_barangkeluar> getData();
    List<model_barangkeluar> pencarian(String id);
    
    String nomor();
}
