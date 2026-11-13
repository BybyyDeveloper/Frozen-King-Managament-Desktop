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
public class model_barang {

    private String kode_barang;
    private model_jenisbarang jns_barang;
//    private String merk_barang;
    private String nama_barang;
    private String satuan;
    private Long harga;
    private Integer stok;
    
    public String getKode_barang() {
        return kode_barang;
    }

    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public model_jenisbarang getJns_barang() {
        return jns_barang;
    }

    public void setJns_barang(model_jenisbarang jns_barang) {
        this.jns_barang = jns_barang;
    }

//    public String getMerk_barang() {
//        return merk_barang;
//    }
//
//    public void setMerk_barang(String merk_barang) {
//        this.merk_barang = merk_barang;
//    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Long getHarga() {
        return harga;
    }

    public void setHarga(Long harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
}