package View;

import java.text.NumberFormat;
import java.util.Locale;
import config.koneksi;
import dao.dao_penjualan;
import dao.dao_detpenjualan;
import dao.dao_laporan;
import dao.dao_sempenjualan;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import model.model_barang;
import model.model_penjualan;
import model.model_detpenjualan;
import model.model_member;
import model.model_sempenjualan;
import service.service_penjualan;
import service.service_detpenjualan;
import service.service_sempenjualan;
import service.service_laporan;
import tabelmodel.tablemod_penjualan;
import tabelmodel.tablemod_detpenjualan;
import tabelmodel.tablemod_sempenjualan;


public class transaksi_penjualan extends javax.swing.JPanel {

    private service_penjualan servis_pjl = new dao_penjualan();
    private service_detpenjualan servis_det = new dao_detpenjualan();
    private service_sempenjualan servis_sem = new dao_sempenjualan();
    
    private tablemod_penjualan tblModel_pjl = new tablemod_penjualan();
    private tablemod_detpenjualan tblModel_det = new tablemod_detpenjualan();
    private tablemod_sempenjualan tblModel_sem = new tablemod_sempenjualan();
    
    private service_laporan service_lap = new dao_laporan();
    String selectedNo;
    
    private final int noColumnIndex = 0;
    private final int noColumnWidth = 50;
    
    public transaksi_penjualan(String Id) {
        initComponents();
        lb_id.setText(Id);
        tbl_barang.setModel(tblModel_pjl);
        tbl_detail.setModel(tblModel_det);
        tbl_sementara.setModel(tblModel_sem);
//        setColumnWidth();
        loadData();
        loadDataSementara();
        pn_detail.setVisible(false);
    }
    
//    private void setColumnWidth(){
//        TableColumnModel columnModel = tbl_barang.getColumnModel();
//        columnModel.getColumn(noColumnIndex).setPreferredWidth(noColumnWidth);
//        columnModel.getColumn(noColumnIndex).setMaxWidth(noColumnWidth);
//        columnModel.getColumn(noColumnIndex).setMinWidth(noColumnWidth);
//    }

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
        pn_detail = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_detail = new JTable_Custom.JTable_Custom();
        jLabel10 = new javax.swing.JLabel();
        btn_closedet = new javax.swing.JLabel();
        lb_id = new javax.swing.JLabel();
        btn_print = new rojerusan.RSMaterialButtonRectangle();
        tambahData = new javax.swing.JScrollPane();
        tambahData2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        t_noBarangKeluar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        t_tanggal = new javax.swing.JTextField();
        t_namamember = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btn_tambah1 = new rojerusan.RSMaterialButtonRectangle();
        btn_batal1 = new rojerusan.RSMaterialButtonRectangle();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        t_kodeBarang = new javax.swing.JTextField();
        btn_kodeBarang = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_namaBarang = new javax.swing.JTextField();
        lb_satuan = new javax.swing.JLabel();
        t_satuan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t_harga = new javax.swing.JTextField();
        t_jumlah = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        t_subtotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btn_tambahbarangsementara = new rojerusan.RSMaterialButtonRectangle();
        lb_stok = new javax.swing.JLabel();
        t_stok = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sementara = new JTable_Custom.JTable_Custom();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lb_tobar = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lb_diskon = new javax.swing.JLabel();
        lb_subTotal = new javax.swing.JLabel();
        btn_perbaruidata = new rojerusan.RSMaterialButtonRectangle();
        btn_hapusdata = new rojerusan.RSMaterialButtonRectangle();
        btn_member = new rojerusan.RSMaterialButtonRectangle();

        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        tampilData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Data Penjualan");

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

        tbl_detail.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_detail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jScrollPane3.setViewportView(tbl_detail);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Detail Penjualan");

