package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends Base
{

//    By signIn=By.id("nav-link-accountList-nav-line-1");
//    By loginId=By.id("ap_email");
//    By continueButton=By.id("continue");
//    By password=By.id("ap_password");
//    By submit=By.id("signInSubmit");


    @FindBy(id="nav-link-accountList-nav-line-1")
    WebElement signIn;

    @FindBy(id="ap_email")
    WebElement loginId;

    @FindBy(id="continue")
    WebElement continueButton;

    @FindBy(id="ap_password")
    WebElement password;

    @FindBy(id="signInSubmit")
    WebElement submit;

    public void login()
    {
        signIn.click();
        loginId.sendKeys(prop.getProperty("username"));
        continueButton.click();
        password.sendKeys(prop.getProperty("password"));
        submit.click();
    }














//    WebDriver driver;
//
//    public LogInPage() {
//        this.driver = driver;
//    }
//    By signIn=By.id("nav-link-accountList-nav-line-1");
//    By loginId=By.id("ap_email");
//    By continueButton=By.id("continue");
//    By password=By.id("ap_password");
//    By submit=By.id("signInSubmit");
//
//    public WebElement clickOnSignIn()
//    {
//        return driver.findElement(signIn);
//    }
//    public WebElement enterLogInId()
//    {
//        return driver.findElement(loginId);
//    }
//    public WebElement clickOnContinue()
//    {
//        return driver.findElement(continueButton);
//    }
//    public WebElement enterPassword()
//    {
//        return driver.findElement(password);
//    }
//    public WebElement clickOnSubmit()
//    {
//        return driver.findElement(submit);
//    }


//    public void login(String username, String password)
//    {
//        username.sendKeys(username);
//        password.sendKeys(password);
//        loginBtn.click();
//
//        return new HomePage();
//    }

}
