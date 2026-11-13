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
import model.model_pengguna;
/**
 *
 * @author by
 */
public class tablemod_pengguna extends AbstractTableModel{
private List<model_pengguna> list = new ArrayList<>();
    
    public void tambahData(model_pengguna mod_pengguna) {
        list.add(mod_pengguna);
        fireTableRowsInserted(list.size() - 1,list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
   }
    
    public void perbaruiData(int row, model_pengguna mod_pengguna){
        list.add(row, mod_pengguna);
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
    
    public void setData(List<model_pengguna> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, model_pengguna mod_pengguna){
        list.set(index, mod_pengguna);
        fireTableRowsUpdated(index,index);
    }
    
    public model_pengguna getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] columnNames = {"No", "ID", "Nama", "Username", "Telepom", "Alamat", "Jabatan"};

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
                case 0 : return list.get(rowIndex).getId_pengguna();
                case 1 : return list.get(rowIndex).getNama_pengguna();
                case 2 : return list.get(rowIndex).getUsername();
                case 3 : return list.get(rowIndex).getTelp_pengguna();
                case 4 : return list.get(rowIndex).getAlamat_pengguna();
                case 5 : return list.get(rowIndex).getJabatan();
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