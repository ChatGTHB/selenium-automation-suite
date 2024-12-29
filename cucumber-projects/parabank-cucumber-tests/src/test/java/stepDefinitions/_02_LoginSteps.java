package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Locaters;

public class _02_LoginSteps {
    Locaters loc = new Locaters();

    @When("Enter your valid {string} and {string}")
    public void enterYourValidAnd(String username, String password) {
        loc.sendKeysFunction(loc.loginUsername, username);
        loc.sendKeysFunction(loc.loginPassword, password);
    }

    @And("Click login button")
    public void clickLoginButton() {
        loc.clickFunction(loc.loginButton);
    }

    @Then("User should successfully login to the system")
    public void userShouldSuccessfullyLoginToTheSystem() {
        loc.verifyContainsTextFunction(loc.loginSuccessMessage, "Welcome");
    }

    @And("User should logout from the system")
    public void userShouldLogoutFromTheSystem() {
        loc.clickFunction(loc.logoutLink);
    }

    @When("Enter valid {string} and invalid {string}")
    public void enterValidAndInvalid(String username, String password) {
        loc.sendKeysFunction(loc.loginUsername, username);
        loc.sendKeysFunction(loc.loginPassword, password);
    }

    @Then("Unsuccessfull attempt should be displayed")
    public void unsuccessfullAttemptShouldBeDisplayed() {
        loc.verifyContainsTextFunction(loc.loginUnsuccessMessage, "could not be verified");
    }

    @When("Enter invalid {string} and valid {string}")
    public void enterInvalidAndValid(String username, String password) {
        loc.sendKeysFunction(loc.loginUsername, username);
        loc.sendKeysFunction(loc.loginPassword, password);
    }
}
