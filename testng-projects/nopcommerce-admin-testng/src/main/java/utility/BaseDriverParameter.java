package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import pages.AdminPageElements;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverParameter {
    public WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters("browserType")
    public void startingOperations(String browser) {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        switch (browser.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            default:
                driver = new ChromeDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        loginTest();
    }

    void loginTest() {
        driver.get("https://admin-demo.nopcommerce.com/login?");
        AdminPageElements page = new AdminPageElements(driver);

        page.emailInput.clear();
        page.emailInput.sendKeys("admin@yourstore.com");

        page.passwordInput.clear();
        page.passwordInput.sendKeys("admin");

        page.loginButton.click();

        Assert.assertTrue(page.logoutLink.isDisplayed(), "Login Failed!");
    }

    @AfterClass
    public void endingOperations() {
        Tools.wait(5);
        driver.quit();
    }
}
