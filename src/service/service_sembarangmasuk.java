/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_sembarangmasuk;

/**
 *
 * @author by
 */
public interface service_sembarangmasuk {
    void tambahData (model_sembarangmasuk mod_masuk);
    void perbaruiData (model_sembarangmasuk mod_masuk);
    void hapusData (model_sembarangmasuk mod_masuk);
    
    model_sembarangmasuk getByid (String id);
    
    List<model_sembarangmasuk> getData();
}
