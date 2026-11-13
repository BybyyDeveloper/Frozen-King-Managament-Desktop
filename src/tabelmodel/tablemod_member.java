/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelmodel;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import model.model_member;

/**
 *
 * @author by
 */
public class tablemod_member extends AbstractTableModel{
private List<model_member> list = new ArrayList<>();
    
    public void tambahData(model_member mod_member) {
        list.add(mod_member);
        fireTableRowsInserted(list.size() - 1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
   }
    
    public void perbaruiData(int row, model_member mod_member){
        list.add(row, mod_member);
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
    
    public void setData(List<model_member> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_member mod_member){
        list.set(index, mod_member);
        fireTableRowsUpdated(index,index);
    }
    
    public model_member getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] columnNames = {"No", "ID", "Nama", "Telepon", "Alamat"};

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if(columnIndex == 0){
            return "   "+ (rowIndex + 1);
        } else{
            switch (columnIndex - 1) {
                case 0 : return list.get(rowIndex).getId_member();
                case 1 : return list.get(rowIndex).getNama_member();
                case 2 : return list.get(rowIndex).getTelp_member();
                case 3 : return list.get(rowIndex).getAlamat_member(); 
                default : return null;
            }
        }
    }
    
     @Override
    public String getColumnName(int column){
        if (column == 0){
            return "   " + columnNames[column];
        }else{
            return columnNames[column];
        }
    }
}
