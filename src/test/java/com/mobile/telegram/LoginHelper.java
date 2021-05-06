package com.mobile.telegram;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginHelper {
    private AndroidDriver<AndroidElement> driver;

    public LoginHelper(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
    }

    public AndroidElement startMessaging(){
        String message = "android.widget.TextView";
        (new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(driver.findElementsByClassName(message).get(2)));
        return driver.findElementsByClassName(message).get(2);

    }
    public boolean isOtpVerificationInstructionVisible(){
        String veryficationMessage = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView";
        (new WebDriverWait(driver,50)).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(veryficationMessage)));
        return driver.findElement(By.xpath(veryficationMessage)).getText().equals("OK");
    }
    public AndroidElement clickOkButton(){
        String okButton = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.TextView";
        (new WebDriverWait(driver,50)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(okButton))));
        return driver.findElement(By.xpath(okButton));
    }
    public AndroidElement clickAllowPhoneCallButton(){
        String allowButton = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[2]";
        (new WebDriverWait(driver,30)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(allowButton))));

        return driver.findElement(By.xpath(allowButton));
    }
    public AndroidElement enterNumberPhone(){
        String columnPhoneNumber ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout[2]/android.widget.ScrollView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText[2]";
        return driver.findElement(By.xpath(columnPhoneNumber));
    }
    public AndroidElement clickButtonDone(){
        String doneButton ="//android.widget.FrameLayout[@content-desc=\"Done\"]/android.widget.ImageView";
        return driver.findElement(By.xpath(doneButton));
    }
    public boolean isStartMessagingBtnVisible(){
         return startMessaging().isDisplayed();
    }
    public void clickStartMessagingBtn(){
        startMessaging().click();
    }

}
