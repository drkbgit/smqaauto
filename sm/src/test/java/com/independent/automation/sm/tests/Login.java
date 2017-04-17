package com.independent.automation.sm.tests;

import com.independent.automation.sm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



/**
 * Created by ctl-user on 17-04-2017.
 */
public class Login extends smBaseTest {

    @DataProvider(name ="data_Provider")
    public Object[][] testDataProvider(){
        Object[][] testData = new String[1][2];
        testData[0][0] ="test";
        testData[0][1] ="test";
        return testData;
    }

    @Test(dataProvider = "testDataProvider")
    public void verifyLogin(String username,String password){
        System.out.println("username" + username);
        System.out.println("password" + password);
        loginPage.navigateToURL("http://localhost:5080/SMPortal/");
        Assert.assertTrue(loginPage.isLoginSectionDisplayed());
        loginPage.loginAsUser(username,password);
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }
}