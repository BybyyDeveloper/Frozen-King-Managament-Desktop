/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_jenisbarang;

/**
 *
 * @author by
 */
public interface service_jenisbarang {
    void tambahData (model_jenisbarang mod_jenbar);
    void perbaruiData (model_jenisbarang mod_jenbar);
    void hapusData (model_jenisbarang mod_jenbar);
    
    model_jenisbarang getByid (String id);
    
    List<model_jenisbarang> ambilData();
    List<model_jenisbarang> pencarian(String id);
    
    String nomor();
    
    boolean validasiNamaJenisBarang(model_jenisbarang mod_jenbar);
}
