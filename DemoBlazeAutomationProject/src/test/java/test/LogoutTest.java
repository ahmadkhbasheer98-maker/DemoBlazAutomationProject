package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.LogoutPage;
import pages.RegisterPage;
import utils.TestData;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutAfterLogin()
            throws Exception {

        RegisterPage registerPage =
                new RegisterPage(driver);

        registerPage.registerUser(
                TestData.username,
                TestData.password);

        Thread.sleep(2000);

        Alert alert =
                driver.switchTo().alert();

        alert.accept();

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                TestData.username,
                TestData.password);

        Thread.sleep(3000);

        LogoutPage logoutPage =
                new LogoutPage(driver);

        logoutPage.logout();

        Thread.sleep(2000);

        Assert.assertTrue(
                driver.findElement(
                        By.id("login2"))
                        .isDisplayed());
    }
}