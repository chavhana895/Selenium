package testNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5
{
    @Parameters({"URL"})
    @Test
    public void Loan(String s)
    {
        System.out.println("Loan interest will be 12.5%");
        System.out.println(s);
    }

    @BeforeSuite
    public void BeforeSuite()
    {
        System.out.println("I am No1");
    }
}
