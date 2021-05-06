package com.mobile.telegram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Login extends BaseAndroidTest  {
    private LoginHelper loginHelper;

    @BeforeClass
    public void init() throws MalformedURLException {
        BaseAndroidTest.initDriver();
        loginHelper = new LoginHelper(driver);
    }

    @Test
    public void startMessagingButtonShouldBeVisible(){
        assertTrue(loginHelper.isStartMessagingBtnVisible());
        assertEquals(loginHelper.startMessaging().getText(), "Start Messaging");
    }
    @Test(dependsOnMethods={"startMessagingButtonShouldBeVisible"})
    public void verificationActivityOpenApp(){
        loginHelper.clickStartMessagingBtn();
        assertTrue(loginHelper.isOtpVerificationInstructionVisible());
        loginHelper.clickOkButton().click();
        loginHelper.clickAllowPhoneCallButton().click();
        loginHelper.enterNumberPhone().setValue("0821xxxxxxxx");
        loginHelper.clickButtonDone().click();
        loginHelper.clickOkButton().click();
        loginHelper.clickAllowPhoneCallButton().click();
    }

}
