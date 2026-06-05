package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

    WebDriver driver;
    WebDriverWait wait;

    public RegisterPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver,
                Duration.ofSeconds(10));
    }

    By signUpLink = By.id("signin2");

    By usernameField =
            By.id("sign-username");

    By passwordField =
            By.id("sign-password");

    By signUpButton =
            By.xpath("//button[text()='Sign up']");

    public void registerUser(
            String username,
            String password) {

        driver.findElement(signUpLink).click();

        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                usernameField));

        driver.findElement(usernameField)
                .sendKeys(username);

        driver.findElement(passwordField)
                .sendKeys(password);

        driver.findElement(signUpButton)
                .click();
    }
}