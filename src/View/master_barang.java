package View;

import dao.dao_barang;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import model.model_barang;
import model.model_jenisbarang;
import service.service_barang;
import tabelmodel.tablemod_barang;


public class master_barang extends javax.swing.JPanel {

    private service_barang servis = new dao_barang();
    private tablemod_barang tblModel = new tablemod_barang();
    public master_barang() {
        initComponents();
        
        tbl_barang.setModel(tblModel);
        
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
        tbl_barang = new JTable_Custom.JTable_Custom();
        tambahData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t_kodebarang = new javax.swing.JTextField();
        t_kodejenisbarang = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_namajenisbarang = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        t_namabarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cbx_satuan = new javax.swing.JComboBox<>();
        t_harga = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        t_stok = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btn_tambah1 = new rojerusan.RSMaterialButtonRectangle();
        btn_batal1 = new rojerusan.RSMaterialButtonRectangle();
        btn_jenisbarang = new rojerusan.RSMaterialButtonRectangle();

        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Data Barang");

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

        tbl_barang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_barang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_barang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_barangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_barang);

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
        jLabel2.setText("Tambah Data Barang");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 586, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Kode Barang");

        t_kodebarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_kodebarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_kodejenisbarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_kodejenisbarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        t_kodejenisbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_kodejenisbarangActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Kode Jenis");

        t_namajenisbarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_namajenisbarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText("Nama Jenis Barang");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Nama Barang");

        t_namabarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_namabarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Satuan");

