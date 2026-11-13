/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_detbarangkeluar;

/**
 *
 * @author by
 */
public interface service_detbarangkeluar {
    void tambahData (model_detbarangkeluar mod_detkeluar);
    void sumTotal (model_detbarangkeluar mod_detkeluar);
    void hapusSementara(model_detbarangkeluar mod_detkeluar);
    
    model_detbarangkeluar getByid (String id);
    List<model_detbarangkeluar> getData(String id);
    List<model_detbarangkeluar> pencarian(String id);
    
    boolean validasiStok (model_detbarangkeluar mod_detkeluar);
}
