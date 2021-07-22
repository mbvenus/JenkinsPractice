package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonDropDownPage {

  public  AmazonDropDownPage(){
      PageFactory.initElements(Driver.getDriver(),this);
  }

  //@FindBy(xpath = "//span[@class='g-menu-parent-indicator']")
  @FindBy(linkText = "Testing")
  public WebElement guruDropDown;

  @FindBy(xpath = "//select[@title='Search in']")
    public WebElement searchBoxDropDown;
  @FindBy(xpath = "//select[@style='display: block; top: 2.5px;']")
    public WebElement searchBoxDropDown1;
  @FindBy(xpath = "//select[@tabindex='0' or  @tittle='Search in']")
    public WebElement searchBoxDropDown2;
  @FindBy(xpath = "//select[starts-with(@class,'nav-search-dropdown')]")
    public WebElement searchBoxDropDown3;




}
