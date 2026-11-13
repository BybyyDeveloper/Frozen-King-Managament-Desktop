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
public class model_detbarangmasuk {

    private model_barangmasuk mod_masuk;
    private model_barang mod_barang;
    private int jml_masuk;
    private Long subtotal_masuk;
    
    public model_barangmasuk getMod_masuk() {
        return mod_masuk;
    }

    public void setMod_masuk(model_barangmasuk mod_masuk) {
        this.mod_masuk = mod_masuk;
    }

    public model_barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(model_barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public int getJml_masuk() {
        return jml_masuk;
    }

    public void setJml_masuk(int jml_masuk) {
        this.jml_masuk = jml_masuk;
    }

    public Long getSubtotal_masuk() {
        return subtotal_masuk;
    }

    public void setSubtotal_masuk(Long subtotal_masuk) {
        this.subtotal_masuk = subtotal_masuk;
    }
}
