package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns
{
    public static void main(String[] args)
    {
        //system property for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  //1
        //Initialise a chrome driver class
        WebDriver driver = new ChromeDriver();     //2        Combining 1 & 2 it will launch chrome browser

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //dropdown with select tag static
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());

    }
}
