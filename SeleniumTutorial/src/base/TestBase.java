package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase
{
    public static WebDriver driver;
    public static Properties prop;      //global variable

    public TestBase()
    {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\acer\\IdeaProjects\\CRM\\src\\config.properties");
            prop.load(ip);
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void initialization()
    {
      String browserName =  prop.getProperty("browser");
      if(browserName.equals("chrome"))
      {
          System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
          driver = new ChromeDriver();  //Initialise
      }
      else if(browserName.equals("FF"))
      {
          System.setProperty("webdriver.gecko.driver","C:\\Users\\acer\\Downloads\\geckodriver");
          driver = new FirefoxDriver();
      }

      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

      driver.get(prop.getProperty("url"));
    }
}