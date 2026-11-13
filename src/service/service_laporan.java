/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.swing.JPanel;

/**
 *
 * @author by
 */
public interface service_laporan {
    void suratJalanPemesanan (String no);
    void transaksiBarangMasuk (String no);
    void transaksiBarangKeluar (String no);
    void transaksiPenjualan (String no);
    
    void lapDataBarang (JPanel lp);
    void lapTransaksiBarang (JPanel lp);
    
    void lapPemesananPerTransaksi (JPanel jp,String no);
    void lapPemesananPerPeriode (JPanel jp,String tgl1, String tgl2);
    void lapPemesananPerBulan (JPanel jp,String dt1, int dt2);
    void lapPemesananPerSupplier (JPanel jp,String id);
    
    void lapBarangMasukPerTransaksi (JPanel jp,String no);
    void lapBarangMasukPerPeriode (JPanel jp,String tgl1, String tgl2);
    void lapBarangMasukPerBulan (JPanel jp,String dt1, int dt2);
    void lapBarangMasukPerSupplier (JPanel jp,String id);
    
    void lapBarangKeluarPerTransaksi (JPanel jp,String no);
    void lapBarangKeluarPerPeriode (JPanel jp,String tgl1, String tgl2);
    void lapBarangKeluarPerBulan (JPanel jp,String dt1, int dt2);
    
}
