package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressDetailsPage
{
    WebDriver driver;

    public AddressDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[3]/div[1]/a[1]")
    WebElement YourAddress;

    @FindBy(xpath = "//a[@id='ya-myab-address-add-link']")
    WebElement AddAddress;

    @FindBy(name = "address-ui-widgets-enterAddressFullName")
    WebElement FullName;

    @FindBy(name = "address-ui-widgets-enterAddressPhoneNumber")
    WebElement PhoneNumber;

    @FindBy(name = "address-ui-widgets-enterAddressPostalCode")
    WebElement PostalCode;

    @FindBy(name = "address-ui-widgets-enterAddressLine1")
    WebElement AddressLine1;

    @FindBy(name = "address-ui-widgets-enterAddressLine2")
    WebElement AddressLine2;

    @FindBy(name = "address-ui-widgets-landmark")
    WebElement LandMark;

    @FindBy(name = "address-ui-widgets-enterAddressCity")
    WebElement AddressCity;

    @FindBy(xpath = "//select[@name='address-ui-widgets-enterAddressStateOrRegion']")
    WebElement SelectState;

    @FindBy(xpath = "//body/div[@id='a-page']/div[2]/div[1]/div[2]/form[1]/span[1]/div[1]/span[1]/span[1]/span[1]/input[1]")
    WebElement AddAddressButton;

    public WebElement YourAddressSection() {
        return YourAddress;
    }

    public WebElement ClickOnAddAddressIcon() {
        return AddAddress;
    }

    public WebElement FullName() {
        return FullName;
    }

    public WebElement PhoneNumber() {
        return PhoneNumber;
    }

    public WebElement PostalCode() {
        return PostalCode;
    }

    public WebElement AddressLine1() {
        return AddressLine1;
    }

    public WebElement AddressCity() {
        return AddressCity;
    }

    public void SelectState() {
        Select stateDropDown = new Select(SelectState);
        stateDropDown.selectByIndex(2);
    }

    public WebElement ClickAddressButton() {
        return AddAddressButton;
    }

}
