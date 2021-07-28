package model.service;

import model.bean.DanhMuc;
import model.bean.SanPham;

import java.util.List;

public interface ISanPham {
    List<SanPham> findAll();
    List<DanhMuc> DanhMuc();

    void save(SanPham sanPham);

    SanPham findById(int id);

    boolean update(SanPham sanPham);

    boolean remove(int id);
}
