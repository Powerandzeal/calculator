package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.springframework.test.util.AssertionErrors.assertEquals;

public class CalculatorServiceTest {
    CalculatorService calculatorService = new CalculatorService();


    @Test
    public void twoPlusTwo() {
        Double result = calculatorService.addition(2.0,2.0) ;
        Assertions.assertEquals(4,result);
    }

    @Test
    public void substractTest() {
        Double result = calculatorService.subtract(4.0,2.0);
        Assertions.assertEquals(2.0,result);
    }
    @Test
    public void multipleTest() {
        Double result = calculatorService.multiplication(4.0,2.0);
        Assertions.assertEquals(8.0,result);
    }
    @Test
    public void divisionTest() {
        Double result = calculatorService.division(4.0,2.0);
        Assertions.assertEquals(2.0,result);
    }

    @Test
    public void errorWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class,() -> {
            calculatorService.division(1.0,0.0);
        });
    }


}
