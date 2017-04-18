package  com.independent.automation.sm.pages;

import com.independent.core.pages.BasePage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by ctl-user on 17-04-2017.
 */

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="//h1[text()='Skill Management']")
    WebElement lblHeader;
    @FindBy(xpath="//a[text()='Home']")
    WebElement lnkHome;
    @FindBy(xpath="//a[text()='My Profile']")
    WebElement lnkMyProfile;
    @FindBy(xpath="//a[text()='My Trainings']")
    WebElement lnkMyTrainings;
    @FindBy(xpath="//a[text()='My Jobs']")
    WebElement lnkMyJobs;
    @FindBy(name="search")
    WebElement txtSearch;

    public boolean isHomePageDisplayed(){
        boolean isVisible = false;
        try{
            isVisible = isElementVisible(lnkHome);
        }catch(NoSuchElementException e){
            isVisible= false;
        }
        return isVisible;
    }

    public void navigateToTrainingPage(){
        waitForElementToBeVisible(lnkMyTrainings,10);
        click(lnkMyTrainings);
    }


}