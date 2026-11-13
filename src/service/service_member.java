/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_member;

/**
 *
 * @author by
 */
public interface service_member {
    void tambahData (model_member mod_member);
    void hapusData (model_member mod_member);
    void perbaruiData (model_member mod_member);
    
    model_member getByid (String id);
    
    List<model_member> ambilData();
    List<model_member> pencarian(String id);
    
    String nomor();
}
