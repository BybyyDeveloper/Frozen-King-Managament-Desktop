/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_penjualan;

/**
 *
 * @author by
 */
public interface service_penjualan {
    void tambahData (model_penjualan mod_penjualan);
    void hapusData (model_penjualan mod_penjualan);
    
    model_penjualan getByid (String id);
    List<model_penjualan> getData();
    List<model_penjualan> pencarian(String id);
    
    String nomor();
}
