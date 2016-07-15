package com.epam.tat.module4.TAF_Calc.listener;

import org.testng.IExecutionListener;
import org.testng.ITestContext;
import org.testng.Reporter;
 
public class TimerExecutionListener implements IExecutionListener {
    private long startTime;
    public void onExecutionStart() {
        startTime = System.currentTimeMillis();
        System.out.println("TestNG is going to start");    
    }

    public void onExecutionFinish() {
        System.out.println("TestNG has finished, took around " + (System.currentTimeMillis() - startTime) + "ms");
    }
    public void onStart(ITestContext arg0) {
    	 
		Reporter.log("About to begin executing Test " + arg0.getName(), true);
 
	}
    public void onFinish(ITestContext arg0) {
    	 
		Reporter.log("Completed executing test " + arg0.getName(), true);
 
	}

}

