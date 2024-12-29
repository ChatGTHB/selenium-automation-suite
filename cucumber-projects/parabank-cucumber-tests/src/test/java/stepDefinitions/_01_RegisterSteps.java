package stepDefinitions;

import io.cucumber.java.en.*;
import pages.Locaters;
import utilities.GWD;

public class _01_RegisterSteps {

    Locaters loc = new Locaters();
    @Given("Navigate to the ParaBank")
    public void navigateToTheParaBank() {
        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");
        GWD.getDriver().manage().window().maximize();
    }

//    String randomName="Kerem"+(int)(Math.random()*1000);
//    String randomUsername="KeremY"+(int)(Math.random()*1000);
    @When("Create an account")
    public void createAnAccount() {
        loc.clickFunction(loc.registerLink);
        loc.sendKeysFunction(loc.firstName, "Kerem");
        loc.sendKeysFunction(loc.lastName, "Yigit");
        loc.sendKeysFunction(loc.address, "Dream street ");
        loc.sendKeysFunction(loc.city, "Oslo");
        loc.sendKeysFunction(loc.state, "Oslo");
        loc.sendKeysFunction(loc.zipCode, "12345");
        loc.sendKeysFunction(loc.phone, "98765432100");
        loc.sendKeysFunction(loc.SSN, "5634");
        loc.sendKeysFunction(loc.username, "Kerem");
        loc.sendKeysFunction(loc.password, "password");
        loc.sendKeysFunction(loc.confirm, "password");

        loc.clickFunction(loc.registerButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        loc.verifyContainsTextFunction(loc.successMessage,"success");
    }
}
