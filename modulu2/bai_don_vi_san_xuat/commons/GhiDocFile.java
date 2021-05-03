package commons;

import models.CanBo;
import models.CongNhan;
import models.KySu;
import models.NhanVien;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class GhiDocFile {
    public static final String PATH = "bai_tap_lam_them2/data/canbo.csv";

    public static void ghifile(List<CanBo> listCanBo ,boolean trangThai) {
        File file= new File(PATH);
        FileWriter fileWriter= null;
        BufferedWriter bufferedWriter=null;
        try {
            fileWriter=new FileWriter(file,trangThai);
            bufferedWriter=new BufferedWriter(fileWriter);
            for (CanBo canBo:listCanBo){
                bufferedWriter.write(canBo.toString());
                bufferedWriter.newLine();
            }

        }catch (Exception e){
            System.out.println("không tìm thấy file");
        }finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
                fileWriter.close();
            }catch (Exception e){
                System.out.println("chưa đống file");
            }
        }

    }
    public static List<CanBo> docFile(){
        File file=new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<CanBo> listCanBo = new ArrayList<>();
        String[] arrline = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!= null){
                arrline = line.split(",");
                 if (arrline[4].contains("/7")){
                    CanBo congNhan = new CongNhan(arrline[0],arrline[1],arrline[2],arrline[3],arrline[4]);
                    listCanBo.add(congNhan);
                }else if(arrline[4].contains("PV")){
                    CanBo nhanVien = new NhanVien(arrline[0],arrline[1],arrline[2],arrline[3],arrline[4]);
                    listCanBo.add(nhanVien);
                }else if(arrline.length == 5 ) {
                    CanBo kySu = new KySu(arrline[0],arrline[1],arrline[2],arrline[3],arrline[4]);
                    listCanBo.add(kySu);
                }

            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return listCanBo;
    }

    public static List<String> docFileNganh(){
        File file=new File("bai_tap_lam_them2/data/nganhdaotao.csv");
        FileReader fileReader=null;
        BufferedReader bufferedReader=null;
        String line=null;
        List<String> strings=new ArrayList<>();
        try {
            fileReader=new FileReader(file);
            bufferedReader=new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                strings.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return strings;
    }
}
