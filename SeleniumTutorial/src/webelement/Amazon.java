package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Amazon
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");  //1

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        driver.manage().window().maximize();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.findElement(By.xpath("//input[@data-action-type='DISMISS']")).click();

        driver.findElement(By.xpath("//a[contains(text(),\"Today's Deals\")]")).click();

        driver.findElement(By.cssSelector("body.a-m-us.a-aui_72554-c.a-aui_accordion_a11y_role_354025-c.a-aui_killswitch_csa_logger_372963-c.a-aui_launch_2021_ally_fixes_392482-c.a-aui_pci_risk_banner_210084-c.a-aui_preload_261698-c.a-aui_rel_noreferrer_noopener_309527-c.a-aui_template_weblab_cache_333406-c.a-aui_tnr_v2_180836-c.a-meter-animate:nth-child(2) div.all-slots:nth-child(51) div.amazonlive-widget-padding:nth-child(6) div.app-module__app_2URmO8vniZo1VBFH6RZcMg.DesktopFlexBannerLayout-module__flex_2iph_nl4TjUqTTucHH2znX div.DesktopFlexBannerLayout-module__carouselContainer_5A_8Ua_RqL1xorfhpE3zx:nth-child(2) div.scroll-carousel_container__30K7i.scroll-carousel_hContainer__WKAk5 div.scroll-carousel_slider__2xxdX.scroll-carousel_scroll__2c1ai.scroll-carousel_noScrollBar__3DTMx:nth-child(1) div.scroll-carousel_slide__1ku-E.scroll-carousel_scrollItemOuter__2LsK9:nth-child(3) div.tile--t5OMY.col--1Fb-q.dMaxTile--3YlDU div.elementContainer--3FYwc.flexColumn--2aBPG > div.title--3qM6_.title--X01QH.titleAnchor--2TGNn.doubleLinesTitle--ATRHO")).click();

        // driver.findElement(By.className("a-size-medium-plus quantityUpdateText increase-quantity-icon-class")).click();
        //   driver.findElement(By.id("a-autoid-0-announce")).click();
//            driver.findElement(By.className("a-dropdown-link")).click();
                //driver.findElement(By.className("a-size-medium-plus quantityUpdateText increase-quantity-icon-class"));

          //  driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();

            //verify as expected
       // driver.findElement(By.xpath("//span[@data-csa-interaction-events='click']")).click();

        driver.findElement(By.id("add-to-cart-button")).click();

    }
}
