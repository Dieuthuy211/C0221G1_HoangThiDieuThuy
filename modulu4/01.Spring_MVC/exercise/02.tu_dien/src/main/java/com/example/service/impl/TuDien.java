package com.example.service.impl;

import com.example.service.ITuDien;
import org.springframework.stereotype.Service;

@Service
public class TuDien implements ITuDien {
    @Override
    public String chuyenDoi(String input) {
        String result=null;
        String[] arrVn={"mot","hai","ba"};
        String[] arrEng={"one","two","three"};
        for (int i=0;i<arrEng.length;i++){
            if(input.equals(arrEng[i])){
                result=arrVn[i];
                break;
            }else if(input.equals(arrVn[i])){
                result=arrEng[i];
                break;
            }else {
                result="không tìm thấy";
            }
        }
        return result;
    }
}
