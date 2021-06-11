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
        String textMessage ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.EditText";
        (new WebDriverWait(driver,50)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(textMessage))));
        return driver.findElement(By.xpath(textMessage));
    }

    public AndroidElement click_button_add_new_message() {
        String buttonNewMessage = "//android.widget.FrameLayout[@content-desc=\"New Message\"]/android.widget.ImageView";
        (new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(buttonNewMessage))));
        return driver.findElement(By.xpath(buttonNewMessage));
    }

    public AndroidElement click_icon_search_in_contact_page() {
        String buttonSearch = "//android.widget.ImageButton[@content-desc=\"Search\"]/android.widget.ImageView";
        (new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(buttonSearch))));
        return driver.findElement(By.xpath(buttonSearch));
    }

    public AndroidElement searchContactName(){
        String searchContact = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText";
        (new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(searchContact))));
        return driver.findElement(By.xpath(searchContact));
    }

    public AndroidElement click_contact_name() {
        String contactName = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]";
        (new WebDriverWait(driver, 50)).until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(contactName))));
        return driver.findElement(By.xpath(contactName));
    }

    public AndroidElement sendMessage(){
        String sendMessage ="//android.view.View[@content-desc=\"Send\"]";
        return driver.findElement(By.xpath(sendMessage));
    }
}
