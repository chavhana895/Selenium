package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPage
{
    WebDriver driver;

    public AmazonLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[@id='sc-buy-box-ptc-button']")
    WebElement SignIn;

    @FindBy(id = "ap_email")
    WebElement Email;

    @FindBy(id = "continue")
    WebElement ContinueButton;

    @FindBy(id = "ap_password")
    WebElement Password;

    @FindBy(id = "signInSubmit")
    WebElement SignInButton;

    public WebElement SignIn() {
        return SignIn;
    }

    public WebElement Email() {
        return Email;
    }

    public WebElement ContinueButton() {
        return ContinueButton;
    }

    public WebElement Password() {
        return Password;
    }

    public WebElement ClickSignInButton() {
        return SignInButton;
    }
}
