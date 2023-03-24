package stepDefinitions;

import functionLibraries.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.ProductPage;

public class SearchSteps extends CommonFunction {
    HomePage homePage=new HomePage(driver);
    ProductPage productPage=new ProductPage(driver);
 @Given("I am on the HomePage with url {string} with page heading {string}")
    public void openHomePage(String url,String expectedPageHeading){
        driver.get(url);
        driver.findElement(By.xpath("//button[text()=\"Accept All\"]")).click();
        homePage.verifyPageHeading(expectedPageHeading);

    }
    @When("I am able to search {string}")
    public void searchProduct(String product) {
          homePage.enterProductName(product);

    }
    @When("I am able to click search icon")
    public void enterSearchIcon() {
          homePage.clickSearchIcon();
    }
    @Then("I should be redirected to the particular product page with appropriate {string}")
    public void verifyProductPageHeading(String expectedProductPageHeading) {
        productPage.findProductPageHeading();
        productPage.verifyProductPageHeading(expectedProductPageHeading);
    }


}
