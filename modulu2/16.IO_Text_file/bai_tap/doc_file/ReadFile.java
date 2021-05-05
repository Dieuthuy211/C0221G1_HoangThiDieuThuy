package bai_tap.doc_file;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try{
            File infile=new File("bai16/bai_tap/doc_file/quocgia.txt");
            FileReader fileReader=new FileReader(infile);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                String []arr=line.split(",");
                System.out.println(arr[5]);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
