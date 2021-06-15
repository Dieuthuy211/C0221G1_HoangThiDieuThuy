package com.example.service.impl;

import com.example.service.ICaculatorService;
import org.springframework.stereotype.Service;

@Service
public class CaculatorService implements ICaculatorService {
    @Override
    public double calculate(double a, double b,String action) {
        double result=0;
        switch (action){
            case "summation":
               result=a+b;
               break;
            case "Subtraction":
                result=a-b;
                break;
            case "multiplication":
                result=a*b;
                break;
            case "division":
                if(b != 0){
                    result = a / b;
                }else {
                    throw new ArithmeticException();
                }
                break;

        }
        return result;
    }
}
