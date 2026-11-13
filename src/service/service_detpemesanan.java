/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_detpemesanan;

/**
 *
 * @author by
 */
public interface service_detpemesanan {
    void tambahData (model_detpemesanan mod_detpesan);
    void sumTotal (model_detpemesanan mod_detpesan);
    void hapusSementara(model_detpemesanan mod_detpesan);
    
    model_detpemesanan getByid (String id);
    List<model_detpemesanan> getData(String id);
    List<model_detpemesanan> pencarian(String id);
}
