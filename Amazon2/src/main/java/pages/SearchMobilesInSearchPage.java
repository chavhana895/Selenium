package pages;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchMobilesInSearchPage extends Base
{
    WebDriver driver;

    public SearchMobilesInSearchPage(WebDriver driver) {
        this.driver = driver;
    }
    By searchBox=By.id("twotabsearchtextbox");
    By search=By.id("nav-search-submit-button");
    By getLastItem=By.xpath("//img[@data-image-index='22']");

    public WebElement searchBox()
    {
        return driver.findElement(searchBox);
    }
    public WebElement search()
    {
        return driver.findElement(search);
    }
    public Object ScrollDownPage()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("window.scrollTo(0,5800)");
    }
    public WebElement getLastDisplayedItem()
    {
        return driver.findElement(getLastItem);
    }
}
