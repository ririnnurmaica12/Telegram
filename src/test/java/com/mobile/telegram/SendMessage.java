package com.mobile.telegram;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
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

    @When("^Click button add new message$")
    public void click_button_add_new_message() {
        sendMessageHelper.click_button_add_new_message().click();
    }

    @When("^Click icon search in contact page$")
    public void click_icon_search_in_contact_page() {
        sendMessageHelper.click_icon_search_in_contact_page().click();
    }

    @When("^Search \"([^\"]*)\"$")
    public void search(String contactName) {
        sendMessageHelper.searchContactName().setValue(contactName);
    }

    @When("^Click contact name$")
    public void click_contact_name(){
        sendMessageHelper.click_contact_name().click();
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
    public void send_message_should_be(String result) {
        String columnMessage =sendMessageHelper.textMessage().getTagName();
        if (result.equalsIgnoreCase("Success")){
            Assert.assertEquals("",columnMessage);
        }else{
            Assert.assertNotEquals("",columnMessage);
        }
    }
}
