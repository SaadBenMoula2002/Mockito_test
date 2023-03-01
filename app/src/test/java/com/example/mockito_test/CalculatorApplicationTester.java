package com.example.mockito_test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Assert;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class CalculatorApplicationTester {

    @InjectMocks
    CalculatorApplication calculatorApplication = new CalculatorApplication();

    @Mock
    CalculatorService calcService;
    @Test
    public void testAdd(){
        when(calcService.add(10.0,20.0)).thenReturn(30.00);
        Assert.assertEquals(calculatorApplication.add(10.0, 20.0),30.0,0);
    }
}