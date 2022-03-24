import base.TestBase;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends TestBase
{
    LoginPage loginPage;
    HomePage homePage;


    @Test
    public LoginPageTest()
    {
        super();
    }

    @Test
    @BeforeMethod
    public void setUp()
    {
        initialization();
        LoginPage loginPage = new LoginPage();
    }

    @Test
    public void loginPageTitleTest()
    {
      String title =  loginPage.validateLoginPageTitle();
     Assert.assertEquals(title,"Free CRM software for customer relationship management, sales, marketing campaigns and support");
    }

    @Test
    public void crmLogoImageTest()
    {
        boolean flag = loginPage.validateCRMImage();
       Assert.assertTrue(flag);
    }
    @Test
    public void loginTest()
    {
       homePage= loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}
