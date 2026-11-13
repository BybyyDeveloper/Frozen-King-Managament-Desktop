/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_supplier;

/**
 *
 * @author by
 */
public interface service_supplier {
    void tambahData (model_supplier mod_sup);
    void perbaruiData (model_supplier mod_sup);
    void hapusData (model_supplier mod_sup);
    
    model_supplier getByid (String id);
    
    List<model_supplier> ambilData();
    List<model_supplier> pencarian(String id);
    
    String nomor();
}
