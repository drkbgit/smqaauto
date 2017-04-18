package com.independent.automation.sm.tests;

import com.independent.automation.sm.pages.HomePage;
import com.independent.automation.sm.pages.LoginPage;
import com.independent.automation.sm.pages.TrainingPage;
import com.independent.core.tests.BaseTest;
import com.independent.core.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;

/**
 * Created by ctl-user on 17-04-2017.
 */
public class smBaseTest extends BaseTest {

    WebDriver driver;
    LoginPage loginPage;
    HomePage homePage;
    TrainingPage trainingPage;

    @BeforeMethod
    @Parameters({"platform","browserName","browserVersion"})
    public void setUp(String os ,String browserName,String browserVersion){
        driver = new Driver(os,browserName,browserVersion).getDriver();
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        trainingPage = new TrainingPage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
