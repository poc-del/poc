package org.tsn.repo.automationframework.core;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseSetup {

	private DesiredCapabilities caps;
	// private static AndroidDriver androidDriver = null;

	public AppiumDriver<MobileElement> driver;

	private String appiumPort = "4723";
	private String serverIp = "127.0.0.1";

	/*
	 * public void setup(){ initDriver(); }
	 */

	/*
	 * public AndroidDriver getDriver() { return androidDriver; }
	 */
	@BeforeTest
	private void initDriver() {
		System.out.println("Inside initDriver method");

		caps = new DesiredCapabilities();
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixrl 2");
		caps.setCapability(MobileCapabilityType.UDID, "HT79P1A04831");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		// caps.setCapability(MobileCapabilityType.APP, "");
		caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "ca.bellmedia.cravetv.SplashActivity");
		caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "ca.bellmedia.cravetv");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "4000");
		// cap.setCapability("noReset", true);
		String serverUrl = "http://" + serverIp + ":" + appiumPort + "/wd/hub";

		try {
			System.out.println("Argument to driver object : " + serverUrl);
			driver = new AppiumDriver<MobileElement>(new URL(serverUrl), caps);
			System.out.println("DriverStarted");

		} catch (Exception ex) {
			throw new RuntimeException("appium driver could not be initialised for device ");
		}
		System.out.println("Driver in initdriver is : " + driver);

	}

	@Test
	public void printfd() {

		System.out.println("Hello");
		/*
		 * LoginPage obj = new LoginPage(driver); obj.validateNavBar();
		 * obj.navBarClick();
		 */

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
