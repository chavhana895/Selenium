package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base
{
   public WebDriver driver;



    @FindBy(linkText = "Today's Deals")
    WebElement TodayDeal;

    @FindBy(xpath = "//span[contains(text(),'Prime eligible')]")
    WebElement checkPrime;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[16]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/a[2]/div[1]")
    WebElement ThirdDeal;   //abs xpath

    @FindBy(xpath = "//body/div[@id='a-page']/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[3]")
    WebElement ThirdItem;

    @FindBy(xpath = "//select[@id='quantity']")
    WebElement Quantity;

    @FindBy(xpath = "//body/div[@id='a-page']/div[18]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]/div[1]")
    WebElement FirstElementInPrime;

    @FindBy(xpath = "//body/div[@id='a-page']/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/span[1]/div[1]/div[1]/a[1]/div[1]")
    WebElement FirstItem;


    public WebElement TodayDeal() {
        return TodayDeal;
    }

    public WebElement ThirdDeal() {
        return ThirdDeal;
    }

    public WebElement ThirdItem() {
        return ThirdItem;
    }

    public WebElement CheckPrime() {
        return checkPrime;
    }

    public WebElement FirstItemPrime() {
        return FirstElementInPrime;
    }

    public WebElement FirstItem() {
        return FirstItem;
    }
}
