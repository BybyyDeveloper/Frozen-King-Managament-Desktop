/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_barangmasuk;

/**
 *
 * @author by
 */
public interface service_barangmasuk {
    void tambahData (model_barangmasuk mod_masuk);
    void perbaruiStatur (String kode_barang);
    void hapusData (model_barangmasuk mod_masuk);
    
    model_barangmasuk getByid (String id);
    List<model_barangmasuk> getData();
    List<model_barangmasuk> pencarian(String id);
    
    String nomor();
}
