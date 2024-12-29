import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class IteraTestSuite extends BaseDriver {

    @Test
    public void testSignUp() {
        driver.get("https://itera-qa.azurewebsites.net/");

        String emailRandom = "testing" + (int) (Math.random() * 10000) + "@testing.com";
        String usernameRandom = "tester" + (int) (Math.random() * 10000);

        WebElement signUp = driver.findElement(By.linkText("Sign Up"));
        signUp.click();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Kerem");

        WebElement surname = driver.findElement(By.name("Surname"));
        surname.sendKeys("Yigit");

        WebElement eMail = driver.findElement(By.cssSelector("input[class='form-control text-box single-line'][id='E_post']"));
        eMail.sendKeys(emailRandom);

        WebElement phoneNumber = driver.findElement(By.xpath("//label[text()='Mobile'] //following::input[1]"));
        phoneNumber.sendKeys("123456");

        WebElement userName = driver.findElement(By.cssSelector("input[data-val-required='Please enter username']"));
        userName.sendKeys(usernameRandom);

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("123456");

        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
        confirmPassword.sendKeys("123456");

        WebElement submit = driver.findElement(By.cssSelector("input[value='Submit']"));
        submit.click();

        WebElement confirmation = driver.findElement(By.xpath("//label[text()='Registration Successful']"));
        Assertions.assertEquals("Registration Successful", confirmation.getText(), "Registration unsuccessful");
    }

    @Test
    public void testLogin() {
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@data-val-required='Please enter username']"));
        username.sendKeys("k.yigit");

        WebElement password = driver.findElement(By.xpath("//input[@data-val-required='Please enter password']"));
        password.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.xpath("//input[@name='login']"));
        loginButton.click();

        WebElement confirmation = driver.findElement(By.xpath("//h3[text()='Welcome k.yigit']"));
        String confirmationStr = "Welcome k.yigit";

        Assertions.assertEquals(confirmationStr, confirmation.getText(), "Login unsuccessful");

        WebElement logoutButton = driver.findElement(By.xpath("//a[text()='Log out']"));
        logoutButton.click();
    }

    @Test
    public void testCreateCustomer() {
        driver.get("https://itera-qa.azurewebsites.net/");

        WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
        login.click();

        WebElement username = driver.findElement(By.xpath("//input[@data-val-required='Please enter username']"));
        username.sendKeys("k.yigit");

        WebElement password = driver.findElement(By.xpath("//input[@data-val-required='Please enter password']"));
        password.sendKeys("123456");

        WebElement loginButton = driver.findElement(By.xpath("//input[@name='login']"));
        loginButton.click();

        WebElement createButton = driver.findElement(By.xpath("//a[text()='Create New']"));
        createButton.click();

        WebElement name = driver.findElement(By.xpath("//input[@id='Name']"));
        name.sendKeys("Said");

        WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
        company.sendKeys("Company");

        WebElement address = driver.findElement(By.xpath("//input[@id='Address']"));
        address.sendKeys("Norway");

        WebElement city = driver.findElement(By.xpath("//input[@id='City']"));
        city.sendKeys("Oslo");

        WebElement phone = driver.findElement(By.xpath("//input[@id='Phone']"));
        phone.sendKeys("123456");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.sendKeys("123456@kmail.com");

        WebElement createButton2 = driver.findElement(By.xpath("//input[@value='Create']"));
        createButton2.click();

        waitAndClose();
    }
}
