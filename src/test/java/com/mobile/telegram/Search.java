package com.mobile.telegram;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Search extends BaseAndroidTest{
    private SearchHelper searchHelper;

    @BeforeClass
    @Given("^User is logedin application telegram$")
    public void user_is_logedin_application_telegram() throws MalformedURLException {
        BaseAndroidTest.initDriver();
        searchHelper = new SearchHelper(driver);
    }


    @When("^Click icon search$")
    public void click_icon_search() throws Throwable {
        searchHelper.clickIconSearch().click();
    }


    @When("^Type the \"([^\"]*)\" to be searched$")
    public void type_the_to_be_searched(String contactName) throws Throwable {
        searchHelper.columnSearch().setValue(contactName);
    }


    @Then("^Search should be \"([^\"]*)\"$")
    public void search_should_be(String result) throws Throwable {
        searchHelper.resultOfSearch().click();
    }

    @AfterClass
    public void Close(){
        BaseAndroidTest.quitDriver();
    }

}
