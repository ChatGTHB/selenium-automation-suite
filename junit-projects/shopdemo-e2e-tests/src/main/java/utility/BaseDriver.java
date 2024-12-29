package utility;

import net.datafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    protected static WebDriver driver;
    protected WebDriverWait wait;
    protected static final Faker faker = new Faker();

    // Initializes WebDriver and WebDriverWait for each test instance
    public BaseDriver() {
        startDriver();
    }

    // Starts a new WebDriver if not already initialized
    private void startDriver() {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);  // Suppress non-critical logs

        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        }
    }

    // Closes the WebDriver session if active
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    // Waits and then closes the WebDriver
    public void waitAndClose() {
        MyFunction.wait(5);
        quitDriver();
    }

    // Returns Faker instance for random test data
    public static Faker getFaker() {
        return faker;
    }
}
