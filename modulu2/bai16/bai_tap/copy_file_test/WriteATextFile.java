package bai_tap.copy_file_test;

import java.io.*;

public class WriteATextFile {
    public static void main(String[] args) {
        try {
            FileReader input = new FileReader("D:\\C0221G1-HoangThiDieuThuy\\modulu2\\bai16\\bai_tap\\copy_file_test\\newTestFile");
            FileWriter output = new FileWriter("D:\\C0221G1-HoangThiDieuThuy\\modulu2\\bai16\\bai_tap\\copy_file_test\\newTestFile2");
            BufferedReader bufferedReader = new BufferedReader(input);
            BufferedWriter bufferedWriter = new BufferedWriter(output);
            String line = "";
            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.append(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
