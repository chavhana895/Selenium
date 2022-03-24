package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.lang.String;
public class Locators
{
    public static void main(String[] args)
    {
        //system property for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");  //1
        //Initialise a chrome driver class
        WebDriver driver = new ChromeDriver();     //2        Combining 1 & 2 it will launch chrome browser

        //launch the website
        driver.get("https://www.ixambee.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("8805937214");
        driver.findElement(By.name("password")).sendKeys("88059");
       // driver.findElement(By.className("btn btn-primary btn-block login-submit-btn")).click();   submit_btn
        driver.findElement(By.id("submit_btn")).click();
       driver.findElement(By.cssSelector("small#email_alert_email")).getText();
       // driver.findElement(By.linkText("https://www.ixambee.com/forgot_password")).click();
        driver.findElement(By.className("forgot-password")).click();
        driver.findElement(By.xpath("//input [@placeholder='Enter your email']")).sendKeys("chavhana895@gmail.com");
        driver.findElement(By.cssSelector("button[type='submit']")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
    }
}