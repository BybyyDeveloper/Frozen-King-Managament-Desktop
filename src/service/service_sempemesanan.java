/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_sempemesanan;

/**
 *
 * @author by
 */
public interface service_sempemesanan {
    void tambahData (model_sempemesanan mod_pesan);
    void perbaruiData (model_sempemesanan mod_pesan);
    void hapusData (model_sempemesanan mod_pesan);
    
    model_sempemesanan getByid (String id);
    
    List<model_sempemesanan> getData();
}
