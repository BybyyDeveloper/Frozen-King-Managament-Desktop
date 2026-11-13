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
import model.model_detpenjualan;
/**
 *
 * @author by
 */
public class tablemod_detpenjualan extends AbstractTableModel{
private List<model_detpenjualan> list = new ArrayList<>();
    
    public void tambahData(model_detpenjualan mod_detpenjualan) {
        list.add(mod_detpenjualan);
        fireTableRowsInserted(list.size() - 1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
   }
    
    public void perbaruiData(int row, model_detpenjualan mod_detpenjualan){
        list.add(row, mod_detpenjualan);
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
    
    public void setData(List<model_detpenjualan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_detpenjualan mod_detpenjualan){
        list.set(index, mod_detpenjualan);
        fireTableRowsUpdated(index,index);
    }
    
    public model_detpenjualan getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getMod_penjualan().getNo_jual();
            case 1 : return list.get(rowIndex).getMod_barang().getKode_barang();
            case 2 : return list.get(rowIndex).getMod_barang().getNama_barang();
            case 3 : return list.get(rowIndex).getMod_barang().getHarga();
            case 4 : return list.get(rowIndex).getJml_jual();
            case 5 : return list.get(rowIndex).getSubtotal_jual();
            default : return null;
        }
    }
    
     @Override
    public String getColumnName(int column){
        switch (column){
            case 0 : return "No Penjualan";
            case 1 : return "Kode Barang";
            case 2 : return "Nama Barang";
            case 3 : return "Harga";
            case 4 : return "Jumlah Penjualan";
            case 5 : return "Subtotal";

            default : return null;
        }
    }
}
