package thuc_hanh.luu_danh_sach_sinh_vien_theo_do_tuoi;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
//     ứng dụng hashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("thúy", 17);
        hashMap.put("hiền", 28);
        hashMap.put("ngân", 17);
        hashMap.put("tiến", 18);
        hashMap.put("anh", 19);
        System.out.println(hashMap + "\n");
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("linh",17);
        linkedHashMap.put("tuấn",20);
        linkedHashMap.put("tùng",18);
        linkedHashMap.put("lin",27);
        System.out.println(linkedHashMap);
    }
}
