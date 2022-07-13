package com.qa.amazon.testcases;

import com.qa.amazon.base.Base;
import com.qa.amazon.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Base {

    HomePage page;

   public HomePageTest(){
       super();

   }

    @BeforeMethod
    public void setUp(){
        initialization();
        page = new HomePage();

    }

    @Test(priority = 1)
    public void titleTest(){
        String ActualTitle = page.validateHomePageTitle();
       Assert.assertEquals(ActualTitle, "Amazon.com. Spend less. Smile more.");

    }

    @Test(priority = 2)
    public void LogoDisplayed(){
        boolean flag = page.validateLogoIsDisplayed();
        Assert.assertTrue(flag);
    }


    @AfterMethod
    public void tearDown(){
       driver.quit();
    }


}
