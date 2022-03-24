package testcases;

import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.TodaysDeals;

public class TodaysDealsTest extends Base
{
  TodaysDeals todaysDeals;

    public TodaysDealsTest()
    {
        super();
    }

    @Test
    @BeforeMethod
    public void setUp()
    {
      initialization();
      TodaysDeals todaysDeals = new TodaysDeals();
    }

    @Test
    public void select()
    {
       todaysDeals.deal.click();
    }
@Test
  @AfterMethod
  public void tearDown()
  {
    driver.quit();
  }
}