package com.mobile.telegram;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Search extends BaseAndroidTest{
    private SearchHelper searchHelper;
    @BeforeClass
    public void init() throws MalformedURLException {
        BaseAndroidTest.initDriver();
        searchHelper = new SearchHelper(driver);
    }
    @Test
    public void clickIconSearch(){
        searchHelper.clickIconSearch().click();
    }

    @Test
    public void columnSearch(){
       searchHelper.columnSearch().setValue("suami");
    }

    @Test
    public void resultOfSearch(){
        searchHelper.resultOfSearch().click();
    }

}
