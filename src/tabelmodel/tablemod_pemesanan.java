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
import model.model_pemesanan;
/**
 *
 * @author by
 */
public class tablemod_pemesanan extends AbstractTableModel{
private List<model_pemesanan> list = new ArrayList<>();
    
    public void tambahData(model_pemesanan mod_pesan) {
        list.add(mod_pesan);
        fireTableRowsInserted(list.size() - 1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
   }
    
    public void perbaruiData(int row, model_pemesanan mod_pesan){
        list.add(row, mod_pesan);
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
    
    public void setData(List<model_pemesanan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_pemesanan mod_pesan){
        list.set(index, mod_pesan);
        fireTableRowsUpdated(index,index);
    }
    
    public model_pemesanan getData(int index){
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
            case 0 : return list.get(rowIndex).getNo_pesan();
            case 1 : return list.get(rowIndex).getTgl_pesan();
            case 2 : return list.get(rowIndex).getTotal_pesan();
            case 3 : return list.get(rowIndex).getMod_supplier().getId_supplier();
            case 4 : return list.get(rowIndex).getMod_pengguna().getId_pengguna();
           
            default : return null;
        }
    }
    
     @Override
    public String getColumnName(int column){
        switch (column){
            case 0 : return "No Pemesanan";
            case 1 : return "Tanggal";
            case 2 : return "Total Pemesanan";
            case 3 : return "ID Supplier";
            case 4 : return "ID Pengguna";
            
            default : return null;
        }
    }
}



