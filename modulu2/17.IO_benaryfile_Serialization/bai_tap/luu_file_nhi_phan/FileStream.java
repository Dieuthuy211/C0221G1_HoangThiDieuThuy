package bai_tap.luu_file_nhi_phan;


import java.io.*;
import java.util.ArrayList;

public class FileStream {

    public static void outFileStream(ArrayList<SanPham> listSP) throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("D:\\C0221G1-HoangThiDieuThuy\\modulu2\\bai17\\bai_tap\\luu_file_nhi_phan\\Quanly.csv",true))) {

            output.writeObject(listSP);

        }

    }

    public static ArrayList<SanPham> inFileStream() throws FileNotFoundException {
        ArrayList<SanPham> listSP=new ArrayList<>();

        FileInputStream fileInputStream= new FileInputStream("D:\\C0221G1-HoangThiDieuThuy\\modulu2\\bai17\\bai_tap\\luu_file_nhi_phan\\Quanly.csv");
            try  {
                ObjectInputStream input = new ObjectInputStream(fileInputStream);
                
                    listSP=(ArrayList<SanPham>)input.readObject();

            }catch (Exception e){
                e.printStackTrace();
            }

        return  listSP;

    }
}