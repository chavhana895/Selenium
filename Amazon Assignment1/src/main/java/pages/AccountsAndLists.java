package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountsAndLists
{
    WebDriver driver;

    public AccountsAndLists(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "nav-link-accountList")
    WebElement AccountsAndList;

    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[3]/div[2]/a[1]")
    WebElement PaymentOptions;


    public WebElement ClickOnAccountsAndList()
    {
        Actions action = new Actions(driver);
        action.moveToElement(AccountsAndList).build().perform();
        return AccountsAndList;
    }

    public WebElement ClickOnPaymentOptions()
    {
        return PaymentOptions;
    }
}
