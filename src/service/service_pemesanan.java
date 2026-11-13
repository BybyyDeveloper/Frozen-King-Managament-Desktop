/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_pemesanan;

/**
 *
 * @author by
 */
public interface service_pemesanan {
    void tambahData (model_pemesanan mod_pesan);
    void perbaruiData (model_pemesanan mod_pesan);
    void hapusData (model_pemesanan mod_pesan);
    
    model_pemesanan getByid (String id);
    
    List<model_pemesanan> getData();
    List<model_pemesanan> pencarian(String id);
    
    String nomor();

}
