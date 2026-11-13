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
public class model_detbarangkeluar {
    
    private model_barangkeluar mod_keluar;
    private model_barang mod_barang;
    private int jml_keluar;
    private Long subtotal_keluar;

    public model_barangkeluar getMod_keluar() {
        return mod_keluar;
    }

    public void setMod_keluar(model_barangkeluar mod_keluar) {
        this.mod_keluar = mod_keluar;
    }

    public model_barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(model_barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public int getJml_keluar() {
        return jml_keluar;
    }

    public void setJml_keluar(int jml_keluar) {
        this.jml_keluar = jml_keluar;
    }

    public Long getSubtotal_keluar() {
        return subtotal_keluar;
    }

    public void setSubtotal_keluar(Long subtotal_keluar) {
        this.subtotal_keluar = subtotal_keluar;
    }
}