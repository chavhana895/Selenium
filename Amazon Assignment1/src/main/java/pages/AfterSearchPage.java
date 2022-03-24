package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterSearchPage
{
    WebDriver driver;

    public AfterSearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

//    String parentWindow = driver.getWindowHandle();

    @FindBy(xpath = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[1]/div[1]/span[3]/div[2]/div[24]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/span[1]/a[1]/div[1]")
    WebElement lastItem;

    @FindBy(xpath = "//span[contains(text(),'Eligible for Pay On Delivery')]")
    WebElement payOnDelivery;

    public WebElement GetLastItemDetails() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,6000)");
        return lastItem;
    }

    public Object ScrollDownPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("window.scrollTo(0,5000)");

    }

    public WebElement CloseWindow() {
        String parentWindow = driver.getWindowHandle();
        return (WebElement) driver.switchTo().window(parentWindow);
    }


}
