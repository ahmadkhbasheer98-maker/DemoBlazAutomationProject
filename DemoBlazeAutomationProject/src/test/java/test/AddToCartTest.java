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

public class AddToCartTest extends BaseTest {

    @Test
    public void addProductToCart() throws Exception {

       
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

        
        String productNameOutside =
                driver.findElement(
                        By.linkText("Samsung galaxy s6"))
                        .getText();

        
        String priceOutside =
                driver.findElement(
                        By.xpath("//a[text()='Samsung galaxy s6']/../../h5"))
                        .getText();

        productPage.openSamsungProduct();

        Thread.sleep(2000);

        String priceInside =
                driver.findElement(
                        By.className("price-container"))
                        .getText();

        
        String descriptionInside =
                driver.findElement(
                        By.cssSelector("#more-information p"))
                        .getText();

       
        Assert.assertEquals(
                priceOutside,
                "$360");

        Assert.assertTrue(
                priceInside.contains("$360"));

        Assert.assertFalse(
                descriptionInside.isEmpty());

        Assert.assertTrue(
                descriptionInside.contains("Samsung Galaxy S6"));
}
}