package commons;

import models.Oto;
import models.PhuongTien;
import models.XeMay;
import models.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFile {
    private static final String PATH = "bai_quan_ly_xe_co/data/phuongTien.csv";

    public static void ghiFilePT(List<PhuongTien> phuongTienList, boolean trangThai) {
        File file = new File(PATH);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (PhuongTien phuongTien : phuongTienList) {
                bufferedWriter.write(phuongTien.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<PhuongTien> docFilePT() {
        List<PhuongTien> phuongTienList = new ArrayList<>();
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        String[] arrayLine = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                arrayLine = line.split(",");
                if (arrayLine.length == 6) {
                    PhuongTien oto = new Oto(arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3], arrayLine[4], arrayLine[5]);
                    phuongTienList.add(oto);
                } else if (arrayLine[0].contains("C")) {
                    PhuongTien xeTai = new XeTai(arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3], arrayLine[4]);
                    phuongTienList.add(xeTai);
                } else if (arrayLine.length == 5) {
                    PhuongTien xemay = new XeMay(arrayLine[0], arrayLine[1], arrayLine[2], arrayLine[3], arrayLine[4]);
                    phuongTienList.add(xemay);
                }

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return phuongTienList;
        }
    }

    public static List<String> docFileHangSX(){
        List<String> stringList=new ArrayList<>();
        File file=new File("bai_quan_ly_xe_co/data/hangSanSuat.csv");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String line=null;
        try {
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
           while ((line=bufferedReader.readLine())!=null){
               stringList.add(line);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
    }
