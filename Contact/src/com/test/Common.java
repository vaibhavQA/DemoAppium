package com.test;

import org.testng.Assert;

public class Common extends Driver {
	public void verifyTrue(boolean flag, String failMessage, String passMessage) {
		  if (flag) {
		  System.out.println(passMessage);
		  } else {
		 Assert.assertTrue(false, failMessage);
		  }
		 }
}
