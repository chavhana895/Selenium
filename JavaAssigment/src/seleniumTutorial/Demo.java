package seleniumTutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://web.whatsapp.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        //System.out.println(driver.);
        driver.quit();
    }
}
