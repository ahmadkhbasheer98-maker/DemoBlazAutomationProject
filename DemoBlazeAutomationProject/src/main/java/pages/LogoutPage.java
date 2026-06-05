package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    By logoutButton = By.id("logout2");

    public void logout() {

        driver.findElement(logoutButton).click();
    }
}