package test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProductPage;
import pages.RegisterPage;
import utils.TestData;

public class DeleteFromCartTest extends BaseTest {

    @Test
    public void deleteProductFromCart()
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
                TestData.password);

        Thread.sleep(3000);

        ProductPage productPage =
                new ProductPage(driver);

        productPage.openSamsungProduct();

        Thread.sleep(2000);

        productPage.addToCart();

        Thread.sleep(2000);

        Alert cartAlert =
                driver.switchTo().alert();

        cartAlert.accept();

        Thread.sleep(2000);

        productPage.openCart();

        Thread.sleep(3000);

        driver.findElement(
                By.linkText("Delete"))
                .click();

        Thread.sleep(3000);

        Assert.assertFalse(
                driver.getPageSource()
                        .contains("Samsung galaxy s6"));
    }
}