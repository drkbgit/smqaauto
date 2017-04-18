package com.independent.automation.sm.tests;

import com.independent.automation.sm.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



/**
 * Created by ctl-user on 17-04-2017.
 */
public class TrainingTests extends smBaseTest {

    @DataProvider
    public Object[][] testDataProvider(){
        Object[][] testData = new String[1][5];
        testData[0][0] ="test";
        testData[0][1] ="test";
        testData[0][2] ="T_QA_Selenium";
        testData[0][3] ="Self-Video Trainings";
        testData[0][4] ="Free";
        return testData;
    }

    @Test(dataProvider = "testDataProvider")
    public void getTrainingDetails(String username,String password,String trainingId,
                                   String trainingType,String trainingCost){
        loginPage.navigateToURL("http://localhost:5080/SMPortal/");
        loginPage.loginAsUser(username,password);
        Assert.assertTrue(homePage.isHomePageDisplayed());
        homePage.navigateToTrainingPage();
        trainingPage.getTrainingDetails(trainingId,trainingType,trainingCost);
    }

}