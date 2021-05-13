package commons;


import model.hoa_don.HoaDon;
import model.khachHang.KhachHang;
import model.khachHang.NuocNgoai;
import model.khachHang.VietNam;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFIleQuanLyTienDien {
    public static void ghiKhachHang(List<KhachHang> list, File file, boolean trangThai) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i).toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void ghiHoaDon(List<HoaDon> list, File file, boolean trangThai) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file, trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                bufferedWriter.write(list.get(i).toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static List<KhachHang> docKhachHang() {
        File file = new File("hoa_don_tien_dien/data/khachHang.csv");
        List<KhachHang> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arrayLine = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayLine = line.split(",");
                if (arrayLine.length == 4) {
                    KhachHang vietNam = new VietNam(arrayLine[0], arrayLine[1], arrayLine[2], Double.parseDouble(arrayLine[3]));
                    list.add(vietNam);
                } else if (arrayLine.length == 3) {
                    KhachHang nuocNgoai = new NuocNgoai(arrayLine[0], arrayLine[1], arrayLine[2]);
                    list.add(nuocNgoai);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }

    public static List<HoaDon> docHoaDon() {
        File file = new File("hoa_don_tien_dien/data/hoaDon.csv");
        List<HoaDon> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            String[] arrayLine = null;
            while ((line = bufferedReader.readLine()) != null) {
                arrayLine = line.split(",");
                HoaDon hoaDon = new HoaDon(arrayLine[0], arrayLine[1], arrayLine[2], Double.parseDouble(arrayLine[3]), Double.parseDouble(arrayLine[4]), Double.parseDouble(arrayLine[5]));
                list.add(hoaDon);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }

    public static List<String> docLoaiKhach() {
        File file = new File("hoa_don_tien_dien/data/loaiKhach.csv");
        List<String> list = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

}
