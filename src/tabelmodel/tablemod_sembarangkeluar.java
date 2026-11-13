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
import model.model_sembarangkeluar;

/**
 *
 * @author by
 */
public class tablemod_sembarangkeluar extends AbstractTableModel{
private List<model_sembarangkeluar> list = new ArrayList<>();
    
    public void tambahData(model_sembarangkeluar mod_keluar) {
        list.add(mod_keluar);
        fireTableRowsInserted(list.size() - 1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
   }
    
    public void perbaruiData(int row, model_sembarangkeluar mod_keluar){
        list.add(row, mod_keluar);
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
    
    public void setData(List<model_sembarangkeluar> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_sembarangkeluar mod_keluar){
        list.set(index, mod_keluar);
        fireTableRowsUpdated(index,index);
    }
    
    public model_sembarangkeluar getData(int index){
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
            case 3 : return list.get(rowIndex).getMod_detkeluar().getJml_keluar();
            case 4 : return list.get(rowIndex).getMod_detkeluar().getSubtotal_keluar();
           
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