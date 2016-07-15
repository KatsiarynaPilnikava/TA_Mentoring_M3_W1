package com.epam.tat.module4.TAF_Calc.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PosAndNegNumTest extends BasicCalcTest{
	
	@DataProvider (name="nums")
	public static Object[][] numsForSinAndCos(){
		return new Object[][] {{0},{1},{2},{3},{4},{5},{-0},{-1},{666},{-666}};
	}
	
	@Test(dataProvider="nums", groups={"positive tests"})
	public void isPositiveVerification(long a){
		boolean positive=false;
		if(a>0){positive=true;}
		Assert.assertEquals(calculator.isPositive(a), positive, "isPositive method works incorrectly");
	}
	@Test(dataProvider="nums", groups={"positive tests"})
	public void isNegativeVerification(long a){
		boolean negative=false;
		if(a<0){negative=true;}
		Assert.assertEquals(calculator.isNegative(a), negative, "isNegative method works incorrectly");
	}
}

