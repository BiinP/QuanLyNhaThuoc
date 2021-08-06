/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlnt.ui;

import com.qlnt.dao.DanhMucThuocDAO;
import com.qlnt.dao.HangHoaDAO;
import com.qlnt.dao.HoaDonChiTietDAO;
import com.qlnt.dao.HoaDonDAO;
import com.qlnt.dao.KhachHangDAO;
import com.qlnt.dao.NhanVienDAO;
import com.qlnt.entity.HangHoa;
import com.qlnt.entity.HoaDon;
import com.qlnt.entity.HoaDonChiTiet;
import com.qlnt.entity.KhachHang;
import com.qlnt.util.Auth;
import com.qlnt.util.MsgBox;
import com.qlnt.util.XDate;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import static java.awt.Frame.HAND_CURSOR;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monst
 */
public class QLHoaDonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TongQuanJPannel
     */
    public QLHoaDonJPanel() {
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grGioiTinh = new javax.swing.ButtonGroup();
        grVaiTro = new javax.swing.ButtonGroup();
        pnlMaHD = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstMaHD = new javax.swing.JList<>();
        popMaHD = new javax.swing.JPopupMenu();
        pnlTenKH = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstTenKH = new javax.swing.JList<>();
        popTenKH = new javax.swing.JPopupMenu();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtMaNV = new javax.swing.JTextField();
        txtMaKH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        txtNgayBan = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnXoa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblChiTietHD = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        lblTongTien = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblTim = new javax.swing.JLabel();
        txtHDTimKiem = new javax.swing.JTextField();
        txtKHTimKiem = new javax.swing.JTextField();
        lblTim1 = new javax.swing.JLabel();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHoaDon = new javax.swing.JTable();
        btnCuoi = new javax.swing.JButton();
        btnKe = new javax.swing.JButton();
        btnLui = new javax.swing.JButton();
        btnDau = new javax.swing.JButton();

        lstMaHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstMaHDMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(lstMaHD);

        javax.swing.GroupLayout pnlMaHDLayout = new javax.swing.GroupLayout(pnlMaHD);
        pnlMaHD.setLayout(pnlMaHDLayout);
        pnlMaHDLayout.setHorizontalGroup(
            pnlMaHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        pnlMaHDLayout.setVerticalGroup(
            pnlMaHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        popMaHD.setFocusable(false);

        lstTenKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstTenKHMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(lstTenKH);

        javax.swing.GroupLayout pnlTenKHLayout = new javax.swing.GroupLayout(pnlTenKH);
        pnlTenKH.setLayout(pnlTenKHLayout);
        pnlTenKHLayout.setHorizontalGroup(
            pnlTenKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        pnlTenKHLayout.setVerticalGroup(
            pnlTenKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        popTenKH.setFocusable(false);

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 570));
        setMinimumSize(new java.awt.Dimension(1000, 570));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 140, 180));
        jPanel2.setMaximumSize(new java.awt.Dimension(500, 610));
        jPanel2.setMinimumSize(new java.awt.Dimension(500, 610));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã hóa đơn:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Mã nhân viên:");

        txtMaHD.setEditable(false);
        txtMaHD.setBackground(new java.awt.Color(51, 140, 180));
        txtMaHD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaHD.setForeground(new java.awt.Color(255, 255, 255));
        txtMaHD.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaHD.setOpaque(false);
        txtMaHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHDActionPerformed(evt);
            }
        });

        txtMaNV.setEditable(false);
        txtMaNV.setBackground(new java.awt.Color(51, 140, 180));
        txtMaNV.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaNV.setForeground(new java.awt.Color(255, 255, 255));
        txtMaNV.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaNV.setOpaque(false);

        txtMaKH.setEditable(false);
        txtMaKH.setBackground(new java.awt.Color(51, 140, 180));
        txtMaKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaKH.setForeground(new java.awt.Color(255, 255, 255));
        txtMaKH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaKH.setOpaque(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mã khách hàng:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tên khách hàng:");

        txtTenKH.setEditable(false);
        txtTenKH.setBackground(new java.awt.Color(51, 140, 180));
        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenKH.setForeground(new java.awt.Color(255, 255, 255));
        txtTenKH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTenKH.setOpaque(false);

        txtNgayBan.setEditable(false);
        txtNgayBan.setBackground(new java.awt.Color(51, 140, 180));
        txtNgayBan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNgayBan.setForeground(new java.awt.Color(255, 255, 255));
        txtNgayBan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtNgayBan.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ngày bán:");

        btnXoa.setBackground(new java.awt.Color(59, 151, 203));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnXoa.png"))); // NOI18N
        btnXoa.setBorder(null);
        btnXoa.setContentAreaFilled(false);
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnXoaMouseEntered(evt);
            }
        });
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 140, 180));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chi tiết hóa đơn", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        tblChiTietHD.setAutoCreateRowSorter(true);
        tblChiTietHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Tên HH", "Số lô", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblChiTietHD.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblChiTietHD.setFocusable(false);
        tblChiTietHD.setOpaque(false);
        tblChiTietHD.setRequestFocusEnabled(false);
        tblChiTietHD.setRowHeight(25);
        tblChiTietHD.setShowHorizontalLines(false);
        tblChiTietHD.setShowVerticalLines(false);
        tblChiTietHD.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblChiTietHD);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tổng Tiền:");

        lblTongTien.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTongTien.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTenKH)
                            .addComponent(txtMaKH)
                            .addComponent(txtMaNV)
                            .addComponent(txtMaHD)
                            .addComponent(txtNgayBan))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 2, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addComponent(txtNgayBan, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 610));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(500, 610));
        jPanel3.setMinimumSize(new java.awt.Dimension(500, 610));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 610));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTim.setText("Nhập mã hóa đơn:");
        lblTim.setMaximumSize(new java.awt.Dimension(30, 30));
        lblTim.setMinimumSize(new java.awt.Dimension(30, 30));
        lblTim.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.add(lblTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, -1));

        txtHDTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtHDTimKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtHDTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtHDTimKiemKeyReleased(evt);
            }
        });
        jPanel3.add(txtHDTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 320, 32));

        txtKHTimKiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtKHTimKiem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtKHTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKHTimKiemKeyReleased(evt);
            }
        });
        jPanel3.add(txtKHTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 320, 32));

        lblTim1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTim1.setText("Tên khách hàng:");
        lblTim1.setMaximumSize(new java.awt.Dimension(30, 30));
        lblTim1.setMinimumSize(new java.awt.Dimension(30, 30));
        lblTim1.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.add(lblTim1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, -1));

        btnTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnTimKiem.png"))); // NOI18N
        btnTimKiem.setBorder(null);
        btnTimKiem.setContentAreaFilled(false);
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });
        jPanel3.add(btnTimKiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, -1));

        tblHoaDon.setAutoCreateRowSorter(true);
        tblHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã HD", "Tên KH", "Tên NV", "Tổng tiền", "Ngày tạo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHoaDon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblHoaDon.setFocusable(false);
        tblHoaDon.setOpaque(false);
        tblHoaDon.setRequestFocusEnabled(false);
        tblHoaDon.setRowHeight(25);
        tblHoaDon.setShowHorizontalLines(false);
        tblHoaDon.setShowVerticalLines(false);
        tblHoaDon.getTableHeader().setReorderingAllowed(false);
        tblHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHoaDonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblHoaDon);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 470, 300));

        btnCuoi.setBackground(new java.awt.Color(59, 151, 203));
        btnCuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnCuoi.png"))); // NOI18N
        btnCuoi.setBorder(null);
        btnCuoi.setContentAreaFilled(false);
        btnCuoi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCuoiMouseEntered(evt);
            }
        });
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });
        jPanel3.add(btnCuoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, -1, -1));

        btnKe.setBackground(new java.awt.Color(59, 151, 203));
        btnKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnKeTiep.png"))); // NOI18N
        btnKe.setBorder(null);
        btnKe.setContentAreaFilled(false);
        btnKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKeMouseEntered(evt);
            }
        });
        btnKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeActionPerformed(evt);
            }
        });
        jPanel3.add(btnKe, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        btnLui.setBackground(new java.awt.Color(59, 151, 203));
        btnLui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnLui.png"))); // NOI18N
        btnLui.setBorder(null);
        btnLui.setContentAreaFilled(false);
        btnLui.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLuiMouseEntered(evt);
            }
        });
        btnLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuiActionPerformed(evt);
            }
        });
        jPanel3.add(btnLui, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, -1, -1));

        btnDau.setBackground(new java.awt.Color(59, 151, 203));
        btnDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnDau.png"))); // NOI18N
        btnDau.setBorder(null);
        btnDau.setContentAreaFilled(false);
        btnDau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDauMouseEntered(evt);
            }
        });
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });
        jPanel3.add(btnDau, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, 510, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaHDActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        timHoaDon();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    private void lstMaHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstMaHDMouseClicked
        txtHDTimKiem.setText(lstMaHD.getSelectedValue());
        popMaHD.setVisible(false);
    }//GEN-LAST:event_lstMaHDMouseClicked

    private void lstTenKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstTenKHMouseClicked
        txtKHTimKiem.setText(lstTenKH.getSelectedValue());
        popTenKH.setVisible(false);
    }//GEN-LAST:event_lstTenKHMouseClicked

    private void txtHDTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtHDTimKiemKeyReleased
        String keyTenKH = txtHDTimKiem.getText().trim();
        if (!keyTenKH.equals("")) {
            List<HoaDon> list = dao.selectNotInCourse(keyTenKH, "");
            DefaultListModel model = new DefaultListModel();
            model.setSize(0);
            for (HoaDon hd : list) {
                model.addElement(hd.getMaHD());
                lstMaHD.setModel(model);
            }
            popMaHD.show(txtHDTimKiem, 0, txtHDTimKiem.getHeight());
        }
    }//GEN-LAST:event_txtHDTimKiemKeyReleased

    private void txtKHTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKHTimKiemKeyReleased
        String keyTenKH = txtKHTimKiem.getText().trim();
        if (!keyTenKH.equals("")) {
            List<KhachHang> list = khdao.selectNotInCourse(keyTenKH);
            DefaultListModel model = new DefaultListModel();
            model.setSize(0);
            for (KhachHang kh : list) {
                model.addElement(kh.getHoTen());
                lstTenKH.setModel(model);
            }
            popTenKH.show(txtKHTimKiem, 0, txtKHTimKiem.getHeight());
        }
    }//GEN-LAST:event_txtKHTimKiemKeyReleased

    private void tblHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHoaDonMouseClicked

            this.row = tblHoaDon.getSelectedRow();
            this.edit();
        
    }//GEN-LAST:event_tblHoaDonMouseClicked

    private void btnXoaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseEntered
        btnXoa.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnXoaMouseEntered

    private void btnDauMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDauMouseEntered
        btnDau.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnDauMouseEntered

    private void btnLuiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLuiMouseEntered
        btnLui.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnLuiMouseEntered

    private void btnKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeMouseEntered
        btnDau.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnKeMouseEntered

    private void btnCuoiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCuoiMouseEntered
        btnCuoi.setCursor(new Cursor(HAND_CURSOR));
    }//GEN-LAST:event_btnCuoiMouseEntered

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        first();
    }//GEN-LAST:event_btnDauActionPerformed

    private void btnLuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuiActionPerformed
        prev();
    }//GEN-LAST:event_btnLuiActionPerformed

    private void btnKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeActionPerformed
        next();
    }//GEN-LAST:event_btnKeActionPerformed

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        last();
    }//GEN-LAST:event_btnCuoiActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnKe;
    private javax.swing.JButton btnLui;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup grGioiTinh;
    private javax.swing.ButtonGroup grVaiTro;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblTim;
    private javax.swing.JLabel lblTim1;
    private javax.swing.JLabel lblTongTien;
    private javax.swing.JList<String> lstMaHD;
    private javax.swing.JList<String> lstTenKH;
    private javax.swing.JPanel pnlMaHD;
    private javax.swing.JPanel pnlTenKH;
    private javax.swing.JPopupMenu popMaHD;
    private javax.swing.JPopupMenu popTenKH;
    private javax.swing.JTable tblChiTietHD;
    private javax.swing.JTable tblHoaDon;
    private javax.swing.JTextField txtHDTimKiem;
    private javax.swing.JTextField txtKHTimKiem;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgayBan;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
   void init() {
        initComponents();
        tblChiTietHD.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        tblHoaDon.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 12));
        popMaHD.add(pnlMaHD);
        popTenKH.add(pnlTenKH);
        fillTable();
        this.updateStatus();
    }
    int row = -1;
    HoaDonDAO dao = new HoaDonDAO();
    HoaDonChiTietDAO cthddao = new HoaDonChiTietDAO();
    HangHoaDAO hhdao = new HangHoaDAO();
    KhachHangDAO khdao = new KhachHangDAO();
    DanhMucThuocDAO dmtdao = new DanhMucThuocDAO();

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        int i = 1;
        try {
            List<HoaDon> list = dao.selectAll();
            for (HoaDon hd : list) {
                Object[] data = {
                    i++,
                    hd.getMaHD(),
                    hd.getTenKH(),
                    hd.getTenNV(),
                    hd.getTongTien(),
                    XDate.toString(hd.getNgayBan(), "dd/MM/yyyy")
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void timHoaDon() {
        String maHD = txtHDTimKiem.getText();
        String tenKH = txtKHTimKiem.getText();
        DefaultTableModel model = (DefaultTableModel) tblHoaDon.getModel();
        model.setRowCount(0);
        int i = 1;
        try {
            List<HoaDon> list = dao.selectNotInCourse(maHD, tenKH);
            for (HoaDon hd : list) {
                Object[] data = {
                    i++,
                    hd.getMaHD(),
                    hd.getTenKH(),
                    hd.getTenNV(),
                    hd.getTongTien(),
                    XDate.toString(hd.getNgayBan(), "dd/MM/yyyy")
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void setForm(HoaDon hd) {
        txtMaHD.setText(hd.getMaHD());
        txtMaKH.setText(hd.getMaKH());
        txtMaNV.setText(hd.getMaNV());
        txtNgayBan.setText(XDate.toString(hd.getNgayBan(), "dd/MM/yyyy"));
        txtTenKH.setText(hd.getTenKH());
        lblTongTien.setText(String.valueOf(hd.getTongTien()));
    }

    void edit() {
        String maHD = String.valueOf(tblHoaDon.getValueAt(row, 1));
        tblHoaDon.setRowSelectionInterval(row, row);
        HoaDon hd = dao.selectById(maHD);
        this.setForm(hd);
        this.updateStatus();

        DefaultTableModel model = (DefaultTableModel) tblChiTietHD.getModel();
        model.setRowCount(0);
        try {
            List<HoaDonChiTiet> list = cthddao.selectNotInCourse(maHD);
            for (HoaDonChiTiet hdct1 : list) {
                Object data[] = {
                    dmtdao.selectById(hhdao.selectById(hdct1.getMaHH()).getMaThuoc()).getTenThuoc(),
                    //                    hhdao.selectById(hdct1.getMaHH()).getTenThuoc(),
                    hhdao.selectById(hdct1.getMaHH()).getSoLo(),
                    hdct1.getSoLuong(),
                    hhdao.selectById(hdct1.getMaHH()).getGiaBan(),
                    dao.selectById(hdct1.getMaHD()).getTongTien()
                };
                model.addRow(data);
            }

        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi load dữ liệu bảng");
        }

    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == (tblHoaDon.getRowCount() - 1));

        btnXoa.setEnabled(edit);

        btnDau.setEnabled(edit && !first);
        btnLui.setEnabled(edit && !first);
        btnCuoi.setEnabled(edit && !last);
        btnKe.setEnabled(edit && !last);
    }

    void delete() {
        String maHD = txtMaHD.getText();
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Chỉ quản lý mới được xóa hàng hóa!");
        } else if (MsgBox.confirm(this, "Bạn có muốn xóa hàng hóa " + maHD + " ?")) {
            try {
                cthddao.delete(maHD);
                dao.delete(maHD);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa hàng hóa thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa hàng hóa thất bại");
            }
        }
    }

    void first() {
        this.row = 0;
        tblHoaDon.setRowSelectionInterval(row, row);
        this.edit();
    }

    void next() {
        if (row < tblHoaDon.getRowCount() - 1) {
            tblHoaDon.setRowSelectionInterval(row, row);
            this.row++;
            this.edit();
        }
    }

    void prev() {
        if (row > 0) {
            tblHoaDon.setRowSelectionInterval(row, row);
            this.row--;
            this.edit();
        }
    }

    void last() {
        tblHoaDon.setRowSelectionInterval(row, row);
        this.row = tblHoaDon.getRowCount() - 1;
        this.edit();
    }

    void clearForm() {
        HoaDon hd = new HoaDon();
        hd.setNgayBan(new Date());
        this.setForm(hd);
        this.row = -1;
        this.updateStatus();
    }
}
