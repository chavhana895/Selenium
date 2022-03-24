package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown
{
    public static void main(String[] args) throws InterruptedException
    {
        //system property for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  //1
        //Initialise a chrome driver class
        WebDriver driver = new ChromeDriver();     //2        Combining 1 & 2 it will launch chrome browser

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

        //By parent child xpath
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        //a[@value='MAA']             for chennai
        //a[@value='BLR']             for bengluru

        //calender


//        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
//        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
//        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

        //.ui-state-default.ui-state-highlight
    }
}