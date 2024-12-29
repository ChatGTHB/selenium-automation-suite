package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {

    public static void wait(int seconds) {
        try {
            Thread.sleep(1000L * seconds); // 1 saniye * beklenen süre
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void successMessageValidation() {
        WebElement messageLabel = BaseDriver.driver.findElement(
                By.xpath("//div[@class='alert alert-success alert-dismissible']")
        );
        Assert.assertTrue(messageLabel.getText().toLowerCase().contains("success"),
                "Success message not found!");
    }

    public static int randomGenerator(int max) {
        return (int) (Math.random() * max);
    }

    public static void listContainsString(List<WebElement> list, String searchedText) {
        boolean found = list.stream()
                .anyMatch(element -> element.getText().toLowerCase().contains(searchedText.toLowerCase()));

        if (!found) {
            Assert.fail("The text '" + searchedText + "' was not found in the list!");
        }
    }
}
