package testcases;

import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TodaysDealPage;

public class TodaysDealTest extends Base
{
    TodaysDealPage todaysDealPage;
    HomePage homePage;

    public TodaysDealTest()
    {
        super();
    }

    @BeforeMethod
    public void setUp()
    {
        initialization();
        todaysDealPage = new TodaysDealPage();
    }

    @Test(priority=1)
    public void todaysDealTest()
    {
      // todaysDealPage
      //  return new HomePage();
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
