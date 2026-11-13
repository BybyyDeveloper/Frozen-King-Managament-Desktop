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
public class model_sembarangkeluar {
    
    private model_barang mod_barang;
    private model_detbarangkeluar mod_detkeluar;

    public model_barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(model_barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public model_detbarangkeluar getMod_detkeluar() {
        return mod_detkeluar;
    }

    public void setMod_detkeluar(model_detbarangkeluar mod_detkeluar) {
        this.mod_detkeluar = mod_detkeluar;
    }
}
