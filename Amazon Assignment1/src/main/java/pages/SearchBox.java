package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchBox
{
    WebDriver driver;

    public SearchBox(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    WebElement searchBox;

    @FindBy(css = "#nav-search-submit-button")
    WebElement searchButton;

    public WebElement SearchElement() {
        return searchBox;
    }

    public WebElement searchButtonClick() {
        return searchButton;
    }
}
