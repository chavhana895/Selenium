package testNG;

import org.testng.annotations.*;

public class Demo3
{
    @Parameters({"URL","APIKEY/username"})
    @Test
   // @BeforeClass
    public void befClass(String urlname, String key)
    {
        System.out.println("Before executing any method from class");
        System.out.println(urlname);
        System.out.println(key);
    }
    @AfterClass
    public void AftClass()
    {
        System.out.println("After executing any method from class");
    }
    @Test                 //(enabled = false)     if having error in that this step  skip
    public void WebloginCarLoan()
    {
        System.out.println("WebLoginCar");
    }

    @Test(groups = {"Smoke"})
    public void MobileLoginLoan()
    {
        System.out.println("MobileLoginCar");
    }

    @Test(dependsOnMethods = {"WebloginCarLoan","MobileSignOutCarLoan"})
    public void LoginAPIcarLoan()
    {
        System.out.println("LogiAPIcarLoan");
    }

    @BeforeMethod
    public void beforeEvery()
    {
        System.out.println("Before Every test method in Demo3 class");
    }
    @Test
    public void MobileSignInCarLoan()
    {
        System.out.println("Mobile sign in");
    }
    @Test(dataProvider = "getData")
   // @Test(timeOut = 4000)          //wait 4 sec
    public void MobileSignOutCarLoan(String username, String password)
    {
        System.out.println("Mobile sign Out");
        System.out.println(username);
        System.out.println(password);
    }
    @AfterSuite
    public  void AfterSuite()
    {
        System.out.println("I am the no 1 from last");
    }
    @BeforeTest
    public void prerequiste()
    {
        System.out.println("I will execute first");
    }

    @DataProvider
    public Object[][] getData()
    {
        //1st combination - username password -good credit history
        //2nd - username password -no credit history
        //3rd - fraudulent credit history
        Object[][] data=new Object[3][2];                          //multidimensional array
        data[0][0]="firstsetusername";
        data[0][1]="password";

        //2nd set
        data[1][0]="secondSetUserName";
        data[1][1]="secondPassword";

        //3rd set
        data[2][0]="thirdSetUserName";
        data[2][1]="thirdPassword";
        return data;
    }
}
