package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TodaysDealPage extends Base
{

    @FindBy(xpath="//a[contains(text(),\"Today's Deals\")]")
    WebDriver todaysDeal;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[16]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[3]/div[1]/div[1]/a[2]/div[1]")
    WebDriver thirdDeal;

    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/a[1]/div[1]/span[1]")
    WebDriver thirdItem;

    @FindBy(id = "add-to-cart-button")
    WebElement addToCart;

    @FindBy(xpath = "//input[@placeholder='Search Amazon.in']")
    WebElement searchItems;

    public TodaysDealPage()                      //Initializing Page Objects
    {
        PageFactory.initElements(driver,this);
    }

//    public WebElement thirdItem()              //Actions
//    {
//
//    }


}
