package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class CalculatorParameterizedTest {
    public static final Double NUM = 1.0;
    public static final Double NUM1 = 2.0;

    @ParameterizedTest
    @MethodSource("provideParamForTest")
    public void shouldEqualsWhenAddition(Double value1, Double value2) {
        CalculatorService calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.addition(value1, value2), value1 + value2);
    }

    @ParameterizedTest
    @MethodSource("provideParamForTest")
    public void shouldEqualsWhensSubtract(Double value1, Double value2) {
        CalculatorService calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.subtract(value1, value2), value1 - value2);
    }

    @ParameterizedTest
    @MethodSource("provideParamForTest")
    public void shouldEqualsWhenMultiplication(Double value1, Double value2) {
        CalculatorService calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.multiplication(value1, value2), value1 * value2);
    }

    @ParameterizedTest
    @MethodSource("provideParamForTest")
    public void shouldEqualsWhenDivision(Double value1, Double value2) {
        CalculatorService calculatorService = new CalculatorService();
        Assertions.assertEquals(calculatorService.division(value1, value2), value1 / value2);
    }

    public static Stream<Arguments> provideParamForTest() {
        return Stream.of(
                Arguments.of(1.0, 2.0),
                Arguments.of(22.0, 33.0),
                Arguments.of(22.0, 2.0)
                );
    }
}
