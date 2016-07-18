package com.epam.tat.module4.TAF_Calc.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TimerExecutionListener implements ITestListener {
	private long startTime;

	public void onExecutionStart() {
		startTime = System.currentTimeMillis();
		System.out.println("TestNG is going to start");
	}

	public void onExecutionFinish() {
		System.out.println("TestNG has finished, took around "
				+ (System.currentTimeMillis() - startTime) + "ms");
	}

	public void onStart(ITestContext arg0) {

		Reporter.log("About to begin executing Test " + arg0.getName(), true);

	}

	public void onFinish(ITestContext arg0) {

		Reporter.log("Completed executing test " + arg0.getName(), true);

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

		Reporter.log("Test failed within success persentage: " + arg0.getName());

	}

	public void onTestFailure(ITestResult arg0) {
		Reporter.log("Test failed " + arg0.getName());

	}

	public void onTestSkipped(ITestResult arg0) {
		Reporter.log("Test skipped " + arg0.getName());

	}


	public void onTestSuccess(ITestResult arg0) {
		System.out.println("-> onTestSuccess: " + arg0.getName() + " " + (arg0.getEndMillis() - arg0.getStartMillis() + " ms"));

	}

	public void onTestStart(ITestResult arg0) {
		Reporter.log("Test started " + arg0.getName());

	}

}
