/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlnt.dao;

import com.qlnt.util.XJdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author monst
 */
public class ThongKeDAO {

    private List<Object[]> getListArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = XJdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> getDoanhThu(String thang) {
        String sql = "{CALL sp_DoanhThu(?)}";
        String[] cols = {"NgayBan", "TongHoaDon", "DoanhThu", "TongGiaVon", "LoiNhuan"};
        return this.getListArray(sql, cols, thang);
    }

    public List<Object[]> getKhachHangTT() {
        String sql = "{CALL sp_KhachHangThanThiet}";
        String[] cols = {"MaKH", "TenKH", "SDT", "Diem"};
        return this.getListArray(sql, cols);
    }
    public List<Object[]> getKhachHangTT_Thang(String thang) {
        String sql = "{CALL sp_KhachHangThanThiet_TheoThang}";
        String[] cols = {"MaKH", "TenKH", "SDT", "Diem"};
        return this.getListArray(sql, cols, thang);
    }
    public List<Object[]> getThuocNoiBat() {
        String sql = "{CALL sp_ThuocNoiBat}";
        String[] cols = {"TenThuoc", "SoLuongBan"};
        return this.getListArray(sql, cols);
    }
    public List<Object[]> getThuocNoiBat_Thang(String thang) {
        String sql = "{CALL sp_ThuocNoiBat_Thang}";
        String[] cols = {"TenThuoc", "SoLuongBan"};
        return this.getListArray(sql, cols, thang);
    }
}
