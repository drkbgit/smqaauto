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

public class LoginPage extends BasePage{

    @FindBy(name="userName")
    WebElement txtusername;
    @FindBy(name="password")
    WebElement txtpassword;
    @FindBy(name="rememberMe")
    WebElement chkRememberMe;
    @FindBy(xpath="//input[@value='Submit']")
    WebElement btnSubmit;
    @FindBy(xpath= "//td[text()='User Name']")
    WebElement lblUsername;

    public LoginPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void loginAsUser(String username,String password){
        txtusername.sendKeys(username);
        txtpassword.sendKeys(password);
        chkRememberMe.click();
        btnSubmit.click();
    }


    public boolean isLoginSectionDisplayed(){
        boolean isVisible = false;
        try{
            isVisible = isElementVisible(lblUsername);
        }catch(NoSuchElementException e){
            isVisible=false;
        }
        return isVisible;
    }

}