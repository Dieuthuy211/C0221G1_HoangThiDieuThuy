package bai_tap.copy_file_test;

import java.io.*;

public class ReadTestFile {

    public static void main(String[] args) {
        try{
           File inFile=new File("test.txt");

            FileReader fileReader=new FileReader(inFile);
            BufferedReader reader=new BufferedReader(fileReader);
            String line=null;
            while ((line= reader.readLine())!=null){
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
