package com.example.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(CalculatorController.class)
public class CalculatorControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CalculatorService calculatorService;

    @Test
    @DisplayName("Test 1: Addition - 10 + 5 = 15")
    void testAdd() throws Exception {
        // 1. Define mock behavior using when().thenReturn()
        when(calculatorService.add(10, 5)).thenReturn(15);

        // 2. Send HTTP GET request using MockMvc and verify HTTP status 200 OK and response content
        mockMvc.perform(get("/calculator/add").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("15"));

        // 3. Verify the service method is called exactly once using Mockito verify()
        verify(calculatorService, times(1)).add(10, 5);
    }

    @Test
    @DisplayName("Test 2: Subtraction - 10 - 5 = 5")
    void testSubtract() throws Exception {
        // 1. Define mock behavior using when().thenReturn()
        when(calculatorService.subtract(10, 5)).thenReturn(5);

        // 2. Send HTTP GET request using MockMvc and verify HTTP status 200 OK and response content
        mockMvc.perform(get("/calculator/subtract").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("5"));

        // 3. Verify the service method is called exactly once using Mockito verify()
        verify(calculatorService, times(1)).subtract(10, 5);
    }

    @Test
    @DisplayName("Test 3: Multiplication - 10 * 5 = 50")
    void testMultiply() throws Exception {
        // 1. Define mock behavior using when().thenReturn()
        when(calculatorService.multiply(10, 5)).thenReturn(50);

        // 2. Send HTTP GET request using MockMvc and verify HTTP status 200 OK and response content
        mockMvc.perform(get("/calculator/multiply").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("50"));

        // 3. Verify the service method is called exactly once using Mockito verify()
        verify(calculatorService, times(1)).multiply(10, 5);
    }

    @Test
    @DisplayName("Test 4: Division - 10 / 5 = 2")
    void testDivide() throws Exception {
        // 1. Define mock behavior using when().thenReturn()
        when(calculatorService.divide(10, 5)).thenReturn(2);

        // 2. Send HTTP GET request using MockMvc and verify HTTP status 200 OK and response content
        mockMvc.perform(get("/calculator/divide").param("a", "10").param("b", "5"))
                .andExpect(status().isOk())
                .andExpect(content().string("2"));

        // 3. Verify the service method is called exactly once using Mockito verify()
        verify(calculatorService, times(1)).divide(10, 5);
    }
}
