package com.mobile.telegram;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class SendMessage extends BaseAndroidTest {
    private SearchHelper searchHelper;
    private SendMessageHelper sendMessageHelper;

    @BeforeClass
    @Given("^user is logged in application telegram$")
    public void user_is_logged_in_application_telegram() throws MalformedURLException {
        BaseAndroidTest.initDriver();
        searchHelper = new SearchHelper(driver);
        sendMessageHelper = new SendMessageHelper(driver);
    }

    @Test
    @When("^User click icon search$")
    public void user_click_icon_search() {
        searchHelper.clickIconSearch().click();

    }

    @When("^user select contact$")
    public void user_select_contact() {
        searchHelper.resultOfSearch().click();
    }

    @When("^user writes a \"([^\"]*)\"$")
    public void user_writes_a(String message) {
        sendMessageHelper.textMessage().setValue(message);
    }

    @When("^user click icon send$")
    public void user_click_icon_send() {
        sendMessageHelper.sendMessage().click();
    }

    @Then("^send message should be \"([^\"]*)\"$")
    public void send_message_should_be(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @AfterClass
    public void Close(){
        BaseAndroidTest.quitDriver();
    }
}
