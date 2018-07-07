package mathapp;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {

  @InjectMocks
  MathApp mathApp = new MathApp();

  @Mock
  CalculatorService calculatorService;


  @Test
  public void test_Add() {

    double firstTestValue = 10.0;
    double secondTestValue = 10.0;
    double expectedResult = firstTestValue + secondTestValue;

    doThrow(new RuntimeException("hello")).when(calculatorService).add(anyDouble(), anyDouble());
    when(calculatorService.add(anyDouble(), anyDouble())).thenReturn(expectedResult);

    //double actualResult = mathApp.add(firstTestValue, secondTestValue);
    //assertEquals(actualResult, expectedResult, 0.001);
    mathApp.add(firstTestValue, secondTestValue);
    mathApp.add(firstTestValue, secondTestValue);
    verify(calculatorService, atLeast(2)).add(anyDouble(), anyDouble());

  }

}