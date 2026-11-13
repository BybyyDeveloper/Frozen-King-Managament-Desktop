package View;

import dao.dao_supplier;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import model.model_supplier;
import service.service_supplier;
import tabelmodel.tablemod_supplier;


public class master_supplier extends javax.swing.JPanel {

    private service_supplier servis = new dao_supplier();
    private tablemod_supplier tblModel = new tablemod_supplier();
    
    public master_supplier() {
        initComponents();
        
        tbl_data.setModel(tblModel);
        
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new rojerusan.RSMaterialButtonRectangle();
        t_cari = new javax.swing.JTextField();
        btn_cari = new javax.swing.JLabel();
        btn_hapus = new rojerusan.RSMaterialButtonRectangle();
        btn_batal = new rojerusan.RSMaterialButtonRectangle();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_data = new JTable_Custom.JTable_Custom();
        tambahData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_tambah1 = new rojerusan.RSMaterialButtonRectangle();
        btn_batal1 = new rojerusan.RSMaterialButtonRectangle();
        jLabel3 = new javax.swing.JLabel();
        t_idsupplier = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_namasupplier = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_telpsupplier = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t_alamatsupplier = new javax.swing.JTextField();

        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Data Supplier");

        btn_tambah.setText("TAMBAH");
        btn_tambah.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tambah.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        t_cari.setText("Pencarian");
        t_cari.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        t_cari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_cariMouseClicked(evt);
            }
        });
        t_cari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_cariKeyReleased(evt);
            }
        });

        btn_cari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Window Search.png"))); // NOI18N

        btn_hapus.setBackground(new java.awt.Color(219, 20, 21));
        btn_hapus.setText("HAPUS");
        btn_hapus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_hapus.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 255, 0));
        btn_batal.setForeground(new java.awt.Color(0, 0, 0));
        btn_batal.setText("BATAL");
        btn_batal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_batal.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_data.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_data);

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 53, Short.MAX_VALUE)
                        .addComponent(t_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cari)))
                .addContainerGap())
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tampilDataLayout.createSequentialGroup()
                        .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(btn_cari)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE))
        );

        mainPanel.add(tampilData, "card2");

        tambahData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Tambah Data Supplier");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 527, Short.MAX_VALUE)
        );

        btn_tambah1.setText("TAMBAH");
        btn_tambah1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tambah1.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_tambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambah1ActionPerformed(evt);
            }
        });

        btn_batal1.setBackground(new java.awt.Color(255, 255, 0));
        btn_batal1.setForeground(new java.awt.Color(0, 0, 0));
        btn_batal1.setText("BATAL");
        btn_batal1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_batal1.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("ID Supplier");

        t_idsupplier.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_idsupplier.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Nama Supplier");

        t_namasupplier.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_namasupplier.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Telepon");

        t_telpsupplier.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_telpsupplier.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Alamat");

        t_alamatsupplier.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_alamatsupplier.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_idsupplier)
                    .addComponent(t_namasupplier)
                    .addComponent(t_telpsupplier)
                    .addComponent(t_alamatsupplier)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(tambahDataLayout.createSequentialGroup()
                                .addComponent(btn_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(0, 343, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tambahDataLayout.setVerticalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_idsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(t_namasupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(t_telpsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(t_alamatsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        mainPanel.add(tambahData, "card3");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void t_cariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_cariMouseClicked
        t_cari.setText("");
    }//GEN-LAST:event_t_cariMouseClicked

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        mainPanel.removeAll();;
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(tambahData);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        btn_tambah1.setText("SIMPAN");
        t_idsupplier.setText(servis.nomor());
        t_idsupplier.setEnabled(false);
        
        if(btn_tambah.getText().equals("UBAH")){
            dataTabel();
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        tampilPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        if(btn_tambah.getText().equals("TAMBAH")){
            btn_tambah.setText("UBAH");
        }
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        if(btn_tambah1.getText().equals("TAMBAH")){
            btn_tambah1.setText("SIMPAN");
            t_idsupplier.setText(servis.nomor());
        } else if (btn_tambah1.getText().equals("SIMPAN")){
            simpanData();
        }else if (btn_tambah1.getText().equals("PERBARUI")){
            perbaruiData();
        }
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    private void t_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyReleased
        pencarian();
    }//GEN-LAST:event_t_cariKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private rojerusan.RSMaterialButtonRectangle btn_batal1;
    private javax.swing.JLabel btn_cari;
    private rojerusan.RSMaterialButtonRectangle btn_hapus;
    private rojerusan.RSMaterialButtonRectangle btn_tambah;
    private rojerusan.RSMaterialButtonRectangle btn_tambah1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField t_alamatsupplier;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_idsupplier;
    private javax.swing.JTextField t_namasupplier;
    private javax.swing.JTextField t_telpsupplier;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private JTable_Custom.JTable_Custom tbl_data;
    // End of variables declaration//GEN-END:variables

    private void dataTabel(){
        tampilData.setVisible(false);
        tambahData.setVisible(true);
        
        int row = tbl_data.getSelectedRow();
        jLabel2.setText("Perbarui Data Jenis Barang");
        
        t_idsupplier.setEnabled(false);
        t_namasupplier.setEnabled(true);
        
        t_idsupplier.setText(tbl_data.getModel().getValueAt(row, 0).toString());
        t_namasupplier.setText(tbl_data.getModel().getValueAt(row, 1).toString());
        t_telpsupplier.setText(tbl_data.getModel().getValueAt(row, 2).toString());
        t_alamatsupplier.setText(tbl_data.getModel().getValueAt(row, 3).toString());
        
        btn_tambah1.setText("PERBARUI");
        btn_batal.setVisible(true);
    }
    
    private void aktif() {
        t_namasupplier.setEnabled(true);
        t_idsupplier.setEnabled(true);
    }
    
    private void loadData() {
        btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        List<model_supplier> list = servis.ambilData();
        tblModel.setData(list);
    }
    
    private void hapusData() {
        int index = tbl_data.getSelectedRow();
        if (index != -1) {
            model_supplier model = tblModel.getData(tbl_data.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION){
                servis.hapusData(model);
                tblModel.hapusData(index);
                loadData();
                resetForm();
            }
        } else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
        }
    }
    
    private void resetForm(){
        btn_tambah.requestFocus();
        btn_tambah.setText("TAMBAH");
        t_namasupplier.setText("");
        t_idsupplier.setText("");
    }
    
    private void tampilPanel(){
        mainPanel.removeAll();
        mainPanel.add(new master_supplier());
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void simpanData(){
        if(validasiInput()==true){
            String ID = t_idsupplier.getText();
            String nama_sup = t_namasupplier.getText();
            String telp_sup = t_telpsupplier.getText();
            String alamat_sup = t_alamatsupplier.getText();
     
            model_supplier model = new model_supplier();
            model.setId_supplier(ID);
            model.setNama_supplier(nama_sup);
            model.setTelp_supplier(telp_sup);
            model.setAlamat_supplier(alamat_sup);

            servis.tambahData(model);
            tblModel.tambahData(model);
            tampilPanel();
            loadData();
            resetForm();
            btn_tambah.setText("TAMBAH");
        }
    }
    
    private void perbaruiData() {
        int index = tbl_data.getSelectedRow();
        if (index!= -1){
            model_supplier model_sup = tblModel.getData(tbl_data.convertRowIndexToModel(index));
            
            if (validasiInput()==true){
                String ID = t_idsupplier.getText();
                String nama_sup = t_namasupplier.getText();
                String telp_sup = t_telpsupplier.getText();
                String alamat_sup = t_alamatsupplier.getText();

                model_supplier model = new model_supplier();
                model.setId_supplier(ID);
                model.setNama_supplier(nama_sup);
                model.setTelp_supplier(telp_sup);
                model.setAlamat_supplier(alamat_sup);

                servis.perbaruiData(model);
                tblModel.perbaruiData(index,model);
                loadData();
                resetForm();
                tampilPanel();
            }
        }
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if(t_idsupplier.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ID Supplier tidak boleh kosong");
        }else if(t_namasupplier.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama Supplier tidak boleh kosong");
        }else if(t_telpsupplier.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Telepon Supplier tidak boleh kosong");
        }else if(t_alamatsupplier.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ALamat Supplier tidak boleh kosong");
        }else{
            valid=true;
        }
        return valid;
    }
    
    private void pencarian(){
        List<model_supplier> list = servis.pencarian(t_cari.getText());
        tblModel.setData(list);
    }
}
