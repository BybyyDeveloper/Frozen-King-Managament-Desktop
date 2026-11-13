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
import model.model_barangkeluar;

/**
 *
 * @author by
 */
public class tablemod_barangkeluar extends AbstractTableModel {

    private List<model_barangkeluar> list = new ArrayList<>();
    
    public void tambahData(model_barangkeluar mod_keluar) {
        list.add(mod_keluar);
        fireTableRowsInserted(list.size() - 1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
   }
    
    public void perbaruiData(int row, model_barangkeluar mod_keluar){
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
    
    public void setData(List<model_barangkeluar> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_barangkeluar mod_keluar){
        list.set(index, mod_keluar);
        fireTableRowsUpdated(index,index);
    }
    
    public model_barangkeluar getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0 : return list.get(rowIndex).getNo_keluar();
            case 1 : return list.get(rowIndex).getTgl_keluar();
            case 2 : return list.get(rowIndex).getTotal_keluar();
            case 3 : return list.get(rowIndex).getMod_pengguna().getId_pengguna();
            
            default : return null;
        }
    }
    
     @Override
    public String getColumnName(int column){
        switch (column){
            case 0 : return "No Keluar";
            case 1 : return "Tanggal Keluar";
            case 2 : return "Total Keluar";
            case 3 : return "ID Pengguna";

            default : return null;
        }
    }
}
