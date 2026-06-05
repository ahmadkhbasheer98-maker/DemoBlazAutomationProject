package test;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.RegisterPage;
import utils.TestData;

public class RegistrationLoginWorkflowTest extends BaseTest {

    @Test
    public void registrationAndLoginWorkflow()
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

        Thread.sleep(2000);

        LoginPage loginPage =
                new LoginPage(driver);

        loginPage.login(
                TestData.username,
                TestData.password);

        Thread.sleep(3000);

        String actualUser =
                loginPage.getLoggedInUser();

        Assert.assertTrue(
                actualUser.contains(
                        TestData.username));
    }
}