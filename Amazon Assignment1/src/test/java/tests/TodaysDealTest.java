package tests;

import base.Base;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.TodaysDealPage;

import java.io.FileNotFoundException;

public class TodaysDealTest extends Base
{
  TodaysDealPage todaysDealPage;

    public TodaysDealTest()
    {
        super();
    }

    @BeforeClass
    public void setUp() throws FileNotFoundException
    {
        Base.initialization();
    }

    @Test(priority = 1)
    public void deals()
    {
        todaysDealPage.TodayDeal();
    }


    @Test(priority = 2)
    public void thirdDeal()
    {
        todaysDealPage.ThirdDeal();
    }

    @AfterClass
    public void quit()
    {
        driver.quit();
    }
}
