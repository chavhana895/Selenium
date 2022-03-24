package testcases;

import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LogInPage;
import pages.TodaysDealPage;

import static base.Base.initialization;

public class LoginTest extends Base
{
   LogInPage logInPage;
    HomePage homePage;

    public LoginTest()
    {
        super();
    }

    @BeforeMethod
    public void setUp()
    {
        initialization();
        logInPage=new LogInPage();
    }

//    @Test
//    public HomePage login()
//    {
//        logInPage.clickOnSignIn().click();
//        logInPage.enterLogInId().sendKeys(prop.getProperty("username"));
//        logInPage.clickOnContinue().click();
//        logInPage.enterPassword().sendKeys(prop.getProperty("password"));
//        logInPage.clickOnSubmit().click();
//
//        return new HomePage();
//    }


    @Test
    public void signIn()
    {
        logInPage.login();
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
