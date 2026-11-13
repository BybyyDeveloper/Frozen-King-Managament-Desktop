/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_detpenjualan;

/**
 *
 * @author by
 */
public interface service_detpenjualan {
    void tambahData (model_detpenjualan mod_detpenjualan);
    void sumTotal (model_detpenjualan mod_detpenjualan);
    void hapusSementara(model_detpenjualan mod_detpenjualan);
    
    model_detpenjualan getByid (String id);
    List<model_detpenjualan> getData(String id);
    List<model_detpenjualan> pencarian(String id);
    
    boolean validasiStok (model_detpenjualan mod_detpenjualan);
}
