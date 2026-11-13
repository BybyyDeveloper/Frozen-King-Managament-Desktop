/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_sembarangkeluar;

/**
 *
 * @author by
 */
public interface service_sembarangkeluar {
    void tambahData (model_sembarangkeluar mod_keluar);
    void perbaruiData (model_sembarangkeluar mod_keluar);
    void hapusData (model_sembarangkeluar mod_keluar);
    
    model_sembarangkeluar getByid (String id);
    
    List<model_sembarangkeluar> getData();
}
