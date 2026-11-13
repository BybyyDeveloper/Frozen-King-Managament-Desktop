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
public class model_detpemesanan {

    private model_pemesanan mod_pesan;
    private model_barang mod_barang;
    private Long jml_pesan;
    private Long subtotal;
    private String status;
    
    public model_pemesanan getMod_pesan() {
        return mod_pesan;
    }

    public void setMod_pesan(model_pemesanan mod_pesan) {
        this.mod_pesan = mod_pesan;
    }

    public model_barang getMod_barang() {
        return mod_barang;
    }

    public void setMod_barang(model_barang mod_barang) {
        this.mod_barang = mod_barang;
    }

    public Long getJml_pesan() {
        return jml_pesan;
    }

    public void setJml_pesan(Long jml_pesan) {
        this.jml_pesan = jml_pesan;
    }

    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
