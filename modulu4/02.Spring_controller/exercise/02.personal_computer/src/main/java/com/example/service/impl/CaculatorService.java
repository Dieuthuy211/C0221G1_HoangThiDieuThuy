package com.example.service.impl;

import com.example.service.ICaculatorService;

public class CaculatorService implements ICaculatorService {
    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int volume(int a, int b) {
        return a-b;
    }

    @Override
    public int brand(int a, int b) {
        return a*b;
    }

    @Override
    public int dear(int a, int b) {
        return a/b;
    }
}
