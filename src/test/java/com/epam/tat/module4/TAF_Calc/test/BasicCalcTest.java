package com.epam.tat.module4.TAF_Calc.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

import com.epam.tat.module4.Calculator;

public class BasicCalcTest {
	protected Calculator calculator;
	@BeforeClass
	public void initCalc(){
		System.out.println("Starting executing tests at "+this.getClass().getName());
		calculator=new Calculator();
	}
	
	@AfterClass
	public void afterClassNotification(){
		System.out.println("Finishing executing tests at "+this.getClass().getName());
		
	}
}
