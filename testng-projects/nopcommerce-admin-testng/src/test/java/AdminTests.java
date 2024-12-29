import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPageElements;
import utility.BaseDriverParameter;

public class AdminTests extends BaseDriverParameter {

    String randomMail;

    @Test(priority = 1)
    public void loginTest() {
        AdminPageElements page = new AdminPageElements(driver);
        driver.get("https://admin-demo.nopcommerce.com/login?");

        page.emailInput.clear();
        page.emailInput.sendKeys("admin@yourstore.com");

        page.passwordInput.clear();
        page.passwordInput.sendKeys("admin");

        page.loginButton.click();

        Assert.assertTrue(page.logoutLink.isDisplayed(), "Login failed!");
    }

    @Test(priority = 2, dependsOnMethods = "loginTest")
    public void checkLeftNavMenu() {
        AdminPageElements page = new AdminPageElements(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        for (int i = 1; i < page.navMenu.size(); i++) {
            wait.until(ExpectedConditions.visibilityOfAllElements(page.navMenu));
            js.executeScript("arguments[0].scrollIntoView(true);", page.navMenu.get(i));
            page.navMenu.get(i).click();
            Assert.assertTrue(page.navAltMenu.get(i).isDisplayed(), "Sub-menu not visible!");
        }
    }

    @Test(priority = 3, dependsOnMethods = "loginTest")
    public void createCustomer() {
        AdminPageElements page = new AdminPageElements(driver);
        Actions actions = new Actions(driver);
        randomMail = "testuser" + (int) (Math.random() * 10000) + "@email.com";

        page.customersMenu.click();
        page.addNewButton.click();

        actions.click(page.searchEmail)
                .sendKeys(randomMail)
                .sendKeys(Keys.TAB)
                .sendKeys("password")
                .sendKeys(Keys.TAB)
                .sendKeys("First name")
                .sendKeys(Keys.TAB)
                .sendKeys("Last name")
                .perform();

        page.saveButton.click();
        Assert.assertTrue(page.successMessage.isDisplayed(), "Customer creation failed!");
    }
}
