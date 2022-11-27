package com.example.calculator.service;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public Double addition(Double x, Double y) {
        return x + y;
    }

    public Double subtract(Double x, Double y) {
        return  x - y;
    }

    public Double multiplication(Double x, Double y) {
        return x * y;
    }

    public Double division(Double x, Double y) {
        if(y == 0){
            throw new IllegalArgumentException("throw error");
        }
        return x / y;
    }

}
