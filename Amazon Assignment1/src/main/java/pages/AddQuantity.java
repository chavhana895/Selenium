package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddQuantity
{
    WebDriver driver;

    public AddQuantity(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//select[@id='quantity']")
    WebElement quantity;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[5]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/div[25]/div[1]/div[1]/div[1]/span[1]/div[1]/div[1]/span[1]/select[1]")
    WebElement dropDownElement;

    @FindBy(xpath = "//input[@id='add-to-cart-button']")  //body/div[4]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/span[1]/span[1]/input[1]
    WebElement addToCart; ////input[@id='add-to-cart-button']

    @FindBy(xpath="//body/div[4]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/span[1]/span[1]/input[1]")
    WebElement addPlan;

    @FindBy(xpath = "//span[contains(text(),'Added to Cart')]")
    WebElement CheckingItem;

    public WebElement QuantityDropDown() {
        return quantity;
    }

    public WebElement SelectFromDropDown() {
        return dropDownElement;
    }

    public WebElement AddToCart() {
        return addToCart;
    }

    public WebElement AddPlan()
    {
        return addPlan;
    }

    public WebElement CheckingItemInCart() {
        return CheckingItem;
    }
}
