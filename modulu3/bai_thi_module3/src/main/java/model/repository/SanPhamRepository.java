package model.repository;

import model.bean.DanhMuc;
import model.bean.SanPham;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository {
    BaseRepository baseRepository = new BaseRepository();
    final String SELECT_BY_ALL = "select *from san_pham";
    final String SELECT_DANH_MUC = "select *from danh_muc";
    final String INSERT="insert into san_pham(ten_san_pham,gia,so_luong,mau_sac,mo_ta,id_danh_muc)\n" +
            "      values(?,?,?,?,?,?)";
    final String UPDATE = "update san_pham \n" +
            "set ten_san_pham=?,gia=?,so_luong=?,mau_sac=?,mo_ta=?,`id_danh_muc`=? \n" +
            "where id=?";
    final String SELECT_BY_ID = "select *from san_pham where id=?";
    final  String DELETE="delete from san_pham where id=?";


//    private int id;
//    private String tenSanPham;
//    private int gia;
//    private int soLuong;
//    private String mauSsac;
//    private String moTa;
//    private int danhMuc;
public boolean delete(int id) {
    Connection connection = baseRepository.connectDataBase();
    PreparedStatement preparedStatement = null;
    boolean rowDeleted = false;
    try {
        preparedStatement = connection.prepareStatement(DELETE);
        preparedStatement.setInt(1, id);
        rowDeleted = preparedStatement.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        try {
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    return rowDeleted;
}

    public SanPham listById(int id) {
        SanPham sanPham = null;
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String tenSanPham = resultSet.getString("ten_san_pham");
                int gia = resultSet.getInt("gia");
                int soLuong = resultSet.getInt("so_luong");
                String mauSac = resultSet.getString("mau_sac");
                String moTa = resultSet.getString("mo_ta");
                int danhMuc = resultSet.getInt("id_danh_muc");
                sanPham=new SanPham(id,tenSanPham, gia, soLuong, mauSac, moTa, danhMuc);

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return sanPham;
    }

    public boolean update(SanPham sanPham) {
        boolean rowUpdated = false;
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(UPDATE);
            preparedStatement.setString(1, sanPham.getTenSanPham());
            preparedStatement.setInt(2, sanPham.getGia());
            preparedStatement.setInt(3, sanPham.getSoLuong());
            preparedStatement.setString(4, sanPham.getMauSsac());
            preparedStatement.setString(5, sanPham.getMoTa());
            preparedStatement.setInt(6, sanPham.getDanhMuc());
            preparedStatement.setInt(7, sanPham.getId());
            rowUpdated = preparedStatement.executeUpdate() > 0;
            preparedStatement.close();
            connection.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdated;

    }

    public void insert(SanPham sanPham) {
        Connection connection = baseRepository.connectDataBase();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT);
            preparedStatement.setString(1, sanPham.getTenSanPham());
            preparedStatement.setInt(2, sanPham.getGia());
            preparedStatement.setInt(3, sanPham.getSoLuong());
            preparedStatement.setString(4, sanPham.getMauSsac());
            preparedStatement.setString(5, sanPham.getMoTa());
            preparedStatement.setDouble(6, sanPham.getDanhMuc());
            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public List<DanhMuc> listDanhMuc() {
        List<DanhMuc> list = new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_DANH_MUC);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int idDanhMuc = resultSet.getInt("id_danh_muc");
                String tenDanhMuc = resultSet.getString("ten_danh_muc");
                list.add(new DanhMuc(idDanhMuc,tenDanhMuc));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }

    public List<SanPham> listSanPham() {
        List<SanPham> list = new ArrayList<>();
        Connection connection = baseRepository.connectDataBase();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BY_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String tenSanPham = resultSet.getString("ten_san_pham");
                int gia = resultSet.getInt("gia");
               int soLuong = resultSet.getInt("so_luong");
                String mauSac = resultSet.getString("mau_sac");
                String moTa = resultSet.getString("mo_ta");
                int danhMuc = resultSet.getInt("id_danh_muc");

                list.add(new SanPham(id,tenSanPham,gia,soLuong,mauSac,moTa,danhMuc));

            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return list;
    }
}
