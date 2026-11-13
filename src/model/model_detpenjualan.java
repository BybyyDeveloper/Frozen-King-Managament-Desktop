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
public class model_detpenjualan {

    private model_penjualan mod_penjualan;
    private model_barang mod_barang;
    private int jml_jual;
    private Long subtotal_jual;
    
    public model_penjualan getMod_penjualan() {
        return mod_penjualan;
    }

    public void setMod_penjualan(model_penjualan mod_penjualan) {
        this.mod_penjualan = mod_penjualan;
    }

    public model_barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(model_barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public int getJml_jual() {
        return jml_jual;
    }

    public void setJml_jual(int jml_jual) {
        this.jml_jual = jml_jual;
    }

    public Long getSubtotal_jual() {
        return subtotal_jual;
    }

    public void setSubtotal_jual(Long subtotal_jual) {
        this.subtotal_jual = subtotal_jual;
    }
}
