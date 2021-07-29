/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlnt.dao;

import com.qlnt.entity.HoaDon;
import com.qlnt.util.XJdbc;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monst
 */
public class HoaDonDAO extends qlntDAO<HoaDon, String> {

    @Override
    public void insert(HoaDon entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(HoaDon entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String id) {
        String sql = "DELETE FROM HoaDon WHERE MaHD=?";
        XJdbc.update(sql, id);
    }

    @Override
    public HoaDon selectById(String id) {
        String sql = "SELECT * FROM HoaDon INNER JOIN KhachHang ON HoaDon.MaKH = "
                + "KhachHang.MaKH INNER JOIN NhanVien ON HoaDon.MaNV = NhanVien.MaNV WHERE MaHD =?";
        List<HoaDon> list = this.selectBySql(sql, id);
        return list.size() > 0 ? list.get(0) : null;
    }

    @Override
    public List<HoaDon> selectAll() {
        String sql = "SELECT * FROM HoaDon INNER JOIN KhachHang ON HoaDon.MaKH ="
                + " KhachHang.MaKH INNER JOIN NhanVien ON HoaDon.MaNV = NhanVien.MaNV";
        return this.selectBySql(sql);
    }

    @Override
    protected List<HoaDon> selectBySql(String sql, Object... args) {
        List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XJdbc.query(sql, args);
                while (rs.next()) {
                    HoaDon hd = new HoaDon();
                    hd.setMaHD(rs.getString("MaHD"));
                    hd.setMaNV(rs.getString("MaNV"));
                    hd.setMaKH(rs.getString("MaKH"));
                    hd.setNgayBan(rs.getDate("NgayBan"));
                    hd.setTongTien(rs.getDouble("TongTien"));
                    hd.setTenKH(rs.getString("TenKH"));
                    hd.setTenNV(rs.getString("TenNV"));
                    list.add(hd);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }

    public List<HoaDon> selectNotInCourse(String maHD, String tenKH) {
        String sql = "SELECT * FROM HoaDon INNER JOIN KhachHang ON HoaDon.MaKH = KhachHang.MaKH INNER JOIN NhanVien ON HoaDon.MaNV = NhanVien.MaNV WHERE HoaDon.MAHD LIKE ? AND KhachHang.TenKH LIKE ?";
        return this.selectBySql(sql, "%" + maHD + "%", "%"+tenKH+"%");
    }
}