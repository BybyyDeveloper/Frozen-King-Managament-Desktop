/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author by
 */
public class model_sembarangmasuk {
    
    private model_barang mod_barang;
    private model_detbarangmasuk mod_detmasuk;

    public model_barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(model_barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public model_detbarangmasuk getMod_detmasuk() {
        return mod_detmasuk;
    }

    public void setMod_detmasuk(model_detbarangmasuk mod_detmasuk) {
        this.mod_detmasuk = mod_detmasuk;
    }
}
