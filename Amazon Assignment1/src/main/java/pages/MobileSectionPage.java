package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileSectionPage
{
    WebDriver driver;

    public MobileSectionPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Mobiles")
    WebElement MobilesSection;

    @FindBy(xpath = "//div[@id='nav-logo'] //a")
    WebElement HomePage;

    public WebElement MobilesSection() {
        return MobilesSection;
    }

    public WebElement ClickOnHomePage() {
        return HomePage;
    }
}
