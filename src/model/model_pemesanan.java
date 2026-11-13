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
public class model_pemesanan {

    private String no_pesan;
    private String tgl_pesan;
    private Long total_pesan;
    private model_supplier mod_supplier;
    private model_pengguna mod_pengguna;
    
    public String getNo_pesan() {
        return no_pesan;
    }

    public void setNo_pesan(String no_pesan) {
        this.no_pesan = no_pesan;
    }

    public String getTgl_pesan() {
        return tgl_pesan;
    }

    public void setTgl_pesan(String tgl_pesan) {
        this.tgl_pesan = tgl_pesan;
    }

    public Long getTotal_pesan() {
        return total_pesan;
    }

    public void setTotal_pesan(Long total_pesan) {
        this.total_pesan = total_pesan;
    }

    public model_supplier getMod_supplier() {
        return mod_supplier;
    }

    public void setMod_supplier(model_supplier mod_supplier) {
        this.mod_supplier = mod_supplier;
    }

    public model_pengguna getMod_pengguna() {
        return mod_pengguna;
    }

    public void setMod_pengguna(model_pengguna mod_pengguna) {
        this.mod_pengguna = mod_pengguna;
    }

}