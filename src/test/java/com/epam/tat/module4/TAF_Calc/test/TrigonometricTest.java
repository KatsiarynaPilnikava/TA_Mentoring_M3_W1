package com.epam.tat.module4.TAF_Calc.test;
import org.testng.Assert;
import org.testng.annotations.*;

public class TrigonometricTest extends BasicCalcTest{
	
	@DataProvider (name="sin and cos data")
	public static Object[][] numsForSinAndCos(){
		return new Object[][] {{0},{1},{2},{3},{4},{5},{-0},{-1},{-1.5},{1.5},{666},{-666}};
	}
	
	@Test(dataProvider="sin and cos data", groups={"positive tests"})
	public void cosValueOf(double a){
		Assert.assertEquals(calculator.cos(a), Math.cos(a), "Cos method works incorrectly: values mismatch");
	}
	@Test(dataProvider="sin and cos data", groups={"positive tests"})
	public void sinValueOfa(double a){
		Assert.assertEquals(calculator.sin(a), Math.sin(a), "Sin method works incorrectly: values mismatch");
	}
}
