package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeliveryDateChecker
{
    WebDriver driver;

    public DeliveryDateChecker(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='ddmDeliveryMessage'] //b")
    WebElement deliveryDate;

    public WebElement DeliveryDate() {
        return deliveryDate;
    }
}
