package com.mobile.telegram;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class Login extends BaseAndroidTest  {
    private LoginHelper loginHelper;

    @BeforeClass
    @Given("^open the telegram application$")
    public void open_the_telegram_application() throws MalformedURLException {
        BaseAndroidTest.initDriverReset();
        loginHelper = new LoginHelper(driver);
    }

    @Test
    @When("^Click button satart message$")
    public void click_button_satart_message() {
        assertTrue(loginHelper.isStartMessagingBtnVisible());
        assertEquals(loginHelper.startMessaging().getText(), "Start Messaging");
        loginHelper.clickStartMessagingBtn();
    }

    @When("^Fill the \"([^\"]*)\"$")
    public void fill_the(String phoneNumber) {
        loginHelper.clickOkButton().click();
        loginHelper.clickAllowPhoneCallButtonLast().click();
        loginHelper.enterNumberPhone().setValue(phoneNumber);
    }

    @When("^Click button next$")
    public void click_button_next() {
        loginHelper.clickButtonDone().click();
        loginHelper.clickOkButtonLast().click();
        loginHelper.clickAllowPhoneCallButtonLast().click();
    }

    @Then("^Login should be \"([^\"]*)\"$")
    public void login_should_be(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    /*@AfterClass
    public void Close(){
        BaseAndroidTest.quitDriver();
    }*/
}
