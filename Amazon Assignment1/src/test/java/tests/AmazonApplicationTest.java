package tests;

import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class AmazonApplicationTest
{
    @Test
    public void GetHomePage()
    {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        TodaysDealPage dealPage = new TodaysDealPage(driver);
        dealPage.TodayDeal().click();
        dealPage.ThirdDeal().click();
        dealPage.ThirdItem().click();

        AddQuantity quantity = new AddQuantity(driver);
        quantity.QuantityDropDown().click();
        quantity.SelectFromDropDown().click();
        quantity.AddToCart().click();
        quantity.AddPlan().click();
        System.out.println(quantity.CheckingItemInCart().getText().equalsIgnoreCase("Added to Cart"));

        SearchBox search = new SearchBox(driver);
        search.SearchElement().sendKeys("Mobiles");
        search.searchButtonClick().click();

        AfterSearchPage lastItem = new AfterSearchPage(driver);
        //lastItem.ScrollDownPage();
        lastItem.GetLastItemDetails();

        dealPage.TodayDeal().click();
        dealPage.CheckPrime().click();
        dealPage.FirstItemPrime().click();
        dealPage.FirstItem().click();

        DeliveryDateChecker dateChecker = new DeliveryDateChecker(driver);
        System.out.println(dateChecker.DeliveryDate().getText());

        MobileSectionPage mobileSectionPage = new MobileSectionPage(driver);
        mobileSectionPage.MobilesSection().click();
        mobileSectionPage.ClickOnHomePage().click();

        CartPage cart = new CartPage(driver);
        cart.ClickOnCart().click();

        OrdersPage ordersPage = new OrdersPage(driver);
        ordersPage.ClickOnOrderPage().click();



        AmazonLoginPage loginPage = new AmazonLoginPage(driver);
//        loginPage.SignIn().click();
        loginPage.Email().sendKeys("chavhana895@gmail.com");
        loginPage.ContinueButton().click();
        loginPage.Password().sendKeys("Avi@7897");
        loginPage.ClickSignInButton().click();

        ordersPage.ClickOnDropDown().click();
        ordersPage.SelectLastYearOption().click();

        AccountsAndLists andLists = new AccountsAndLists(driver);
        andLists.ClickOnAccountsAndList().click();
        //andLists.ClickOnPaymentOptions().click();

        AddressDetailsPage address = new AddressDetailsPage(driver);
        address.YourAddressSection().click();
        address.ClickOnAddAddressIcon().click();
        address.FullName().sendKeys("Avinash");
        address.PhoneNumber().sendKeys("8805937214");
        address.PostalCode().clear();
        address.PostalCode().sendKeys("445204");
        address.AddressLine1().sendKeys("Pusad");
        address.AddressCity().clear();
        address.AddressCity().sendKeys("Pusad");
        address.SelectState();
        address.ClickAddressButton().click();

        andLists.ClickOnAccountsAndList().click();
        andLists.ClickOnPaymentOptions();


        PaymentDetailsPage cardPage = new PaymentDetailsPage(driver);
        cardPage.ClickOnCardDetailsTab().click();
        System.out.println(cardPage.CheckCardName().getText());

        //cardPage.ClickOnCardDetailsButton().click();
//        cardPage.AddCardNumber().sendKeys("123456");
//        cardPage.AddCardNumber();
//        cardPage.AddCardName().sendKeys("Avinash Chavhan");
//        cardPage.ExpiryMonthSelect();

    }
}