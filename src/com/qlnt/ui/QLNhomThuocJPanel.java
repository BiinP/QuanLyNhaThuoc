/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlnt.ui;

import com.qlnt.dao.NhomThuocDAO;
import com.qlnt.entity.NhomThuoc;
import com.qlnt.util.Auth;
import com.qlnt.util.MsgBox;
import java.awt.Color;
import java.awt.Font;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author monst
 */
public class QLNhomThuocJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TongQuanJPannel
     */
    public QLNhomThuocJPanel() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtTenNT = new javax.swing.JTextField();
        txtMaNT = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        btnDau = new javax.swing.JButton();
        btnLui = new javax.swing.JButton();
        btnKe = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMoTa = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhomThuoc = new javax.swing.JTable();
        lblTim = new javax.swing.JLabel();
        txtTimkiem = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1000, 570));
        setMinimumSize(new java.awt.Dimension(1000, 570));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 140, 180));
        jPanel2.setMaximumSize(new java.awt.Dimension(400, 436));
        jPanel2.setMinimumSize(new java.awt.Dimension(400, 436));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mã nhóm thuốc:");

        txtTenNT.setBackground(new java.awt.Color(51, 140, 180));
        txtTenNT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenNT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtTenNT.setOpaque(false);

        txtMaNT.setBackground(new java.awt.Color(51, 140, 180));
        txtMaNT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMaNT.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtMaNT.setOpaque(false);
        txtMaNT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaNTActionPerformed(evt);
            }
        });

        btnThem.setBackground(new java.awt.Color(59, 151, 203));
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnThem.png"))); // NOI18N
        btnThem.setBorder(null);
        btnThem.setContentAreaFilled(false);
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(59, 151, 203));
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnSua.png"))); // NOI18N
        btnSua.setBorder(null);
        btnSua.setContentAreaFilled(false);
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(59, 151, 203));
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnXoa.png"))); // NOI18N
        btnXoa.setBorder(null);
        btnXoa.setContentAreaFilled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setBackground(new java.awt.Color(59, 151, 203));
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnMoi.png"))); // NOI18N
        btnMoi.setBorder(null);
        btnMoi.setContentAreaFilled(false);
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        btnDau.setBackground(new java.awt.Color(59, 151, 203));
        btnDau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnDau.png"))); // NOI18N
        btnDau.setBorder(null);
        btnDau.setContentAreaFilled(false);
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        btnLui.setBackground(new java.awt.Color(59, 151, 203));
        btnLui.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnLui.png"))); // NOI18N
        btnLui.setBorder(null);
        btnLui.setContentAreaFilled(false);
        btnLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuiActionPerformed(evt);
            }
        });

        btnKe.setBackground(new java.awt.Color(59, 151, 203));
        btnKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnKeTiep.png"))); // NOI18N
        btnKe.setBorder(null);
        btnKe.setContentAreaFilled(false);
        btnKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeActionPerformed(evt);
            }
        });

        btnCuoi.setBackground(new java.awt.Color(59, 151, 203));
        btnCuoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnCuoi.png"))); // NOI18N
        btnCuoi.setBorder(null);
        btnCuoi.setContentAreaFilled(false);
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tên nhóm thuốc:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mô tả:");

        txtMoTa.setBackground(new java.awt.Color(51, 140, 180));
        txtMoTa.setColumns(20);
        txtMoTa.setRows(5);
        txtMoTa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jScrollPane2.setViewportView(txtMoTa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(32, 32, 32))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addComponent(txtMaNT, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtTenNT, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnDau)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnLui)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnKe)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCuoi))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnThem)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnSua)
                                    .addGap(10, 10, 10)
                                    .addComponent(btnXoa)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnMoi))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMaNT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTenNT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDau)
                    .addComponent(btnLui)
                    .addComponent(btnKe)
                    .addComponent(btnCuoi))
                .addGap(100, 100, 100))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 610));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setFocusable(false);
        jPanel3.setMaximumSize(new java.awt.Dimension(600, 576));
        jPanel3.setMinimumSize(new java.awt.Dimension(600, 576));
        jPanel3.setOpaque(false);
        jPanel3.setRequestFocusEnabled(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblNhomThuoc.setAutoCreateRowSorter(true);
        tblNhomThuoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Mã nhóm thuốc", "Tên nhóm thuốc", "Mô tả"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhomThuoc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblNhomThuoc.setFocusable(false);
        tblNhomThuoc.setOpaque(false);
        tblNhomThuoc.setRowHeight(25);
        tblNhomThuoc.setRowMargin(0);
        tblNhomThuoc.setShowHorizontalLines(false);
        tblNhomThuoc.setShowVerticalLines(false);
        tblNhomThuoc.getTableHeader().setReorderingAllowed(false);
        tblNhomThuoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhomThuocMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhomThuoc);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 570, 290));

        lblTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/qlnt/icon/btnSearch.png"))); // NOI18N
        lblTim.setMaximumSize(new java.awt.Dimension(30, 30));
        lblTim.setMinimumSize(new java.awt.Dimension(30, 30));
        lblTim.setPreferredSize(new java.awt.Dimension(30, 30));
        jPanel3.add(lblTim, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtTimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTimkiem.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtTimkiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimkiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimkiemFocusLost(evt);
            }
        });
        txtTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimkiemKeyReleased(evt);
            }
        });
        jPanel3.add(txtTimkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 500, 32));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 610, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaNTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaNTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaNTActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        delete();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void txtTimkiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemFocusGained
        if (txtTimkiem.getText().equals("Nhập tên nhóm thuốc cần tìm")) {
            txtTimkiem.setText("");
        }
    }//GEN-LAST:event_txtTimkiemFocusGained

    private void txtTimkiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemFocusLost
        if (txtTimkiem.getText().equals("")) {
            txtTimkiem.setText("Nhập tên nhóm thuốc cần tìm");
        }
    }//GEN-LAST:event_txtTimkiemFocusLost

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblNhomThuocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhomThuocMouseClicked
        if(evt.getClickCount()==2){
            this.row = tblNhomThuoc.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblNhomThuocMouseClicked

    private void txtTimkiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimkiemKeyReleased
        timKiem();
    }//GEN-LAST:event_txtTimkiemKeyReleased

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
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup grGioiTinh;
    private javax.swing.ButtonGroup grVaiTro;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTim;
    private javax.swing.JTable tblNhomThuoc;
    private javax.swing.JTextField txtMaNT;
    private javax.swing.JTextArea txtMoTa;
    private javax.swing.JTextField txtTenNT;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
   void init() {
        initComponents();
        txtTimkiem.setText("Nhập tên nhóm thuốc cần tìm");
        fillTable();
        this.updateStatus();
    }
    int row = -1;
    NhomThuocDAO dao = new NhomThuocDAO();

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhomThuoc.getModel();
        model.setRowCount(0);
        int i = 1;
        try {
            List<NhomThuoc> list = dao.selectAll();
            for (NhomThuoc nt : list) {
                Object[] data = {
                    i++,
                    nt.getMaNT(),
                    nt.getTenNT(),
                    nt.getMoTa()
                };
                model.addRow(data);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
        }
    }

    void setForm(NhomThuoc nt) {
        txtMaNT.setText(nt.getMaNT());
        txtTenNT.setText(nt.getTenNT());
        txtMoTa.setText(nt.getMoTa());
    }

    NhomThuoc getForm() {
        NhomThuoc nt = new NhomThuoc();
        nt.setMaNT(txtMaNT.getText());
        nt.setTenNT(txtTenNT.getText());
        nt.setMoTa(txtMoTa.getText());

        return nt;
    }

    void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == (tblNhomThuoc.getRowCount() - 1));

        txtMaNT.setEnabled(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        btnDau.setEnabled(edit && !first);
        btnLui.setEnabled(edit && !first);
        btnCuoi.setEnabled(edit && !last);
        btnKe.setEnabled(edit && !last);
    }

    void clearForm() {
        NhomThuoc nt = new NhomThuoc();
        this.setForm(nt);
        this.row = -1;
        this.updateStatus();
    }

    void edit() {
        String maNT = (String) tblNhomThuoc.getValueAt(row, 1);
        tblNhomThuoc.setRowSelectionInterval(row, row);
        NhomThuoc nt = dao.selectById(maNT);
        this.setForm(nt);
        this.updateStatus();
    }

    boolean kiemtra() {
        NhomThuoc nt = this.getForm();
        if (nt.getMaNT().equals("") || nt.getTenNT().equals("") || nt.getMoTa().equals("")) {
            MsgBox.alert(this, "Vui lòng nhập đầy đủ thông tin nhóm thuốc");
            return false;
        }
        return true;
    }

    void insert() {
        if (kiemtra()) {
            NhomThuoc nt = this.getForm();
            try {
                dao.insert(nt);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm nhóm thuốc thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm nhóm thuốc thất bại");
            }

        }
    }

    void update() {
        if (kiemtra()) {
            NhomThuoc nt = this.getForm();
            try {
                dao.update(nt);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật nhóm thuốc thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật nhóm thuốc thất bại");
            }
        }

    }

    void delete() {
        String maNT = txtMaNT.getText();
        String tenNT = txtTenNT.getText();
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Chỉ quản lý mới được xóa nhóm thuốc!");
        } else if (MsgBox.confirm(this, "Bạn có muốn xóa nhóm thuốc " + tenNT + " ?")) {
            try {
                dao.delete(maNT);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Xóa nhóm thuốc thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Xóa nhóm thuốc thất bại");
            }

        }
    }

    void first() {
        this.row = 0;
        tblNhomThuoc.setRowSelectionInterval(row, row);
        this.edit();
    }

    void next() {
        if (row < tblNhomThuoc.getRowCount() - 1) {
            tblNhomThuoc.setRowSelectionInterval(row, row);
            this.row++;
            this.edit();
        }
    }

    void prev() {
        if (row > 0) {
            tblNhomThuoc.setRowSelectionInterval(row, row);
            this.row--;
            this.edit();
        }
    }

    void last() {
        tblNhomThuoc.setRowSelectionInterval(row, row);
        this.row = tblNhomThuoc.getRowCount() - 1;
        this.edit();
    }

    private void timKiem() {
        DefaultTableModel model = (DefaultTableModel) tblNhomThuoc.getModel();
        model.setRowCount(0);
        int i = 1;
        String keyword = txtTimkiem.getText();
        List<NhomThuoc> list = dao.selectNotInCourse(keyword);
        for (NhomThuoc nt : list) {
            model.addRow(new Object[]{
                i++,
                nt.getMaNT(),
                nt.getTenNT(),
                nt.getMoTa(),
            });
        }
    }
}
