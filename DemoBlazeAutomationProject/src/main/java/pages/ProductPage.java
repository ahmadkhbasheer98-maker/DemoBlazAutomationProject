package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By samsungProduct =
            By.linkText("Samsung galaxy s6");

    By addToCartButton =
            By.xpath("//a[text()='Add to cart']");

    By cartLink =
            By.xpath("//a[text()='Cart']");

    public void openSamsungProduct() {

        driver.findElement(samsungProduct).click();
    }

    public void addToCart() {

        driver.findElement(addToCartButton).click();
    }

    public void openCart() {

        driver.findElement(cartLink).click();
    }
}