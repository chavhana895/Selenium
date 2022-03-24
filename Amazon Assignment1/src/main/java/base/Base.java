package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base
{
    public static WebDriver driver;
    public static Properties prop;

    public Base()
    {
        try {
            prop = new Properties();
            FileInputStream ip = new FileInputStream("C:\\Users\\acer\\IdeaProjects\\Amazon Assignment1\\src\\main\\resources\\config.properties");
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
        String browserName = prop.getProperty("browser");
        String browserUrl=prop.getProperty("url");
        System.out.println(browserName);
        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
            driver = new ChromeDriver();
        }
//        else if (browserName.equals("FF")) {
//            System.setProperty("webdriver.gecko.driver", "C:\\Users\\acer\\Downloads\\geckodriver");
//            driver = new FirefoxDriver();
//        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));


        driver.get(prop.getProperty("url"));
    }
}
