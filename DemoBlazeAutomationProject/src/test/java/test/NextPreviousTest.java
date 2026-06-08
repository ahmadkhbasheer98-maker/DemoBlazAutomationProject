package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductPage;

public class NextPreviousTest extends BaseTest {

	@Test
	public void verifyNextButton() throws Exception {

		ProductPage productPage = new ProductPage(driver);

		String firstProduct =
				productPage.getFirstProductName();

		productPage.clickNext();

		Thread.sleep(3000);

		String secondProduct =
				productPage.getFirstProductName();

		Assert.assertNotEquals(
				firstProduct,
				secondProduct);

	}
	
	@Test
	public void verifyPreviousButton() throws Exception {

		ProductPage productPage = new ProductPage(driver);

		productPage.clickNext();

		Thread.sleep(3000);

		String page2Product =
				productPage.getFirstProductName();

		productPage.clickPrevious();

		Thread.sleep(3000);

		String page1Product =
				productPage.getFirstProductName();

		Assert.assertNotEquals(
				page2Product,
				page1Product);

	}
}