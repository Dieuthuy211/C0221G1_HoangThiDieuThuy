package com.example.service.impl;

import com.example.service.IConventer;
import org.springframework.stereotype.Service;

@Service
public class Conventer implements IConventer {

    @Override
    public int dear(int a, int b) {
        return a*b;
    }
}
