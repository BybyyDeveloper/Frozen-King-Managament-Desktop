/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_sempenjualan;

/**
 *
 * @author by
 */
public interface service_sempenjualan {
    void tambahData (model_sempenjualan mod_penjualan);
    void perbaruiData (model_sempenjualan mod_penjualan);
    void hapusData (model_sempenjualan mod_penjualan);
    
    model_sempenjualan getByid (String id);
    
    List<model_sempenjualan> getData();
}
