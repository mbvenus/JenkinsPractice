package stepdefinitons;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.collections.transformation.SortedList;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonDropDownPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.*;

public class AmazonDropDownStepDefinition {



    AmazonDropDownPage page=new AmazonDropDownPage();
    //Select select =new Select(page.searchBoxDropDown);

    List<WebElement> allOptions = new ArrayList<>();

    @Given("user navigate to amazon page")
    public void userNavigateToAmazonPage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));

    }

    @When("Find the element of the dropdown element")
    public void findTheElementOfTheDropdownElement() {
       page.searchBoxDropDown.click();
      //  page.guruDropDown.click();

    }

    @Then("print the first selected option and assert if it equals {string}")
    public void printTheFirstSelectedOptionAndAssertIfItEquals(String option) {
        Select select =new Select(page.searchBoxDropDown);
       String actualResultfirstOption= select.getFirstSelectedOption().getText();
        System.out.println("actualResultfirstOption = " + actualResultfirstOption);
        Assert.assertEquals(option,actualResultfirstOption);
       
    }

    @And("select the {int}th option by index and assert if the name is {string}")
    public void selectTheThOptionByIndexAndAssertIfTheNameIs(int indx, String indxExpectedOption) {
        Select select =new Select(page.searchBoxDropDown);
        allOptions =select.getOptions();
       String actualIndxOption= select.getOptions().get(indx-1).getText();
        System.out.println("actualIndxOption = " + actualIndxOption);
      String indxactualOption=  allOptions.get(indx-1).getText();
        System.out.println("indxactualOption = " + indxactualOption);
      Assert.assertEquals(indxExpectedOption,indxactualOption);




    }

    @And("after you select you need to use get first selected option method")
    public void afterYouSelectYouNeedToUseGetFirstSelectedOptionMethod() {
        Select select =new Select(page.searchBoxDropDown);
     String firstSelectedOption=   select.getFirstSelectedOption().getText();
        System.out.println("firstSelectedOption = " + firstSelectedOption);
        
    }

    @Then("print all of the dropdown options")
    public void printAllOfTheDropdownOptions() {
//        for (WebElement option:allOptions) {
//            System.out.print( option.getText()+" ; ");
//        }
        for (int i = 0; i <allOptions.size() ; i++) {
            System.out.print(   allOptions.get(i).getText()+";");
        }

    }

    @And("Print the total number of options in the dropdown")
    public void printTheTotalNumberOfOptionsInTheDropdown() {
        System.out.println("==========");
        System.out.println(" total number of options=" + allOptions.size());
    }

    @And("Check if appliances is drop down option .print true if {string} is an option.print false otherwise")
    public void checkIfAppliancesIsDropDownOptionPrintTrueIfIsAnOptionPrintFalseOtherwise(String optionCheck) {
     //   Select select =new Select(page.searchBoxDropDown);

       if(allOptions.contains(optionCheck)){
           System.out.println("this is inside dropdown options");
       }else {
           System.out.println("this is NOT dropdown options");
       }
    }

    @And("Check if dropdown is in Alphabetical order")
    public void checkIfDropdownIsInAlphabeticalOrder() {
  List<String> originalList = new ArrayList<>();
        for (WebElement each:allOptions) {
          originalList.add(each.getText());
        }
        System.out.print("originalList = " + originalList);
     List<String> orderList =originalList;
        System.out.println("======================");
        Collections.sort(orderList);
        System.out.print("orderList = " + orderList);

       // Assert.assertTrue("This is natural order ",originalList.equals(orderList));
        System.out.println("=================");
        if(originalList.equals(orderList)){
            System.out.println("this list is natural order perfectly");
        }else {
            System.out.println("something is wrong this is not order");
        }


        Driver.closeDriver();

    }
}
