 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.model_detbarangmasuk;

/**
 *
 * @author by
 */
public interface service_detbarangmasuk {
    void tambahData (model_detbarangmasuk mod_detmasuk);
    void sumTotal (model_detbarangmasuk mod_detmasuk);
    void hapusSementara(model_detbarangmasuk mod_detmasuk);
    void cekDanUpdateStatusPemesanan(String kodeBarang);

    
    model_detbarangmasuk getByid (String id);
    List<model_detbarangmasuk> getData(String id);
}
