package com.mobile.telegram;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseAndroidTest {
    public static AndroidDriver<AndroidElement> driver;
    private static String APPIUM_SERVER = "http://localhost:4723/wd/hub";
    private static String APP_PACKAGE = "org.telegram.messenger";
    private static String APP_ACTIVITY = "org.telegram.ui.LaunchActivity";
    private static String APP_DEVICENAME = "RR8M60CHELR";
    private static String APP_PLATFORMNAME = "Android";

    public static void initDriver () throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, APP_DEVICENAME);
        dc.setCapability("platformName",APP_PLATFORMNAME);
        dc.setCapability("appPackage", APP_PACKAGE);
        dc.setCapability("appActivity", APP_ACTIVITY);

        URL url = new URL(APPIUM_SERVER);
        driver = new AndroidDriver<AndroidElement>(url, dc);
       }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
        }

    }
}
