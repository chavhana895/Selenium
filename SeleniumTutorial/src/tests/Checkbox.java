package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Checkbox
{
    public static void main(String[] args)
    {
        //system property for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  //1
        //Initialise a chrome driver class
        WebDriver driver = new ChromeDriver();     //2        Combining 1 & 2 it will launch chrome browser

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //ctl00_mainContent_chk_SeniorCitizenDiscount

       // Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //Assert.assertFalse(true);
        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());

        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount")).click();

      //  System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
        //count the no of checkboxes
        driver.findElements(By.cssSelector("input[type='checkbox']")).size();
    }
}