package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown
{
    public static void main(String[] args) throws InterruptedException {
        //system property for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  //1
        //Initialise a chrome driver class
        WebDriver driver = new ChromeDriver();     //2        Combining 1 & 2 it will launch chrome browser

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());    //1 adult by default

        for(int i=2 ; i<=5 ; i++)               //1 adult by default
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }                                                                  //5 adults be selected
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}