package com.independent.core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by ctl-user on 04-03-2017.
 */
public class BasePage {
    WebDriver driver;

    public BasePage(){

    }

    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public void navigateToURL(String url){
        driver.get(url);
    }

    public void waitForPageLoad(){

    }

    public String getCurrentUrl(){
        try{
            return driver.getCurrentUrl();
        }catch(Exception e){
            return  "";
        }

    }

    public String getTitle(){
        try{
            return driver.getTitle();
        }catch(Exception e){
            return "";
        }

    }
    public void click(WebElement element){
        try{
            element.click();
        }catch(NoSuchElementException e){
            throw e;
        }
    }

    public void selectByVisibleText(WebElement element,String txtValue){
        try{
            Select ddn = new Select(element);
            ddn.selectByVisibleText(txtValue);
        }catch(NoSuchElementException e){
            throw e;
        }
    }

    public void selectByIndex(WebElement element,int intIndex){
        try{
            Select ddn = new Select(element);
            ddn.selectByIndex(intIndex);
        }catch(NoSuchElementException e){
            throw e;
        }
    }

    public void enterText(WebElement element,String txtValue){
        try{
            element.sendKeys(txtValue);
        }catch(NoSuchElementException e){
            throw e;
        }
    }

    public  void sleepTime(long waitTime){
        try{
            Thread.sleep(waitTime);
        }catch(InterruptedException e){

        }
    }

    public WebElement waitForElementToBeVisible(WebElement element,long time){
        WebDriverWait wait = new WebDriverWait(driver,time);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void setText(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public void getText(WebElement element){
        element.getText();
    }

    public boolean isElementVisible(WebElement element){
        boolean isVisible = false;
        try{
            WebDriverWait wait = new WebDriverWait(driver,20);
            wait.until(ExpectedConditions.visibilityOf(element));
            if(element.isDisplayed())
                isVisible = true;
        }catch(Exception e){
            isVisible = false;
        }
        return isVisible;
    }


}
