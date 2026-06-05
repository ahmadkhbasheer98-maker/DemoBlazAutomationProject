package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(driver,
                Duration.ofSeconds(10));
    }

    By loginLink = By.id("login2");

    By usernameField =
            By.id("loginusername");

    By passwordField =
            By.id("loginpassword");

    By loginButton =
            By.xpath("//button[text()='Log in']");

    By welcomeUser =
            By.id("nameofuser");

    public void login(
            String username,
            String password) {

        driver.findElement(loginLink).click();

        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                usernameField));

        driver.findElement(usernameField)
                .sendKeys(username);

        driver.findElement(passwordField)
                .sendKeys(password);

        driver.findElement(loginButton)
                .click();
    }

    public String getLoggedInUser() {

        wait.until(
                ExpectedConditions
                        .visibilityOfElementLocated(
                                welcomeUser));

        return driver.findElement(welcomeUser)
                .getText();
    }
}