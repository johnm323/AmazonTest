package com.qa.amazon.pages;

import com.qa.amazon.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {


//Page Factory / OR

    @FindBy(id ="twotabsearchtextbox")
    WebElement SearchTextBox;

    @FindBy(id="nav-logo-sprites")
    WebElement Logo;

    @FindBy(id="nav-search-submit-button")
    WebElement enterButton;


    // Initializing the Page Objects
    public HomePage(){

        PageFactory.initElements(driver, this);

    }

    //Actions
    public void clearSearchBox(){
        SearchTextBox.clear();
    }

    public void clickOnEnterButton(){
        enterButton.click();
    }

    public String validateHomePageTitle(){
       return driver.getTitle();
    }


    public boolean validateLogoIsDisplayed(){
        return Logo.isDisplayed();

    }


    public void EnterSearchString(String text){
       clearSearchBox();
       SearchTextBox.sendKeys(text);
        clickOnEnterButton();

    }



}
