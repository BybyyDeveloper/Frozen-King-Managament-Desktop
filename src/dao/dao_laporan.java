/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import config.koneksi;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import service.service_laporan;

/**
 *
 * @author by
 */
public class dao_laporan implements service_laporan{

    private Connection conn;

    public dao_laporan() {
        conn = koneksi.getConnection();
    }
    
    
    @Override
    public void suratJalanPemesanan(String no) {
        try{
                String reportPath = "src/report/transaksi_pemesanan.jasper";
                
                HashMap<String, Object> parameters = new HashMap<>();
                parameters.put("no", no);
                
                JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                JasperViewer viewer = new JasperViewer(print, false);
                viewer.setVisible(true);
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
    }

    @Override
    public void transaksiBarangMasuk(String no) {
        try{
            String reportPath = "src/report/transaksi_barangmasuk.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("no", no);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void transaksiBarangKeluar(String no) {
        try{
            String reportPath = "src/report/transaksi_barangkeluar.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("no", no);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    @Override
    public void transaksiPenjualan(String no) {
        try{
            String reportPath = "src/report/transaksi_penjualan.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("no", no);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            JasperViewer viewer = new JasperViewer(print, false);
            viewer.setVisible(true);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void lapDataBarang(JPanel lp) {
        try{
            String reportPath = "src/report/laporan_databarang.jasper";

            HashMap<String, Object> parameters = new HashMap<>();

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            lp.setLayout(new BorderLayout());
            lp.repaint();
            lp.add(new JRViewer(print));
            lp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }

    @Override
    public void lapTransaksiBarang(JPanel lp) {
         try{
            String reportPath = "src/report/laporan_transaksibarang.jasper";

            HashMap<String, Object> parameters = new HashMap<>();

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            lp.setLayout(new BorderLayout());
            lp.repaint();
            lp.add(new JRViewer(print));
            lp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapPemesananPerTransaksi(JPanel jp, String no) {
        try{
            String reportPath = "src/report/laporan_pemesanan_pertransaksi.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("no", no);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapPemesananPerPeriode(JPanel jp, String tgl1, String tgl2) {
        try{
            String reportPath = "src/report/laporan_pemesanan_perperiode.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("tgl1", tgl1);
            parameters.put("tgl2", tgl2);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapPemesananPerBulan(JPanel jp, String dt1, int dt2) {
        try{
            String reportPath = "src/report/laporan_pemesanan_perbulan.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("dt1", dt1);
            parameters.put("dt2", dt2);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapPemesananPerSupplier(JPanel jp, String id) {
        try{
            String reportPath = "src/report/laporan_pemesanan_persupplier.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("id", id);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapBarangMasukPerTransaksi(JPanel jp, String no) {
        try{
            String reportPath = "src/report/transaksi_barangmasuk.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("no", no);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapBarangMasukPerPeriode(JPanel jp, String tgl1, String tgl2) {
        try{
            String reportPath = "src/report/laporan_barangmasuk_perperiode.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("tgl1", tgl1);
            parameters.put("tgl2", tgl2);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapBarangMasukPerBulan(JPanel jp, String dt1, int dt2) {
        try{
            String reportPath = "src/report/laporan_barangmasuk_perbulan.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("dt1", dt1);
            parameters.put("dt2", dt2);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapBarangMasukPerSupplier(JPanel jp, String id) {
        try{
            String reportPath = "src/report/laporan_barangmasuk_persupplier.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("id", id);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapBarangKeluarPerTransaksi(JPanel jp, String no) {
        try{
            String reportPath = "src/report/transaksi_barangkeluar.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("no", no);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapBarangKeluarPerPeriode(JPanel jp, String tgl1, String tgl2) {
        try{
            String reportPath = "src/report/laporan_barangkeluar_perperiode.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("tgl1", tgl1);
            parameters.put("tgl2", tgl2);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}

    @Override
    public void lapBarangKeluarPerBulan(JPanel jp, String dt1, int dt2) {
        try{
            String reportPath = "src/report/laporan_barangkeluar_perbulan.jasper";

            HashMap<String, Object> parameters = new HashMap<>();
            parameters.put("dt1", dt1);
            parameters.put("dt2", dt2);

            JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
            //tampil panel
            jp.setLayout(new BorderLayout());
            jp.repaint();
            jp.add(new JRViewer(print));
            jp.revalidate();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }}
}
