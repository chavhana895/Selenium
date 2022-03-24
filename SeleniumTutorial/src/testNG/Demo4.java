package testNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo4
{
    @Test
    public void WebloginHomeLoan()
    {
        System.out.println("WebLoginHome");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginHomeLoan()
    {
        System.out.println("MobileLoginHome");
    }

    @Test
    public void LoginAPIHomeLoan()
    {
        System.out.println("LogiAPIcarLoanHome");
    }

    @AfterTest
    public void lastExecute()
    {
        System.out.println("I will execute at last");
    }
}
