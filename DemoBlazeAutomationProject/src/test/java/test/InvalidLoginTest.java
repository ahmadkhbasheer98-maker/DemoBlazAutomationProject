package test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.RegisterPage;
import utils.TestData;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void loginWithWrongPassword()
            throws Exception {

        RegisterPage registerPage =
                new RegisterPage(driver);

        registerPage.registerUser(
                TestData.username,
                TestData.password);

        Thread.sleep(2000);

        Alert registerAlert =
                driver.switchTo().alert();

        registerAlert.accept();

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                TestData.username,
                "WrongPassword");

        Thread.sleep(2000);

        Alert loginAlert =
                driver.switchTo().alert();

        Assert.assertTrue(
                loginAlert.getText()
                        .contains("Wrong password"));

        loginAlert.accept();
    }
}