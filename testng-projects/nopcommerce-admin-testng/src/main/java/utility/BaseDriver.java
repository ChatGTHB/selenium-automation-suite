package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.AdminPageElements;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    public void startingOperations() {

        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
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
