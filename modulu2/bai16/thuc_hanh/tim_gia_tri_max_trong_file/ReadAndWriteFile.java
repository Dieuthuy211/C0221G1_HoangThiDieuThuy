package thuc_hanh.tim_gia_tri_max_trong_file;

import thuc_hanh.ReadFileExample;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {

        List<Integer> number = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new IllegalAccessException("file không tồn tại");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                number.add(Integer.parseInt(line));
            }
            bufferedReader.close();
        } catch (IllegalAccessException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
return number;
    }

    public int seachMax(List<Integer> number) {
        int max = number.get(0);
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) > max) {
                max = number.get(i);
            }
        }
        return max;
    }

    public void readFile(int max) {
        try {
            FileWriter file = new FileWriter("bai16/thuc_hanh/tim_gia_tri_max_trong_file/somax.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(file);
            bufferedWriter.write("giá trị lớn nhất là : " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        Scanner scanner = new Scanner(System.in);

        List<Integer> number = readAndWriteFile.readFile("D:\\C0221G1-HoangThiDieuThuy\\modulu2\\bai16\\thuc_hanh\\tim_gia_tri_max_trong_file\\mangso.txt");
        int max = readAndWriteFile.seachMax(number);
        readAndWriteFile.readFile(max);

    }
}
