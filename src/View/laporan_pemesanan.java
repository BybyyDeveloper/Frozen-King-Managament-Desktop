package View;

import dao.dao_laporan;
import java.text.SimpleDateFormat;
import service.service_laporan;

public class laporan_pemesanan extends javax.swing.JPanel {

    private service_laporan servis_lap = new dao_laporan();
    
    private final int noColumnIndex = 0;
    private final int noColumnWidth = 50;
    
    public laporan_pemesanan(String Id) {
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
        pn_pertransaksi = new javax.swing.JPanel();
        btn_printNoTransaksi = new rojerusan.RSMaterialButtonRectangle();
        t_notransaksi = new javax.swing.JTextField();
        btn_pilihnotransaksi = new rojerusan.RSMaterialButtonRectangle();
        jLabel3 = new javax.swing.JLabel();
        pn_perperiode = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_printPerPeriode = new rojerusan.RSMaterialButtonRectangle();
        jLabel8 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        pn_perbulan = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btn_printPerBulan = new rojerusan.RSMaterialButtonRectangle();
        jLabel10 = new javax.swing.JLabel();
        cbx_pilihbulan = new javax.swing.JComboBox<>();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        pn_persupplier = new javax.swing.JPanel();
        btn_printPerSupplier = new rojerusan.RSMaterialButtonRectangle();
        t_supplier = new javax.swing.JTextField();
        btn_pilihsupplier = new rojerusan.RSMaterialButtonRectangle();
        jLabel5 = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        pn_tampil_laporan = new javax.swing.JPanel();

        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        pn_pilih_laporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_laporan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbx_laporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Jenis Laporan --", "Per Transaksi", "Per Supplier", "Per Periode", "Per Bulan" }));
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

        pn_pertransaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_printNoTransaksi.setBackground(new java.awt.Color(255, 255, 0));
        btn_printNoTransaksi.setForeground(new java.awt.Color(0, 0, 0));
        btn_printNoTransaksi.setText("PRINT");
        btn_printNoTransaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_printNoTransaksi.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_printNoTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printNoTransaksiActionPerformed(evt);
            }
        });

        t_notransaksi.setText("No Transaksi");

        btn_pilihnotransaksi.setBackground(new java.awt.Color(255, 255, 0));
        btn_pilihnotransaksi.setForeground(new java.awt.Color(0, 0, 0));
        btn_pilihnotransaksi.setText("PILIH");
        btn_pilihnotransaksi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pilihnotransaksi.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_pilihnotransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihnotransaksiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Pilih No Transaksi");

        javax.swing.GroupLayout pn_pertransaksiLayout = new javax.swing.GroupLayout(pn_pertransaksi);
        pn_pertransaksi.setLayout(pn_pertransaksiLayout);
        pn_pertransaksiLayout.setHorizontalGroup(
            pn_pertransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pertransaksiLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btn_printNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_pertransaksiLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_pertransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_pertransaksiLayout.createSequentialGroup()
                        .addComponent(t_notransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pilihnotransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_pertransaksiLayout.setVerticalGroup(
            pn_pertransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_pertransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_pertransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pilihnotransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_notransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(btn_printNoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pn_pilih_laporan.add(pn_pertransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 280, -1));

        pn_perperiode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Dari Tanggal");

        btn_printPerPeriode.setBackground(new java.awt.Color(255, 255, 0));
        btn_printPerPeriode.setForeground(new java.awt.Color(0, 0, 0));
        btn_printPerPeriode.setText("PRINT");
        btn_printPerPeriode.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_printPerPeriode.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_printPerPeriode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printPerPeriodeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Sampai Tanggal");

        javax.swing.GroupLayout pn_perperiodeLayout = new javax.swing.GroupLayout(pn_perperiode);
        pn_perperiode.setLayout(pn_perperiodeLayout);
        pn_perperiodeLayout.setHorizontalGroup(
            pn_perperiodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perperiodeLayout.createSequentialGroup()
                .addGroup(pn_perperiodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_perperiodeLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel7))
                    .addGroup(pn_perperiodeLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btn_printPerPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_perperiodeLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_perperiodeLayout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(pn_perperiodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        pn_perperiodeLayout.setVerticalGroup(
            pn_perperiodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perperiodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_printPerPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pn_pilih_laporan.add(pn_perperiode, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 280, -1));

        pn_perbulan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Bulan");

        btn_printPerBulan.setBackground(new java.awt.Color(255, 255, 0));
        btn_printPerBulan.setForeground(new java.awt.Color(0, 0, 0));
        btn_printPerBulan.setText("PRINT");
        btn_printPerBulan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_printPerBulan.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_printPerBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printPerBulanActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Tahun");

        cbx_pilihbulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Bulan --", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        javax.swing.GroupLayout pn_perbulanLayout = new javax.swing.GroupLayout(pn_perbulan);
        pn_perbulan.setLayout(pn_perbulanLayout);
        pn_perbulanLayout.setHorizontalGroup(
            pn_perbulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perbulanLayout.createSequentialGroup()
                .addGroup(pn_perbulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_perbulanLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(btn_printPerBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_perbulanLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel9))
                    .addGroup(pn_perbulanLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_perbulanLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(pn_perbulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbx_pilihbulan, 0, 234, Short.MAX_VALUE)
                    .addComponent(jYearChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        pn_perbulanLayout.setVerticalGroup(
            pn_perbulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perbulanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbx_pilihbulan, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_printPerBulan, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pn_pilih_laporan.add(pn_perbulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 280, -1));

        pn_persupplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_printPerSupplier.setBackground(new java.awt.Color(255, 255, 0));
        btn_printPerSupplier.setForeground(new java.awt.Color(0, 0, 0));
        btn_printPerSupplier.setText("PRINT");
        btn_printPerSupplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_printPerSupplier.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_printPerSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printPerSupplierActionPerformed(evt);
            }
        });

        t_supplier.setText("Supplier");

        btn_pilihsupplier.setBackground(new java.awt.Color(255, 255, 0));
        btn_pilihsupplier.setForeground(new java.awt.Color(0, 0, 0));
        btn_pilihsupplier.setText("PILIH");
        btn_pilihsupplier.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_pilihsupplier.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_pilihsupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pilihsupplierActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Pilih Supplier");

        javax.swing.GroupLayout pn_persupplierLayout = new javax.swing.GroupLayout(pn_persupplier);
        pn_persupplier.setLayout(pn_persupplierLayout);
        pn_persupplierLayout.setHorizontalGroup(
            pn_persupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_persupplierLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btn_printPerSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_persupplierLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_persupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_persupplierLayout.createSequentialGroup()
                        .addComponent(t_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_pilihsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pn_persupplierLayout.setVerticalGroup(
            pn_persupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_persupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(pn_persupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_pilihsupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(btn_printPerSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pn_pilih_laporan.add(pn_persupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 280, -1));

        lb_id.setForeground(new java.awt.Color(255, 255, 255));
        lb_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_id.setText("ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Laporan Pemesanan Barang");

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
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(pn_pilih_laporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pn_tampil_laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_pilih_laporan, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                    .addComponent(pn_tampil_laporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainPanel.add(tampilData, "card2");

        add(mainPanel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        tampilPanel();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_printNoTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printNoTransaksiActionPerformed
        pn_tampil_laporan.removeAll();
        String no = t_notransaksi.getText();
        servis_lap.lapPemesananPerTransaksi(pn_tampil_laporan,no);
    }//GEN-LAST:event_btn_printNoTransaksiActionPerformed

    private void btn_printPerPeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printPerPeriodeActionPerformed
        pn_tampil_laporan.removeAll();
        String tgl = "yyyy-MM-dd";
        SimpleDateFormat fm = new SimpleDateFormat(tgl);
        
        String tgl1 = String.valueOf(fm.format(jDateChooser1.getDate()));
        String tgl2 = String.valueOf(fm.format(jDateChooser2.getDate()));
        
        servis_lap.lapPemesananPerPeriode(pn_tampil_laporan, tgl1, tgl2);
    }//GEN-LAST:event_btn_printPerPeriodeActionPerformed

    private void cbx_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_laporanActionPerformed
        if(cbx_laporan.getSelectedItem() == "-- Pilih Jenis Laporan --"){
            pn_main.setVisible(true);
            pn_pertransaksi.setVisible(false);
            pn_perperiode.setVisible(false);
            pn_perbulan.setVisible(false);
            pn_persupplier.setVisible(false);
        } else if(cbx_laporan.getSelectedItem() == "Per Transaksi"){
            pn_main.setVisible(false);
            pn_pertransaksi.setVisible(true);
            pn_perperiode.setVisible(false);
            pn_perbulan.setVisible(false);
            pn_persupplier.setVisible(false);
        } else if(cbx_laporan.getSelectedItem() == "Per Periode"){
            pn_main.setVisible(false);
            pn_pertransaksi.setVisible(false);
            pn_perperiode.setVisible(true);
            pn_perbulan.setVisible(false);
            pn_persupplier.setVisible(false);
        } else if(cbx_laporan.getSelectedItem() == "Per Bulan"){
            pn_main.setVisible(false);
            pn_pertransaksi.setVisible(false);
            pn_perperiode.setVisible(false);
            pn_perbulan.setVisible(true);
            pn_persupplier.setVisible(false);
        } else if(cbx_laporan.getSelectedItem() == "Per Supplier"){
            pn_main.setVisible(false);
            pn_pertransaksi.setVisible(false);
            pn_perperiode.setVisible(false);
            pn_perbulan.setVisible(false);
            pn_persupplier.setVisible(true);
        }
    }//GEN-LAST:event_cbx_laporanActionPerformed

    private void btn_pilihnotransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihnotransaksiActionPerformed
        boolean closable = true;
        data_pemesanan data = new data_pemesanan(null, closable);
        data.setVisible(true);
        
        t_notransaksi.setText(data.psn.getNo_pesan());
    }//GEN-LAST:event_btn_pilihnotransaksiActionPerformed

    private void btn_printPerBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printPerBulanActionPerformed
        pn_tampil_laporan.removeAll();
        
        String bulan = cbx_pilihbulan.getSelectedItem().toString();
        int tahun = jYearChooser1.getYear();
        
        servis_lap.lapPemesananPerBulan(pn_tampil_laporan, bulan, tahun);
    }//GEN-LAST:event_btn_printPerBulanActionPerformed

    private void btn_printPerSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printPerSupplierActionPerformed
        pn_tampil_laporan.removeAll();
        String id = t_supplier.getText();
        servis_lap.lapPemesananPerSupplier(pn_tampil_laporan,id);
    }//GEN-LAST:event_btn_printPerSupplierActionPerformed

    private void btn_pilihsupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pilihsupplierActionPerformed
        boolean closable = true;
        data_supplier data = new data_supplier(null, closable);
        data.setVisible(true);
        
        t_supplier.setText(data.sup.getId_supplier());
    }//GEN-LAST:event_btn_pilihsupplierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private rojerusan.RSMaterialButtonRectangle btn_pilihnotransaksi;
    private rojerusan.RSMaterialButtonRectangle btn_pilihsupplier;
    private rojerusan.RSMaterialButtonRectangle btn_printNoTransaksi;
    private rojerusan.RSMaterialButtonRectangle btn_printPerBulan;
    private rojerusan.RSMaterialButtonRectangle btn_printPerPeriode;
    private rojerusan.RSMaterialButtonRectangle btn_printPerSupplier;
    private javax.swing.JComboBox<String> cbx_laporan;
    private javax.swing.JComboBox<String> cbx_pilihbulan;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JLabel lb_id;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pn_main;
    private javax.swing.JPanel pn_perbulan;
    private javax.swing.JPanel pn_perperiode;
    private javax.swing.JPanel pn_persupplier;
    private javax.swing.JPanel pn_pertransaksi;
    private javax.swing.JPanel pn_pilih_laporan;
    private javax.swing.JPanel pn_tampil_laporan;
    private javax.swing.JTextField t_notransaksi;
    private javax.swing.JTextField t_supplier;
    private javax.swing.JPanel tampilData;
    // End of variables declaration//GEN-END:variables
  
    private void tampilPanel(){
        mainPanel.removeAll();
        String Id = lb_id.getText();
        mainPanel.add(new laporan_pemesanan(Id));
        mainPanel.repaint();
        mainPanel.revalidate();
    }
}