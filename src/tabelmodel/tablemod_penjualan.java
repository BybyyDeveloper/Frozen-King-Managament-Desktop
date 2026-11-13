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
import model.model_penjualan;

/**
 *
 * @author by
 */
public class tablemod_penjualan extends AbstractTableModel {

    private List<model_penjualan> list = new ArrayList<>();
    
    public void tambahData(model_penjualan mod_penjualan) {
        list.add(mod_penjualan);
        fireTableRowsInserted(list.size() - 1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
   }
    
    public void perbaruiData(int row, model_penjualan mod_penjualan){
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
    
    public void setData(List<model_penjualan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_penjualan mod_penjualan){
        list.set(index, mod_penjualan);
        fireTableRowsUpdated(index,index);
    }
    
    public model_penjualan getData(int index){
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
            case 0 : return list.get(rowIndex).getNo_jual();
            case 1 : return list.get(rowIndex).getTgl_jual();
            case 2 : return list.get(rowIndex).getTotal_jual();
            case 3 : return list.get(rowIndex).getPembayaran();
            case 4 : return list.get(rowIndex).getMod_member().getId_member();
            
            default : return null;
        }
    }
    
     @Override
    public String getColumnName(int column){
        switch (column){
            case 0 : return "No Penjualan";
            case 1 : return "Tanggal Penjualan";
            case 2 : return "Total Penjualan";
            case 3 : return "Pembayaran";
            case 4 : return "ID Member";

            default : return null;
        }
    }
}