        btn_closedet.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_closedet.setText("x");
        btn_closedet.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closedetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pn_detailLayout = new javax.swing.GroupLayout(pn_detail);
        pn_detail.setLayout(pn_detailLayout);
        pn_detailLayout.setHorizontalGroup(
            pn_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(pn_detailLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_closedet)
                .addGap(18, 18, 18))
        );
        pn_detailLayout.setVerticalGroup(
            pn_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_detailLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pn_detailLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(btn_closedet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
        );

        lb_id.setForeground(new java.awt.Color(255, 255, 255));
        lb_id.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lb_id.setText("ID");

        btn_print.setBackground(new java.awt.Color(0, 102, 102));
        btn_print.setText("Print");
        btn_print.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_print.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tampilDataLayout = new javax.swing.GroupLayout(tampilData);
        tampilData.setLayout(tampilDataLayout);
        tampilDataLayout.setHorizontalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(t_cari, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE))
                    .addGroup(tampilDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_cari)
                    .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(pn_detail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        tampilDataLayout.setVerticalGroup(
            tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tampilDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_id, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tampilDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_print, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(t_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_cari))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_detail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        mainPanel.add(tampilData, "card2");

        tambahData2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Tambah Penjualan");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("No Penjualan");

        t_noBarangKeluar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_noBarangKeluar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tanggal");

        t_tanggal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_tanggal.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        t_namamember.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_namamember.setText("Kosong");
        t_namamember.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Member");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(t_namamember, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(t_noBarangKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(t_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_namamember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_noBarangKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_tanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_tambah1.setText("SIMPAN");
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

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Kode Barang");

        t_kodeBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_kodeBarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_kodeBarang.setBackground(new java.awt.Color(255, 255, 255));
        btn_kodeBarang.setText("..");
        btn_kodeBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kodeBarangActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Barang");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel7)
                .addContainerGap(173, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel8.setText("Nama Barang");

        t_namaBarang.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_namaBarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lb_satuan.setBackground(new java.awt.Color(255, 255, 255));
        lb_satuan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_satuan.setText("Satuan");

        t_satuan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_satuan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel13.setText("Harga");

        t_harga.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_harga.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        t_jumlah.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_jumlah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        t_jumlah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t_jumlahKeyReleased(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel14.setText("Jumlah Barang");

        t_subtotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_subtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel15.setText("Subtotal");

        btn_tambahbarangsementara.setText("TAMBAH BARANG");
        btn_tambahbarangsementara.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_tambahbarangsementara.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_tambahbarangsementara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahbarangsementaraActionPerformed(evt);
            }
        });

        lb_stok.setBackground(new java.awt.Color(255, 255, 255));
        lb_stok.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_stok.setText("Stok");

        t_stok.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        t_stok.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(t_kodeBarang)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_kodeBarang))
                    .addComponent(t_namaBarang)
                    .addComponent(t_satuan)
                    .addComponent(t_harga)
                    .addComponent(t_jumlah)
                    .addComponent(t_subtotal)
                    .addComponent(btn_tambahbarangsementara, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(t_stok)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(lb_satuan)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(lb_stok))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_kodeBarang))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_satuan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_satuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_stok)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_stok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(t_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_tambahbarangsementara, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_sementara.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_sementara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_sementaraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_sementara);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("DIskon");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("Total Pesan");

        lb_tobar.setBackground(new java.awt.Color(255, 255, 255));
        lb_tobar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_tobar.setText("Total Pesan");

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setText("Subtotal");

        lb_diskon.setBackground(new java.awt.Color(255, 255, 255));
        lb_diskon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_diskon.setText("Diskon");

        lb_subTotal.setBackground(new java.awt.Color(255, 255, 255));
        lb_subTotal.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lb_subTotal.setText("Subtotal");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_tobar))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_subTotal))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb_diskon)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(lb_tobar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(lb_diskon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lb_subTotal)))
        );

        btn_perbaruidata.setText("PERBARUI DATA");
        btn_perbaruidata.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_perbaruidata.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_perbaruidata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_perbaruidataActionPerformed(evt);
            }
        });

        btn_hapusdata.setText("HAPUS DATA");
        btn_hapusdata.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_hapusdata.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_hapusdata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusdataActionPerformed(evt);
            }
        });

        btn_member.setBackground(new java.awt.Color(0, 102, 102));
        btn_member.setText("MEMBER");
        btn_member.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_member.setPreferredSize(new java.awt.Dimension(70, 70));
        btn_member.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_memberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tambahData2Layout = new javax.swing.GroupLayout(tambahData2);
        tambahData2.setLayout(tambahData2Layout);
        tambahData2Layout.setHorizontalGroup(
            tambahData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahData2Layout.createSequentialGroup()
                .addGroup(tambahData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahData2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(tambahData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(tambahData2Layout.createSequentialGroup()
                                .addComponent(btn_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_member, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tambahData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahData2Layout.createSequentialGroup()
                        .addComponent(btn_perbaruidata, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_hapusdata, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tambahData2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        tambahData2Layout.setVerticalGroup(
            tambahData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tambahData2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tambahData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tambahData2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(tambahData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_tambah1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_member, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tambahData2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tambahData2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_perbaruidata, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_hapusdata, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );

        tambahData.setViewportView(tambahData2);

        mainPanel.add(tambahData, "card4");

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
        t_noBarangKeluar.setEnabled(false);
        t_tanggal.setEnabled(false);
        
        t_noBarangKeluar.setText(servis_pjl.nomor());
        
        model_detpenjualan mod_detbrg = new model_detpenjualan();
        servis_det.sumTotal(mod_detbrg);
        lb_tobar.setText(mod_detbrg.getSubtotal_jual().toString());
        setTanggal();
        
        btn_hapusdata.setVisible(false);
        btn_perbaruidata.setVisible(false);
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        hapusData();
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        tampilPanel();
        loadData();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void tbl_barangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_barangMouseClicked
        int row = tbl_barang.getSelectedRow();
        String id = tbl_barang.getValueAt(row, 0).toString();
        btn_hapus.setVisible(true);
        btn_batal.setVisible(true);
        
        pn_detail.setVisible(true);
        List<model_detpenjualan> list = servis_det.getData(id);
        tblModel_det.setData(list);
    }//GEN-LAST:event_tbl_barangMouseClicked

    private void btn_closedetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closedetMouseClicked
        tampilPanel();
        pn_detail.setVisible(false);
        loadData();
    }//GEN-LAST:event_btn_closedetMouseClicked

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        tampilPanel();
        loadData();
        resetForm();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void btn_tambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambah1ActionPerformed
        if(btn_tambah1.getText().equals("TAMBAH")){
                btn_tambah1.setText("SIMPAN");
//                t_kodebarang.setText(servis.nomor());
            } else if (btn_tambah1.getText().equals("SIMPAN")){
                simpanData();
                String no = t_noBarangKeluar.getText();
//                servis_lap.lapSuratPemesananBarang(no);
            }
    }//GEN-LAST:event_btn_tambah1ActionPerformed

    private void btn_kodeBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kodeBarangActionPerformed
        boolean closable = true;
        data_barang datbrg = new data_barang(null, closable);
        datbrg.setVisible(true);
        
        t_kodeBarang.setText(datbrg.brg.getKode_barang());
        t_namaBarang.setText(datbrg.brg.getNama_barang());
        t_satuan.setText(datbrg.brg.getSatuan());
        t_harga.setText(datbrg.brg.getHarga().toString());
        t_stok.setText(datbrg.brg.getStok().toString());
        
        t_jumlah.requestFocus();
        t_kodeBarang.setEnabled(false);
        t_namaBarang.setEnabled(false);
        t_satuan.setEnabled(false);
        t_harga.setEnabled(false);
        t_stok.setEnabled(false);
    }//GEN-LAST:event_btn_kodeBarangActionPerformed

    private void btn_tambahbarangsementaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahbarangsementaraActionPerformed
        String kode = t_kodeBarang.getText();
        String nama = t_namaBarang.getText();
        
        Long harga = Long.parseLong(t_harga.getText());
        int jumlah = Integer.parseInt(t_jumlah.getText());
        Long subtotal = Long.parseLong(t_subtotal.getText());
        String status = "Sedang di pesan";
        
        model_barang brg = new model_barang();
        model_detpenjualan det_brg = new model_detpenjualan();
        model_penjualan keluar = new model_penjualan();
        model_sempenjualan sem = new model_sempenjualan();
        
        brg.setKode_barang(kode);
        brg.setNama_barang(nama);
        brg.setHarga(harga);
        
        det_brg.setJml_jual(jumlah);
        det_brg.setSubtotal_jual(subtotal);
//        psn.setTotal_pesan(tobar);

        sem.setMod_barang(brg);
        sem.setMod_detpenjualan(det_brg);
        
        servis_sem.tambahData(sem);
        servis_det.sumTotal(det_brg);
        lb_tobar.setText(det_brg.getSubtotal_jual().toString());
        
        btn_perbaruidata.setVisible(false);
        btn_hapusdata.setVisible(false);
        
        loadDataSementara();
        
        if(JOptionPane.showConfirmDialog(this, "Mau Tambah Barang Lagi?", "Konifrmasi", JOptionPane.YES_NO_OPTION) 
                == JOptionPane.YES_OPTION){
//            aktif();
            aktifBarang();
            bersihBarang();
            btn_kodeBarang.requestFocus();
        } else {
            aktifBarang();
            bersihBarang();
        }
    }//GEN-LAST:event_btn_tambahbarangsementaraActionPerformed

    private void tbl_sementaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_sementaraMouseClicked
        int row = tbl_sementara.getSelectedRow();
        
        t_kodeBarang.setEnabled(false);
        t_namaBarang.setEnabled(false);
        t_satuan.setEnabled(false);
        t_harga.setEnabled(false);
//        t_stok.setEnabled(false);
        t_subtotal.setEnabled(false);
        
        t_kodeBarang.setText(tbl_sementara.getModel().getValueAt(row, 0).toString());
        t_namaBarang.setText(tbl_sementara.getModel().getValueAt(row, 1).toString());
//        t_satuan.setText(tbl_sementara.getModel().getValueAt(row, 2).toString());
        t_harga.setText(tbl_sementara.getModel().getValueAt(row, 2).toString());
//        t_stok.setText(tbl_sementara.getModel().getValueAt(row, 3).toString());
        t_jumlah.setText(tbl_sementara.getModel().getValueAt(row, 3).toString());
        t_subtotal.setText(tbl_sementara.getModel().getValueAt(row, 4).toString());
        
        t_jumlah.setEnabled(true);
        lb_satuan.setVisible(false);
        lb_stok.setVisible(false);
        t_satuan.setVisible(false);
        t_stok.setVisible(false);
        btn_tambahbarangsementara.setVisible(false);
        
        btn_perbaruidata.setVisible(true);
        btn_hapusdata.setVisible(true);
    }//GEN-LAST:event_tbl_sementaraMouseClicked

    private void btn_perbaruidataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_perbaruidataActionPerformed
        perbaruiDataSementara();
    }//GEN-LAST:event_btn_perbaruidataActionPerformed

    private void btn_hapusdataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusdataActionPerformed
        int index = tbl_sementara.getSelectedRow();
        if (index!=-1) {
            model_sempenjualan model = tblModel_sem.getData(tbl_sementara.convertRowIndexToModel(index));
            if(JOptionPane.showConfirmDialog(null, "Yakin data ini akan dihapus?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                servis_sem.hapusData(model);
                tblModel_sem.hapusData(index);
                loadDataSementara();
                aktifBarang();
                bersihBarang();
                lb_satuan.setVisible(true);
                t_satuan.setVisible(true);
                btn_tambahbarangsementara.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "Pilih dahulu data yang akan diupdate");
            }
            loadDataSementara();
            aktifBarang();
            bersihBarang();
            lb_satuan.setVisible(true);
            t_satuan.setVisible(true);
            btn_tambahbarangsementara.setVisible(true);
        }
    }//GEN-LAST:event_btn_hapusdataActionPerformed

    private void t_jumlahKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_jumlahKeyReleased
        Long harga , subtotal;
        int jumlah;
        
        harga = Long.parseLong(t_harga.getText());
        String inputJumlah = t_jumlah.getText();
        if(inputJumlah.isEmpty()) {
            jumlah = 0;
        }else {
            jumlah = Integer.parseInt(inputJumlah);
        }
        
        subtotal = harga * jumlah;
        t_subtotal.setText(Long.toString(subtotal));
        t_subtotal.setEnabled(false);
        
    }//GEN-LAST:event_t_jumlahKeyReleased

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        int row = tbl_barang.getSelectedRow();
        String no = tbl_barang.getModel().getValueAt(row, 0).toString();
        service_lap.transaksiPenjualan(no);
    }//GEN-LAST:event_btn_printActionPerformed

    private void t_cariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_cariKeyReleased
        pencarian();
    }//GEN-LAST:event_t_cariKeyReleased

    private void btn_memberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_memberActionPerformed
        boolean closable = true;
        data_member mem = new data_member((null), closable);
        mem.setVisible(true);
        
        t_namamember.setText(mem.mod_mem.getNama_member());
        t_namamember.setEnabled(false);
        aktifBarang();
        loadDataSementara();
    }//GEN-LAST:event_btn_memberActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSMaterialButtonRectangle btn_batal;
    private rojerusan.RSMaterialButtonRectangle btn_batal1;
    private javax.swing.JLabel btn_cari;
    private javax.swing.JLabel btn_closedet;
    private rojerusan.RSMaterialButtonRectangle btn_hapus;
    private rojerusan.RSMaterialButtonRectangle btn_hapusdata;
    private javax.swing.JButton btn_kodeBarang;
    private rojerusan.RSMaterialButtonRectangle btn_member;
    private rojerusan.RSMaterialButtonRectangle btn_perbaruidata;
    private rojerusan.RSMaterialButtonRectangle btn_print;
    private rojerusan.RSMaterialButtonRectangle btn_tambah;
    private rojerusan.RSMaterialButtonRectangle btn_tambah1;
    private rojerusan.RSMaterialButtonRectangle btn_tambahbarangsementara;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lb_diskon;
    private javax.swing.JLabel lb_id;
    private javax.swing.JLabel lb_satuan;
    private javax.swing.JLabel lb_stok;
    private javax.swing.JLabel lb_subTotal;
    private javax.swing.JLabel lb_tobar;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel pn_detail;
    private javax.swing.JTextField t_cari;
    private javax.swing.JTextField t_harga;
    private javax.swing.JTextField t_jumlah;
    private javax.swing.JTextField t_kodeBarang;
    private javax.swing.JTextField t_namaBarang;
    private javax.swing.JTextField t_namamember;
    private javax.swing.JTextField t_noBarangKeluar;
    private javax.swing.JTextField t_satuan;
    private javax.swing.JTextField t_stok;
    private javax.swing.JTextField t_subtotal;
    private javax.swing.JTextField t_tanggal;
    private javax.swing.JScrollPane tambahData;
    private javax.swing.JPanel tambahData2;
    private javax.swing.JPanel tampilData;
    private JTable_Custom.JTable_Custom tbl_barang;
    private JTable_Custom.JTable_Custom tbl_detail;
    private JTable_Custom.JTable_Custom tbl_sementara;
    // End of variables declaration//GEN-END:variables

    private void dataTabel(){
        tampilData.setVisible(false);
        tambahData2.setVisible(true);
        
        int row = tbl_barang.getSelectedRow();
        jLabel2.setText("Perbarui Data Barang");
        
        t_noBarangKeluar.setEnabled(false);
        t_tanggal.setEnabled(false);
        
        btn_tambah1.setText("PERBARUI");
        btn_batal.setVisible(true);
    }
    
    private void aktifBarang() {
        t_kodeBarang.setEnabled(true);
        t_namaBarang.setEnabled(true);
        t_harga.setEnabled(true);
        t_satuan.setEnabled(true);
        t_jumlah.setEnabled(true);
        t_subtotal.setEnabled(true);
    }
    
    private void simpanData(){
       
        String no_keluar = t_noBarangKeluar.getText();
        String tgl_keluar = t_tanggal.getText();
        String kode = t_kodeBarang.getText();
        String nama = t_namaBarang.getText();
        String id_peng = t_namamember.getText();
        Long total = parseRupiah(lb_subTotal.getText());

        // ===== Input Pembayaran Cash =====
        String input = JOptionPane.showInputDialog(this, "Masukkan Pembayaran Cash:");
        double bayar = 0.0;
        if (input != null && !input.trim().isEmpty()) {
            try {
                bayar = Double.parseDouble(input.replaceAll("[^0-9]", ""));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Input pembayaran tidak valid, otomatis jadi 0");
                bayar = 0.0;
            }
        }

        // Ambil total dari label (yang sudah diformat rupiah)
        total = parseRupiah(lb_subTotal.getText());

        // Hitung kembalian
        double kembalian = bayar - total;

        // Format rupiah biar rapi
        NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        String strBayar = rupiah.format(bayar);
        String strTotal = rupiah.format(total);
        String strKembalian = rupiah.format(kembalian);

        // Tampilkan info pembayaran
        if (bayar < total) {
            JOptionPane.showMessageDialog(this,
                "Total Belanja : " + strTotal +
                "\nUang Bayar   : " + strBayar +
                "\n⚠️ Uang Anda kurang " + rupiah.format(total - bayar));
        } else {
            JOptionPane.showMessageDialog(this,
                "Total Belanja : " + strTotal +
                "\nUang Bayar   : " + strBayar +
                "\nKembalian    : " + strKembalian);
        }
        model_member pgn = new model_member();
        model_barang brg = new model_barang();
        model_penjualan brg_jual = new model_penjualan();
        model_detpenjualan det = new model_detpenjualan();

        //simpan tabel BARANG KEUAR
        brg_jual.setNo_jual(no_keluar);
        brg_jual.setTgl_jual(tgl_keluar);
        brg_jual.setTotal_jual(total);
        brg_jual.setPembayaran(bayar);
        pgn.setId_member(id_peng);
        brg_jual.setMod_member(pgn);

        //simpan tabel detail pemesanan
        det.setMod_penjualan(brg_jual);
        det.setMod_barang(brg);

        servis_pjl.tambahData(brg_jual);
        servis_det.tambahData(det);
        servis_det.hapusSementara(det);
        tblModel_pjl.tambahData(brg_jual);
        tampilPanel();
        loadData();
        resetForm();
    }
    private void loadData() {
        btn_hapus.setVisible(false);
        btn_batal.setVisible(false);
        List<model_penjualan> list = servis_pjl.getData();
        tblModel_pjl.setData(list);
    }
    
    private void loadDataSementara() {
       List<model_sempenjualan> list = servis_sem.getData();
       tblModel_sem.setData(list);
       hitungDiskon();
       
    }
    
    private void perbaruiDataSementara() {
        int index = tbl_sementara.getSelectedRow();
        if (index!= -1){
            model_sempenjualan mosem = tblModel_sem.getData(tbl_sementara.convertRowIndexToModel(index));
            
                String kode = t_kodeBarang.getText();
                String nama = t_namaBarang.getText();
                Long harga = Long.parseLong(t_harga.getText());
                int jumlah = Integer.parseInt(t_jumlah.getText());
                Long subtotal = Long.parseLong(t_subtotal.getText());
                
                model_barang brg = new model_barang();
                model_sempenjualan sem = new model_sempenjualan();
                model_detpenjualan det = new model_detpenjualan();
                
                brg.setKode_barang(kode);
                brg.setNama_barang(nama);
                brg.setHarga(harga);
                
                det.setJml_jual(jumlah);
                det.setSubtotal_jual(subtotal);
                
                sem.setMod_barang(brg);
                sem.setMod_detpenjualan(det);
                
                servis_sem.perbaruiData(sem);
                tblModel_sem.perbaruiData(index,sem);
                servis_det.sumTotal(det);
                lb_tobar.setText(det.getSubtotal_jual().toString());
                
                btn_tambahbarangsementara.setVisible(true);
                
                loadDataSementara();
                bersihBarang();
        }
    }
    
    private void hapusData() {
        int index = tbl_barang.getSelectedRow();
        if (index != -1) {
            model_penjualan brg = tblModel_pjl.getData(tbl_barang.convertRowIndexToModel(index));
            if (JOptionPane.showConfirmDialog(null, "Yakin data akan dihapus?", "Konfirmasi", JOptionPane.OK_CANCEL_OPTION)== JOptionPane.OK_OPTION){
                servis_pjl.hapusData(brg);
                tblModel_pjl.hapusData(index);
                loadData();
                resetForm();
                pn_detail.setVisible(false);
            }
        } else{
            JOptionPane.showMessageDialog(null, "Pilih dahulu record yang akan diupdate");
        }
    }
    
    private void resetForm(){
        t_kodeBarang.setText("");
        t_namaBarang.setText("");
        t_harga.setText("");
        t_satuan.setText("");
        t_stok.setText("");
        t_jumlah.setText("");
        t_subtotal.setText("");
    }
    
    private void bersihBarang() {
        t_kodeBarang.setText("");
        t_namaBarang.setText("");
        t_harga.setText("");
        t_satuan.setText("");
        t_stok.setText("");
        t_jumlah.setText("");
        t_subtotal.setText("");
    }
    
    private void tampilPanel(){
        mainPanel.removeAll();
        String Id = lb_id.getText();
        mainPanel.add(new transaksi_penjualan(Id));
        mainPanel.repaint();
        mainPanel.revalidate();
    }
    
    private void hitungDiskon() {
    // ambil semua data dari tabel sementara
    List<model_sempenjualan> list = servis_sem.getData();
    
    long totalPesan = 0;
    for (model_sempenjualan sem : list) {
        totalPesan += sem.getMod_detpenjualan().getSubtotal_jual();
    }
    
    double diskon = 0;
    double subTotal = totalPesan;
    
    // cek member
    if (!t_namamember.getText().equalsIgnoreCase("Kosong") && !t_namamember.getText().trim().isEmpty()) {
        diskon = totalPesan * 0.05; // diskon 5%
        subTotal = totalPesan - diskon;
    }
    
    // format rupiah
    NumberFormat rupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
    
    lb_tobar.setText(rupiah.format(totalPesan));
    lb_diskon.setText(rupiah.format(diskon));
    lb_subTotal.setText(rupiah.format(subTotal));
}

    
    private boolean validasiInput(){
        boolean valid = false;
        if(t_kodeBarang.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Kode Barang tidak boleh kosong");
        }else if(t_jumlah.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Jumlah Barang tidak boleh kosong");
        }else{
            valid=true;
        }
        return valid;
    }
    
    private void pencarian(){
        List<model_penjualan> list = servis_pjl.pencarian(t_cari.getText());
        tblModel_pjl.setData(list);
    }


    private void setTanggal() {
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
        t_tanggal.setText(kal.format(sekarang));
    }
    
    private Long parseRupiah(String text) {
    if (text == null || text.isEmpty()) {
        return 0L;
    }
    // hapus Rp, titik, koma
    String cleaned = text.replace("Rp", "")
                         .replace(".", "")
                         .replace(",00", "")
                         .trim();
    return Long.parseLong(cleaned);
    }
    
}