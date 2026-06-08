package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.ProductPage;

public class CategoryTest extends BaseTest {

	@Test
	public void verifyCategoryChangesProducts() throws Exception {

		ProductPage productPage = new ProductPage(driver);

		String phoneProduct =
				productPage.getFirstProductName();

		productPage.clickLaptopCategory();

		Thread.sleep(3000);

		String laptopProduct =
				productPage.getFirstProductName();

		Assert.assertNotEquals(
				phoneProduct,
				laptopProduct);

	}
}