package com.epam.tat.module4.TAF_Calc.test;
import org.testng.Assert;
import org.testng.annotations.*;

import com.epam.tat.module4.Calculator;

public class ArithmeticTest extends BasicCalcTest{
	
	@DataProvider (name="div and mult tests")
	public static Object[][] numsForMultAndDiv(){
		return new Object[][] {{1,2},{-1,-2},{50,99},{-50,-99},{50,-99},{-50,99},{0,1},{0,-1},{0,-1.5},{0,1.5},{0,99.9},{0,-9.99}};
	}
	@DataProvider (name="dp for long values test")
	public static Object[][] numsForPow(){
		return new Object[][] {{1,2},{-1,-2},{5,9},{-5,-9},{5,-9},{-5,9},{0,1},{0,-1},{0,-1},{0,1},{0,9},{0,-9}};
	}
	@Test(dataProvider="div and mult tests",dependsOnGroups = "div test" , groups={"positive tests"})
	public void multOfTwoValues(double a,double b){
		Assert.assertEquals(calculator.mult(a,b), a*b, "mult method works incorrectly: values mismatch");
	}
	@Test(priority=1,dataProvider="div and mult tests", groups={"positive tests","div test"})
	public void divOfTwoValues(double a,double b){
		Assert.assertEquals(calculator.div(a,b), a/b, "div method works incorrectly: values mismatch");
	}
	@Test(priority=1,dataProvider="dp for long values test")
	public void powNumbers(long a,long b){
		Assert.assertEquals(calculator.pow(a,b), Math.pow(a, b), "pow method works incorrectly: values mismatch");
	}
	@Test(priority=1,dataProvider="dp for long values test")
	public void multOfTwoLongValues(long a,long b){
		Assert.assertEquals(calculator.mult(a,b), a*b, "mult(long) method works incorrectly: values mismatch");
	}
	@Test(priority=1,dataProvider="dp for long values test")
	public void divOfTwoLongValues(long a,long b){
		Assert.assertEquals((double)calculator.div(a,b), (double)a/b, "div(long) method works incorrectly: values mismatch");
	}
	@DataProvider (name="sum and sub tests")
	public static Object[][] numsForSumAndSub(){
		return new Object[][] {{1,2},{0,0},{-1,-2},{50,99},{-50,-99},{50,-99},{-50,99},{1,0},{-1,0},{-1.5,0},{1.5,0},{0,99.9},{-99.9,0}};
	}
	
	@Test(dataProvider="sum and sub tests", groups={"positive tests"})
	public void sumOfTwoValues(double a,double b){
		Assert.assertEquals(calculator.sum(a,b), a+b, "Sum method works incorrectly: values mismatch");
	}
	@Test(dataProvider="sum and sub tests", groups={"positive tests"})
	public void subOfTwoValues(double a,double b){
		Assert.assertEquals(calculator.sub(a,b), a-b, "Sub method works incorrectly: values mismatch");
	}
	@Test(priority=3,groups = "negative tests",expectedExceptions = NumberFormatException.class)
	@Parameters("a")
	public void divByZero(double a){
		calculator.div(50, a);
	}
	
}
