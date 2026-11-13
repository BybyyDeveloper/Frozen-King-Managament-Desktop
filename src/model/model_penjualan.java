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
public class model_penjualan {
    
    private String no_jual;
    private String tgl_jual;
    private Long total_jual;
    private Double pembayaran;
    private model_member mod_member;

    public String getNo_jual() {
        return no_jual;
    }

    public void setNo_jual(String no_jual) {
        this.no_jual = no_jual;
    }

    public String getTgl_jual() {
        return tgl_jual;
    }

    public void setTgl_jual(String tgl_jual) {
        this.tgl_jual = tgl_jual;
    }

    public Long getTotal_jual() {
        return total_jual;
    }

    public void setTotal_jual(Long total_jual) {
        this.total_jual = total_jual;
    }

    public Double getPembayaran() {
        return pembayaran;
    }

    public void setPembayaran(Double pembayaran) {
        this.pembayaran = pembayaran;
    }
    
    public model_member getMod_member() {
        return mod_member;
    }

    public void setMod_member(model_member mod_member) {
        this.mod_member = mod_member;
    }
    
}
