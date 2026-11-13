package View;

import dao.dao_laporan;
import service.service_laporan;

public class laporan_barang extends javax.swing.JPanel {

    private service_laporan servis_lap = new dao_laporan();
    
    private final int noColumnIndex = 0;
    private final int noColumnWidth = 50;
    
    public laporan_barang(String Id) {
        initComponents();
        lb_id.setText(Id);
        cbx_laporan.setSelectedItem("-- Pilih Jenis Laporan --");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        tampilData = new javax.swing.JPanel();
        pn_pilih_laporan = new javax.swing.JPanel();
        cbx_laporan = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        pn_main = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_batal = new rojerusan.RSMaterialButtonRectangle();
        pn_databarang = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_printDataBarang = new rojerusan.RSMaterialButtonRectangle();
        pn_transaksibarang = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_printTransaksiBarang = new rojerusan.RSMaterialButtonRectangle();
        lb_id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_tampil_laporan = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        pn_pilih_laporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_laporan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_laporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Jenis Laporan --", "Laporan Data Barang", "Laporan Transaksi Barang" }));
        cbx_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_laporanActionPerformed(evt);
            }
        });
        pn_pilih_laporan.add(cbx_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 43, 280, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Pilih Jenis Laporan");
        pn_pilih_laporan.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));

        pn_main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Silakan Pilih Jenis Laporan");

        javax.swing.GroupLayout pn_mainLayout = new javax.swing.GroupLayout(pn_main);
        pn_main.setLayout(pn_mainLayout);
        pn_mainLayout.setHorizontalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_mainLayout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(71, 71, 71))
        );
        pn_mainLayout.setVerticalGroup(
            pn_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_mainLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel4)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pn_pilih_laporan.add(pn_main, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 280, -1));

        btn_batal.setBackground(new java.awt.Color(255, 255, 0));
        btn_batal.setForeground(new java.awt.Color(0, 0, 0));
        btn_batal.setText("KEMBALI");
        btn_batal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_batal.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });
        pn_pilih_laporan.add(btn_batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 386, 280, 41));

        pn_databarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Laporan Data Barang");

        btn_printDataBarang.setBackground(new java.awt.Color(255, 255, 0));
        btn_printDataBarang.setForeground(new java.awt.Color(0, 0, 0));
        btn_printDataBarang.setText("PRINT");
        btn_printDataBarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_printDataBarang.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_printDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printDataBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_databarangLayout = new javax.swing.GroupLayout(pn_databarang);
        pn_databarang.setLayout(pn_databarangLayout);
        pn_databarangLayout.setHorizontalGroup(
            pn_databarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_databarangLayout.createSequentialGroup()
                .addGroup(pn_databarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_databarangLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel5))
                    .addGroup(pn_databarangLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(btn_printDataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        pn_databarangLayout.setVerticalGroup(
            pn_databarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_databarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(btn_printDataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pn_pilih_laporan.add(pn_databarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 280, -1));

        pn_transaksibarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Laporan Transaksi Barang");

        btn_printTransaksiBarang.setBackground(new java.awt.Color(255, 255, 0));
        btn_printTransaksiBarang.setForeground(new java.awt.Color(0, 0, 0));
        btn_printTransaksiBarang.setText("PRINT");
        btn_printTransaksiBarang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_printTransaksiBarang.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_printTransaksiBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printTransaksiBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_transaksibarangLayout = new javax.swing.GroupLayout(pn_transaksibarang);
        pn_transaksibarang.setLayout(pn_transaksibarangLayout);
        pn_transaksibarangLayout.setHorizontalGroup(
            pn_transaksibarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transaksibarangLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btn_printTransaksiBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_transaksibarangLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(37, 37, 37))
        );
        pn_transaksibarangLayout.setVerticalGroup(
            pn_transaksibarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transaksibarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(btn_printTransaksiBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pn_pilih_laporan.add(pn_transaksibarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 280, -1));

        lb_id.setForeground(new java.awt.Color(255, 255, 255));
        lb_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_id.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Laporan Barang");

        javax.swing.GroupLayout pn_tampil_laporanLayout = new javax.swing.GroupLayout(pn_tampil_laporan);
        pn_tampil_laporan.setLayout(pn_tampil_laporanLayout);
        pn_tampil_laporanLayout.setHorizontalGroup(
            pn_tampil_laporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );
        pn_tampil_laporanLayout.setVerticalGroup(
            pn_tampil_laporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pn_pilih_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_tampil_laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tampilDataLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel2)
                    .addContainerGap(703, Short.MAX_VALUE)))
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_pilih_laporan, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                    .addComponent(pn_tampil_laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(tampilDataLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel2)
                    .addContainerGap(527, Short.MAX_VALUE)))
        );

        mainPanel.add(tampilData, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        tampilPanel();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_printDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printDataBarangActionPerformed
        pn_tampil_laporan.removeAll();
        servis_lap.lapDataBarang(pn_tampil_laporan);
    }//GEN-LAST:event_btn_printDataBarangActionPerformed

    private void btn_printTransaksiBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printTransaksiBarangActionPerformed
        pn_tampil_laporan.removeAll();
        servis_lap.lapTransaksiBarang(pn_tampil_laporan);
    }//GEN-LAST:event_btn_printTransaksiBarangActionPerformed

    private void cbx_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_laporanActionPerformed
        if(cbx_laporan.getSelectedItem() == "-- Pilih Jenis Laporan --"){
            pn_main.setVisible(true);
            pn_databarang.setVisible(false);
            pn_transaksibarang.setVisible(false);
        } else if(cbx_laporan.getSelectedItem() == "Laporan Data Barang"){
            pn_main.setVisible(false);
            pn_databarang.setVisible(true);
            pn_transaksibarang.setVisible(false);
        } else if(cbx_laporan.getSelectedItem() == "Laporan Transaksi Barang"){
            pn_main.setVisible(false);
            pn_databarang.setVisible(false);
            pn_transaksibarang.setVisible(true);
        }
    }//GEN-LAST:event_cbx_laporanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private rojerusan.RSMaterialButtonRectangle btn_printDataBarang;
    private rojerusan.RSMaterialButtonRectangle btn_printTransaksiBarang;
    private javax.swing.JComboBox<String> cbx_laporan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb_id;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pn_databarang;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_pilih_laporan;
    private javax.swing.JPanel pn_tampil_laporan;
    private javax.swing.JPanel pn_transaksibarang;
    private javax.swing.JPanel tampilData;
    // End of variables declaration//GEN-END:variables

    private void tampilPanel(){
        mainPanel.removeAll();
        String Id = lb_id.getText();
        mainPanel.add(new laporan_barang(Id));
        mainPanel.repaint();
        mainPanel.revalidate();
    }
}