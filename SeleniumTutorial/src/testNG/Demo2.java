package testNG;

import org.testng.annotations.Test;

public class Demo2
{
    @Test(groups = {"Smoke"})
    public void test1()
    {
        System.out.println("Test1 is passed...");
    }
    @Test
    public void test2()
    {
        System.out.println("Test2 is passed...");
    }
}