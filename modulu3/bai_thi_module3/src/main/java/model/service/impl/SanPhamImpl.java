package model.service.impl;

import model.bean.DanhMuc;
import model.bean.SanPham;
import model.repository.SanPhamRepository;
import model.service.ISanPham;

import java.util.List;

public class SanPhamImpl implements ISanPham {
    SanPhamRepository sanPhamRepository=new SanPhamRepository();
    @Override
    public List<SanPham> findAll() {
        return sanPhamRepository.listSanPham();
    }

    @Override
    public List<DanhMuc> DanhMuc() {
        return sanPhamRepository.listDanhMuc();
    }

    @Override
    public void save(SanPham sanPham) {
   sanPhamRepository.insert(sanPham);
    }

    @Override
    public SanPham findById(int id) {
        return sanPhamRepository.listById(id);
    }

    @Override
    public boolean update(SanPham sanPham) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return sanPhamRepository.delete(id);
    }
}
