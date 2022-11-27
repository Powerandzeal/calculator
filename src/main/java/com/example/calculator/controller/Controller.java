package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    private CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator")
    public String welcoming() {
        return "you are welcome";
    }

    @GetMapping("/calculator/plus")
    public String testPlus(@RequestParam("value1") Double value1,
                       @RequestParam("value2") Double value2) {

        Double sum = calculatorService.addition(value1, value2);
        return String.format("%.2f/%.2f=%.2f", value1, value2, sum);
    }

    @GetMapping("/calculator/minus")
    public String testSubtract(@RequestParam("value1") Double value1,
                           @RequestParam("value2") Double value2) {

        Double subtraction = calculatorService.subtract(value1, value2);
        return String.format("%.2f%.2f=%.2f", value1, value2, subtraction);
    }

    @GetMapping("/calculator/multiply")
    public String testMultiply(@RequestParam("value1") Double value1,
                           @RequestParam("value2") Double value2) {

        Double multiply = calculatorService.multiplication(value1, value2);
        return String.format("%.2f/%.2f=%.2f", value1, value2, multiply);
//
    }

    @GetMapping("/calculator/divide")
    public String testDivide(@RequestParam("value1") Double value1,
                         @RequestParam("value2") Double value2) {

        Double divide = calculatorService.division(value1, value2);
        return String.format("%.2f/%.2f=%.2f", value1, value2, divide);
    }


}
