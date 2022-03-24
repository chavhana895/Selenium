package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDealPage extends Base
{
    WebDriver driver;

    public TodaysDealPage()
    {
        super();
    }

    public TodaysDealPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Today's Deals")
    WebElement TodayDeal;

    @FindBy(xpath = "//span[contains(text(),'Prime eligible')]")
    WebElement checkPrime;

    //@FindBy(xpath = "/html[1]/body[1]/div[1]/div[16]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/a[2]/div[1]")
    @FindBy(css="#slot-15 > div > div > div.GridContainer-module__gridMainContainer_24aSWvAi-VAzH5okoDOqpb > div.a-row.Grid-module__gridSection_1SEJTeTsU88s6aVeuuekAp > div > div:nth-child(3) > div > div > a:nth-child(4) > div")
    WebElement ThirdDeal;

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

    public WebElement FirstItem()
    {
        return FirstItem;
    }
}
