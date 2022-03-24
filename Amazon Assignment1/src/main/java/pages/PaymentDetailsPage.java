package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PaymentDetailsPage
{
    WebDriver driver;

    public PaymentDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='walletWebsiteContainer']/div[@id='mainContentRow']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
    WebElement CardDetailsTab;

    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='walletWebsiteContainer']/div[@id='mainContentRow']/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement IdentifyCardName;

    @FindBy(xpath = "//input[@class='a-button-input']")
    WebElement cardButton;

    @FindBy(xpath = "//input[@name='addCreditCardNumber']")
    WebElement CardNumber;

    @FindBy(xpath = "//input[@name='ppw-accountHolderName']")
    WebElement CardName;

    @FindBy(name = "//select[@name='ppw-expirationDate_month']")
    WebElement ExpiryMonth;

    public WebElement ClickOnCardDetailsTab() {
        return CardDetailsTab;
    }

    public WebElement CheckCardName() {
        return IdentifyCardName;
    }

    public WebElement ClickOnCardDetailsButton() {
        return cardButton;
    }

    public WebElement AddCardNumber() {
        return CardNumber;
    }
    public WebElement AddCardName() {
        return CardName;
    }

    public void ExpiryMonthSelect() {
        Select monthDropDown = new Select(ExpiryMonth);
        monthDropDown.selectByIndex(12);

    }

}
