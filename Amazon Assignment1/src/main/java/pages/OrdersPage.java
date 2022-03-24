package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage
{
    WebDriver driver;

    public OrdersPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@id='nav-orders']")
    WebElement OrdersPage;

    @FindBy(xpath = "//span[@class='a-dropdown-prompt']")
    WebElement DropDownClick;

    @FindBy(partialLinkText = "2021")
    WebElement LastYearSelect;

    public WebElement ClickOnOrderPage() {
        return OrdersPage;
    }

    public WebElement ClickOnDropDown() {
        return DropDownClick;
    }

    public WebElement SelectLastYearOption() {
        return LastYearSelect;
    }
}
