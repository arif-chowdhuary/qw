package stepDefinations;

import amazonImplementation.Product;
import amazonImplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SearchSteps {

	Product product;
	Search search;

	@Given("I have a search field on Amazon Page")
	public void i_have_a_search_field_on_amazon_page() {
		System.out.println("Step 1: I am on search page");
	}
	@When("I search for a product with name {string} and Price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
		System.out.println("Step 2: Serach the product with name " + productName + " Price: " + price);
		product = new Product(productName, price);

	}

//	@When("^I search for a product with name \"([^\"+])\" and Price (\\d+)$")
//	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
//		System.out.println("Step 2: Serach the product with name " + productName + " Price: " + price);
//		product = new Product(productName, price);
//
//	}
	
	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		System.out.println("Step 3: Product " + productName + " is displayed");
		search = new Search();
		String name = search.displayProduct(product);
		System.out.println("Search product is : " + name);
		Assert.assertEquals(product.getProductName(), name);
	}

//	@Then("^Product with name \"([^\"+])\" should be displayed$")
//	public void product_with_name_should_be_displayed(String productName) {
//		System.out.println("Step 3: Product " + productName + " is displayed");
//		search = new Search();
//		String name = search.displayProduct(product);
//		System.out.println("Search product is : " + name);
//		Assert.assertEquals(product.getProductName(), name);
//	}

	@Then("Your order id is {int} and username is {string}")
	public void your_order_id_is_and_username_is(Integer int1, String string) {
		
	}
}
