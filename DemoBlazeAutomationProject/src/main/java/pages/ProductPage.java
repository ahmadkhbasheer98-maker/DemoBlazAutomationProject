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
    
    By categories =
    		By.id("itemc");
    
    By nextButton =
    		By.id("next2");
    
    By previousButton = 
    		By.id("prev2");
    
    By firstProduct = 
    		By.className("hrefch");
    
    By productPrice =
    		By.xpath("//h5");
    
    By productDescription =
    		By.id("article");
    

    public void openSamsungProduct() {

        driver.findElement(samsungProduct).click();
    }

    public void addToCart() {

        driver.findElement(addToCartButton).click();
    }

    public void openCart() {

        driver.findElement(cartLink).click();
    }
    
    public void clickLaptopCategory() {
    	driver.findElements(categories).get(1).click();
    }

    public void clickMonitorCategory() {
    	driver.findElements(categories).get(2).click();
    }

    public void clickNext() {
    	driver.findElement(nextButton).click();
    }

    public void clickPrevious() {
    	driver.findElement(previousButton).click();
    }

    public String getFirstProductName() {
    	return driver.findElement(firstProduct).getText();
    }

    public String getProductPrice() {
    	return driver.findElement(productPrice).getText();
    }

    public String getProductDescription() {
    	return driver.findElement(productDescription).getText();
    }
}