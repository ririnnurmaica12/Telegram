package com.mobile.telegram;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class SearchHelper {
    private AndroidDriver<AndroidElement> driver;

    public SearchHelper(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
    }

    public AndroidElement clickIconSearch(){
        String buttonSearch ="//android.widget.ImageButton[@content-desc=\"Search\"]";
        return driver.findElement(By.xpath(buttonSearch));
    }
    public AndroidElement columnSearch(){
        String columnSearch ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.HorizontalScrollView/android.widget.FrameLayout/android.widget.EditText";
        return driver.findElement(By.xpath(columnSearch));
    }
    public AndroidElement resultOfSearch(){
        String dataResult ="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]";
        return driver.findElement(By.xpath(dataResult));
    }

}