        cbx_satuan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbx_satuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "- Jenis Satuan -", "Gram", "Kg", "ml", "Liter", "Pcs", "Pack", "Dus", "Box", "Tray", "Roll" }));
        cbx_satuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_satuanActionPerformed(evt);
            }
        });

        t_harga.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_harga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel9.setText("Stok");

        t_stok.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_stok.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Harga");

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

        btn_jenisbarang.setText("PILIH");
        btn_jenisbarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_jenisbarang.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_jenisbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jenisbarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tambahDataLayout = new javax.swing.GroupLayout(tambahData);
        tambahData.setLayout(tambahDataLayout);
        tambahDataLayout.setHorizontalGroup(
            tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_kodebarang)
                    .addComponent(t_namajenisbarang)
                    .addComponent(t_namabarang)
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addComponent(t_kodejenisbarang)
                        .addGap(82, 82, 82))
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(tambahDataLayout.createSequentialGroup()
                        .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbx_satuan, 0, 576, Short.MAX_VALUE)
                            .addComponent(t_harga)
                            .addComponent(t_stok)
                            .addGroup(tambahDataLayout.createSequentialGroup()
                                .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(tambahDataLayout.createSequentialGroup()
                                        .addComponent(btn_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahDataLayout.createSequentialGroup()
                    .addGap(0, 517, Short.MAX_VALUE)
                    .addComponent(btn_jenisbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_kodebarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_kodejenisbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_namajenisbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_namabarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(t_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tambahDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tambahDataLayout.createSequentialGroup()
                    .addGap(205, 205, 205)
                    .addComponent(btn_jenisbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(397, Short.MAX_VALUE)))
        );

        mainPanel.add(tambahData, "card3");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void t_kodejenisbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_kodejenisbarangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_kodejenisbarangActionPerformed

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
        btn_jenisbarang.setEnabled(true);
        t_kodebarang.setEnabled(false);
        t_kodebarang.setText(servis.nomor());
        
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

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        if(btn_tambah.getText().equals("TAMBAH")){
            btn_tambah.setText("UBAH");
        }
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        if(btn_tambah1.getText().equals("TAMBAH")){
            btn_tambah1.setText("SIMPAN");
            t_kodebarang.setText(servis.nomor());
        } else if (btn_tambah1.getText().equals("SIMPAN")){
            simpanData();
        }else if (btn_tambah1.getText().equals("PERBARUI")){
            perbaruiData();
        }
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void btn_jenisbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jenisbarangActionPerformed
        boolean closable = true;
        data_jenisbarang djb = new data_jenisbarang((null), closable);
        djb.setVisible(true);
        
        
        t_kodejenisbarang.setText(djb.jb.getKode_jenis());
        t_namajenisbarang.setText(djb.jb.getNama_jenis());
        
        t_kodejenisbarang.setEnabled(false);
        t_namajenisbarang.setEnabled(false);
        t_namabarang.requestFocus();
        aktif();
    }//GEN-LAST:event_btn_jenisbarangActionPerformed

    private void t_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyReleased
        pencarian();
    }//GEN-LAST:event_t_cariKeyReleased

    private void cbx_satuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_satuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx_satuanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private rojerusan.RSMaterialButtonRectangle btn_batal1;
    private javax.swing.JLabel btn_cari;
    private rojerusan.RSMaterialButtonRectangle btn_hapus;
    private rojerusan.RSMaterialButtonRectangle btn_jenisbarang;
    private rojerusan.RSMaterialButtonRectangle btn_tambah;
    private rojerusan.RSMaterialButtonRectangle btn_tambah1;
    private javax.swing.JComboBox<String> cbx_satuan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_harga;
    private javax.swing.JTextField t_kodebarang;
    private javax.swing.JTextField t_kodejenisbarang;
    private javax.swing.JTextField t_namabarang;
    private javax.swing.JTextField t_namajenisbarang;
    private javax.swing.JTextField t_stok;
    private javax.swing.JPanel tambahData;
    private javax.swing.JPanel tampilData;
    private JTable_Custom.JTable_Custom tbl_barang;
    // End of variables declaration//GEN-END:variables

    private void dataTabel(){
        tampilData.setVisible(false);
        tambahData.setVisible(true);
        
        int row = tbl_barang.getSelectedRow();
        jLabel2.setText("Perbarui Data Barang");
        
        t_kodebarang.setEnabled(false);
        t_kodejenisbarang.setEnabled(true);
        t_namajenisbarang.setEnabled(true);
        
        t_kodebarang.setText(tbl_barang.getModel().getValueAt(row, 1).toString());
        t_kodejenisbarang.setText(tbl_barang.getModel().getValueAt(row, 2).toString());
        t_namajenisbarang.setText(tbl_barang.getModel().getValueAt(row, 3).toString());
        t_namabarang.setText(tbl_barang.getModel().getValueAt(row, 4).toString());
        cbx_satuan.setSelectedItem(tbl_barang.getModel().getValueAt(row, 5).toString());
        t_harga.setText(tbl_barang.getModel().getValueAt(row, 6).toString());
        t_stok.setText(tbl_barang.getModel().getValueAt(row, 7).toString());
        
        aktif();
        btn_tambah1.setText("PERBARUI");
        btn_batal.setVisible(true);
    }
    
    private void aktif() {
        t_namabarang.setEnabled(true);
        cbx_satuan.setEnabled(true);
        t_harga.setEnabled(true);
        t_stok.setEnabled(true);
    }
    private void simpanData(){
        if (validasiInput()==true){
                String kode_barang = t_kodebarang.getText();
                String kode_jenis = t_kodejenisbarang.getText();
                String nama_jenisbarang = t_namajenisbarang.getText();
                String nama_barang = t_namabarang.getText();
                String satuan = cbx_satuan.getSelectedItem().toString();
                Long harga = Long.parseLong(t_harga.getText());
                int stok = Integer.parseInt(t_stok.getText());
                
                model_barang brg = new model_barang();
                model_jenisbarang jbr = new model_jenisbarang();
                
                jbr.setKode_jenis(kode_jenis);
                jbr.setNama_jenis(nama_jenisbarang);
                brg.setKode_barang(kode_barang);
                brg.setNama_barang(nama_barang);
                brg.setSatuan(satuan);
                brg.setHarga(harga);
                brg.setStok(stok);
                
                brg.setJns_barang(jbr);
                
                servis.tambahData(brg);
                tblModel.tambahData(brg);
                loadData();
                resetForm();
                tampilPanel();
                btn_tambah1.setText("TAMBAH");
        }
    }
    private void loadData() {
        btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        List<model_barang> list = servis.ambilData2();
        tblModel.setData(list);
    }
    
    private void perbaruiData() {
        int index = tbl_barang.getSelectedRow();
        if (index!= -1){
            model_barang mobar = tblModel.getData(tbl_barang.convertRowIndexToModel(index));
            if (validasiInput()==true){
                String kode_barang = t_kodebarang.getText();
                String kode_jenis = t_kodejenisbarang.getText();
              //String nama_jenis = t_namajenisbarang.getText();
                String nama_barang = t_namabarang.getText();
                String satuan = cbx_satuan.getSelectedItem().toString();
                Long harga = Long.parseLong(t_harga.getText());
                int stok = Integer.parseInt(t_stok.getText());
                
                model_barang brg = new model_barang();
                model_jenisbarang jbr = new model_jenisbarang();
                
                jbr.setKode_jenis(kode_jenis);
              //jbr.setNama_jenis(nama_jenis);
                brg.setKode_barang(kode_barang);
                brg.setNama_barang(nama_barang);
                brg.setSatuan(satuan);
                brg.setHarga(harga);
                brg.setStok(stok);
                
                brg.setJns_barang(jbr);
                
                servis.perbauriData(brg);
                tblModel.perbaruiData(index,brg);
                loadData();
                resetForm();
                tampilPanel();
            }
        }
    }
    
    private void hapusData() {
        int index = tbl_barang.getSelectedRow();
        if (index != -1) {
            model_barang brg = tblModel.getData(tbl_barang.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION){
                servis.hapusData(brg);
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
        t_kodebarang.setText("");
        t_kodejenisbarang.setText("");
        t_namabarang.setText("");
        t_stok.setText("");
        t_harga.setText("");
    }
    
    private void tampilPanel(){
        mainPanel.removeAll();
        mainPanel.add(new master_barang());
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if(t_kodebarang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kode Barang tidak boleh kosong");
        }else if(t_kodejenisbarang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kode Jenis Barang tidak boleh kosong");
        }else if(t_namajenisbarang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama Jenis  Barang tidak boleh kosong");
        }else if(t_namabarang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nama Barang tidak boleh kosong");
        }else if(cbx_satuan.getSelectedItem().equals(null)) {
            JOptionPane.showMessageDialog(null, "Satuan tidak boleh kosong");
        }else if(t_harga.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Harga tidak boleh kosong");
        }else if(t_stok.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Stok tidak boleh kosong");
        }else{
            valid=true;
        }
        return valid;
    }
    
    private void pencarian(){
        List<model_barang> list = servis.pencarian(t_cari.getText());
        tblModel.setData(list);
    }
}
