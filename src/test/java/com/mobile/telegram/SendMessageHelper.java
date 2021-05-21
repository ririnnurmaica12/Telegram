package com.mobile.telegram;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendMessageHelper {
    private AndroidDriver<AndroidElement> driver;
    public SendMessageHelper(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
    }

    public AndroidElement textMessage() {
    String textMessage ="/hierarchy / android.widget.FrameLayout / android.widget.LinearLayout / android.widget.FrameLayout / android.widget.FrameLayout / android.widget.FrameLayout / android.widget.FrameLayout / android.widget.FrameLayout / android.widget.FrameLayout / android.widget.FrameLayout[2] / android.widget.LinearLayout / android.widget.FrameLayout[1] / android.widget.EditText";
    (new WebDriverWait(driver,50)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(textMessage))));
    return driver.findElement(By.xpath(textMessage));
    }

    public AndroidElement sendMessage(){
        String sendMessage ="//android.view.View[@content-desc=\"Send\"]";
        return driver.findElement(By.xpath(sendMessage));
    }
    }
