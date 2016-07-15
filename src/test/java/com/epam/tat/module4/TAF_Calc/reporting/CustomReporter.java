package com.epam.tat.module4.TAF_Calc.reporting;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.xml.XmlSuite;

public class CustomReporter implements IReporter{
    public void generateReport(List xmlSuites, List suites,
        String outputDirectory) {
    	Iterator<ISuite> itrTemp = suites.iterator();
        while (itrTemp.hasNext()) {
            
        	ISuite suite=itrTemp.next();
            String suiteName = suite.getName();
	    
	    Map<String, ISuiteResult> suiteResults = suite.getResults();
	    for (Map.Entry<String, ISuiteResult> entry : suiteResults.entrySet()) {
	        ITestContext tc = entry.getValue().getTestContext();
	        System.out.println("Passed tests for suite '" + suiteName +
	             "' is:" + tc.getPassedTests().getAllResults().size());
	        System.out.println("Failed tests for suite '" + suiteName +
	             "' is:" + 
	             tc.getFailedTests().getAllResults().size());
	        System.out.println("Skipped tests for suite '" + suiteName +
	             "' is:" + 
	             tc.getSkippedTests().getAllResults().size());
	      }
        }
    }
}