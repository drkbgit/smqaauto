package com.independent.core.tests;
import com.independent.core.listeners.BaseListener;
import com.independent.core.pages.BasePage;
import com.independent.core.reporters.BaseReporter;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;



/**
 * Created by ctl-user on 05-03-2017.
 */
public class BaseTest {
    BasePage basePage;
    BaseListener baseListener;
    BaseReporter baseReporter;
    protected WebDriver driver;

    @BeforeClass
    public void setUp(){
        basePage = new BasePage();
    }

    @AfterClass
    public void tearDown(){

    }

}
