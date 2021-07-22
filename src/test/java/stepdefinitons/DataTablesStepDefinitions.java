package stepdefinitons;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DataTablePage;
import utilities.ConfigReader;
import utilities.Driver;

public class DataTablesStepDefinitions {

    DataTablePage dataTablePage = new DataTablePage();

    @Given("user on the datatables page")
    public void user_on_the_datatables_page() {
        Driver.getDriver().get(ConfigReader.getProperty("data_table_url"));


    }

    @Given("user clicks on the new button")
    public void user_clicks_on_the_new_button() {
        dataTablePage.newButton.click();

    }

    @When("user enters the firstname")
    public void user_enters_the_firstname() {
        dataTablePage.firstNameBox.sendKeys("software development engineering");

    }

    @When("user enters the lastname")
    public void user_enters_the_lastname() {
        dataTablePage.lastNameBox.sendKeys("quality assurance");

    }

    @When("user enters the position")
    public void user_enters_the_position() {
        dataTablePage.positionBox.sendKeys("tester");

    }

    @When("user enters the office")
    public void user_enters_the_office() {
        dataTablePage.officeBox.sendKeys("world");

    }

    @When("user enters the extention")
    public void user_enters_the_extention() {
        dataTablePage.extentionBox.sendKeys("sq12");

    }

    @When("user enters the startdate")
    public void user_enters_the_startdate() {
        dataTablePage.startDateBox.sendKeys("2020-11-20");

    }

    @When("user enters the salary")
    public void user_enters_the_salary() {
        dataTablePage.salaryBox.sendKeys("5000");

    }


    @When("user clicks on the create button")
    public void user_clicks_on_the_create_button() {
        dataTablePage.createButton.click();

    }

    @When("search for the first name")
    public void search_for_the_first_name() {
        dataTablePage.searchBox.sendKeys("Bruno");

    }

    @Then("verify the name fields contains first name")
    public void verify_the_name_fields_contains_first_name() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(dataTablePage.nameField.getText().contains("Bruno"));

    }

    @When("user enters the firstname {string}")
    public void user_enters_the_firstname(String string) {
        dataTablePage.firstNameBox.sendKeys(string);

    }


    @When("user enters the lastname {string}")
    public void user_enters_the_lastname(String string) {
        dataTablePage.lastNameBox.sendKeys(string);

    }
    @When("user enters the position {string}")
    public void user_enters_the_position(String string) {
        dataTablePage.positionBox.sendKeys(string);

    }
    @When("user enters the office {string}")
    public void user_enters_the_office(String string) {
        dataTablePage.officeBox.sendKeys(string);

    }
    @When("user enters the extention {string}")
    public void user_enters_the_extention(String string) {
        dataTablePage.extentionBox.sendKeys(string);

    }
    @When("user enters the startdate {string}")
    public void user_enters_the_startdate(String string) {
        dataTablePage.startDateBox.sendKeys(string);

    }
    @When("user enters the salary {string}")
    public void user_enters_the_salary(String string) {
        dataTablePage.salaryBox.sendKeys(string);

    }
    @When("search for the first name {string}")
    public void search_for_the_first_name(String string) {
        dataTablePage.searchBox.sendKeys(string);

    }
    @Then("verify the name fields contains first name {string}")
    public void verify_the_name_fields_contains_first_name(String string) {
       Assert.assertTrue(dataTablePage.nameField.getText().contains(string));
    }


}
