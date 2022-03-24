import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.*;

import java.io.IOException;
import java.time.Duration;

public class TestApp
{

    @Test
    public void firstTest() throws IOException {


//        System.setProperty("webdriver.chrome.driver","C:\\Users\\acer\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
//        WebDriver driver=new ChromeDriver();
//        driver.get("https://www.amazon.in/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
////        TodaysDealPage todaysDeal1 =new TodaysDealPage(driver);
////        todaysDeal1.todayDeal().click();
////        todaysDeal1.thirdDeal().click();
//
//        AddMinQuantityItemPages quantiy=new AddMinQuantityItemPages(driver);
//        quantiy.searchBox().sendKeys("maggi");
//        quantiy.search().click();
//        quantiy.item().click();
//        quantiy.ScrollDownPage();
//        quantiy.addToCart().click();
//        System.out.println(quantiy.verifyAdded().getText().equalsIgnoreCase("Added to cart"));
//
//        SearchMobilesInSearchPage mobiles=new SearchMobilesInSearchPage(driver);
//        mobiles.searchBox().sendKeys("mobiles");
//        mobiles.search().click();
//        mobiles.ScrollDownPage();
//        mobiles.getLastDisplayedItem().click();
//
//        MobileSearchPage leftNa=new MobileSearchPage(driver);
//        leftNa.selectMobiles().click();
//        leftNa.clickOnHomeButton().click();
//
//        LogInPage signIn=new LogInPage();
//        signIn.clickOnSignIn().click();
//        signIn.enterLogInId().sendKeys("chavhana895@gmail.com");
//        signIn.clickOnContinue().click();
//        signIn.enterPassword().sendKeys("Avi@7897");
//        signIn.clickOnSubmit().click();
//
//        PaymentDetailsSearch payOptions=new PaymentDetailsSearch(driver);
//        payOptions.clickOnAccount().click();
//        payOptions.clickOnPaymentOption().click();
//        System.out.println(payOptions.textVerifying().getText().equalsIgnoreCase("Your Payment options"));
//
//        AddressPage address=new AddressPage(driver);
//        address.clickOnAccount().click();
//        address.clickOnAddress().click();
//        address.clickOnAddAddress().click();
//        address.enterFullName().sendKeys("Avinash Chavhan");
//        address.enterMobileNumber().sendKeys("8805937214");
//        address.enterPinCode().sendKeys("445204");
//        address.enterFlatHouseNo().sendKeys("21,chavhan Niwas");
//        address.enterAreaName().sendKeys("Professor, Colony, Pusad");
//        address.enterLandmark().sendKeys("Near Hanuman Temple");
//        //  address.enterCity().sendKeys("Pusad");
//        address.selectStateDropDown().click();
//        address.ScrollDownPage();
//        address.clickONMaharashtra().click();
//        address.clickONAddressType().click();
//        address.clickOnHomeType().click();
//        address.clickOnAddress().click();
    }
}