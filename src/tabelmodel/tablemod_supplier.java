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
import model.model_supplier;
/**
 *
 * @author by
 */
public class tablemod_supplier extends AbstractTableModel{
private List<model_supplier> list = new ArrayList<>();
    
    public void tambahData(model_supplier mod_sup) {
        list.add(mod_sup);
        fireTableRowsInserted(list.size() - 1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
   }
    
    public void perbaruiData(int row, model_supplier mod_sup){
        list.add(row, mod_sup);
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
    
    public void setData(List<model_supplier> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_supplier mod_sup){
        list.set(index, mod_sup);
        fireTableRowsUpdated(index,index);
    }
    
    public model_supplier getData(int index){
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
            case 0 : return list.get(rowIndex).getId_supplier();
            case 1 : return list.get(rowIndex).getNama_supplier();
            case 2 : return list.get(rowIndex).getTelp_supplier();
            case 3 : return list.get(rowIndex).getAlamat_supplier();

            default : return null;
        }
    }
    
     @Override
    public String getColumnName(int column){
        switch (column){
            case 0 : return "ID Supplier";
            case 1 : return "Nama Supplier";
            case 2 : return "Telepon Supplier";
            case 3 : return "Alamat Supplier";

            default : return null;
        }
    }
}
