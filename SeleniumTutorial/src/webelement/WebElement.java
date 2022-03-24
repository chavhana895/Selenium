package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement
{
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(100);
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 12");
        Thread.sleep(100);
        driver.findElement(By.className("nav-right")).click();
        driver.navigate().to("https://www.zemosolabs.com/");
        Thread.sleep(150);
        driver.navigate().back();
        driver.quit();
    }
}
