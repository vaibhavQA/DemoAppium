package com.test;

import java.net.MalformedURLException;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class CallDriver implements IInvokedMethodListener  {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("Invoking driver");
		Driver d = new Driver();
		try {
			d.driverSetUp();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

		
	}
	
	
}
