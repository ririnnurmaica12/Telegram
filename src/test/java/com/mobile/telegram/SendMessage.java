package com.mobile.telegram;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SendMessage extends BaseAndroidTest {
    private SearchHelper searchHelper;
    private SendMessageHelper sendMessageHelper;
    @BeforeClass
    public void init() throws MalformedURLException {
        BaseAndroidTest.initDriver();
        searchHelper = new SearchHelper(driver);
        sendMessageHelper = new SendMessageHelper(driver);
    }

    @Test
    public void searchUser() {
        searchHelper.clickIconSearch().click();
        searchHelper.resultOfSearch().click();
    }

    @Test
    public void textMessage(){
        sendMessageHelper.textMessage().setValue("kirim pesan");
    }

    @Test
    public void textMessageSend(){
        sendMessageHelper.sendMessage().click();
    }
}
