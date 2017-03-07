package com.test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

public class Driver {

	public static WebDriver driver;

	@SuppressWarnings("rawtypes")
	public void driverSetUp() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ABCD");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.UDID, "09fd07e9");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4725/wd/hub"), cap);
	}

	public Driver() {

		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;

	}

}
