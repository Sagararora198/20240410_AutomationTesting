package Aspire;


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NgTestingExample {
  @Test
  @BeforeMethod
  public void beforeMethod() {
    System.out.println("Before Test");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("After Test");
  }

  @Test
  public void testAddition() {
    int expectedResult = 56;
    int actualResult = Calculator.add(22, 34);
    System.out.println("Addition Result" + actualResult);
    Assert.assertEquals(actualResult, expectedResult, "Addition Incorrect Result");
  }
  
  @Test
  public void testSubtraction() {
    int expectedResult = -10;
    int actualResult = Calculator.subtract(10, 20);
    System.out.println("Substraction Result " + actualResult);
    Assert.assertEquals(actualResult, expectedResult, "Addition Incorrect Result");
  }

}

class Calculator {
  
  public static int add(int a, int b) {
    return a + b;
  }
  
  public static int subtract(int a, int b) {
    return a - b;
  }

}