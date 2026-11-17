package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    // Constructor-based dependency injection
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/add")
    public int add(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calculatorService.add(a, b);
    }

    @GetMapping("/subtract")
    public int subtract(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calculatorService.subtract(a, b);
    }

    @GetMapping("/multiply")
    public int multiply(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calculatorService.multiply(a, b);
    }

    @GetMapping("/divide")
    public int divide(@RequestParam("a") int a, @RequestParam("b") int b) {
        return calculatorService.divide(a, b);
    }
}
