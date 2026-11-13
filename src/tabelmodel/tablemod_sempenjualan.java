/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelmodel;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_sempenjualan;

/**
 *
 * @author by
 */
public class tablemod_sempenjualan extends AbstractTableModel{
private List<model_sempenjualan> list = new ArrayList<>();
    
    public void tambahData(model_sempenjualan mod_penjualan) {
        list.add(mod_penjualan);
        fireTableRowsInserted(list.size() - 1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
   }
    
    public void perbaruiData(int row, model_sempenjualan mod_penjualan){
        list.add(row, mod_penjualan);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil diperbarui");
    }
    
    public void hapusData(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil dihapus");
    }
    
    public void clear (){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<model_sempenjualan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_sempenjualan mod_penjualan){
        list.set(index, mod_penjualan);
        fireTableRowsUpdated(index,index);
    }
    
    public model_sempenjualan getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getMod_barang().getKode_barang();
            case 1 : return list.get(rowIndex).getMod_barang().getNama_barang();
            case 2 : return list.get(rowIndex).getMod_barang().getHarga();
            case 3 : return list.get(rowIndex).getMod_detpenjualan().getJml_jual();
            case 4 : return list.get(rowIndex).getMod_detpenjualan().getSubtotal_jual();
           
            default : return null;
        }
    }
    
     @Override
    public String getColumnName(int column){
        switch (column){
            case 0 : return "Kode Barang";
            case 1 : return "Nama Barang";
            case 2 : return "Harga";
            case 3 : return "Jumlah";
            case 4 : return "Subtotal";
            
            default : return null;
        }
    }
}