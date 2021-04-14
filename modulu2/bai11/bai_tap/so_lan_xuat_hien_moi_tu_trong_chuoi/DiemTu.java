package bai_tap.so_lan_xuat_hien_moi_tu_trong_chuoi;

import java.util.HashMap;
import java.util.Map;


public class DiemTu {
    private static void check(String string){
//        String[] arrayString = string.split(" ");
//        String key = "";
//        int value;
//        Map<String,Integer> map=new HashMap<>();
//        for(int i=0;i<arrayString.length;i++){
//            key=arrayString[i];
//            if(!map.containsKey(key)){
//                map.put(key,1);
//            }else {
//                value=map.get(key);
//                map.remove(key);
//                map.put(key,value+1);
//            }
//        }
//        System.out.println(map.toString());
    }
    public static void main(String[] args) {
        String str = "hello words hello words lan huệ";
        String[] arr = str.split(" ");
        String key = "";
        int value;
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            key=arr[i];
            if(!map.containsKey(key)){
                map.put(key,1);
            }else {
                value=map.get(key);
                map.remove(key);
                map.put(key,value+1);
           }
        }
        System.out.println(map.toString());
    }
}

