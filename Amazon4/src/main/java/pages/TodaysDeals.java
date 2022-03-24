package pages;

import base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TodaysDeals extends Base
{
 @FindBy(xpath="//a[contains(text(),\"Today's Deals\")]")
 public
 WebElement deal;


}
