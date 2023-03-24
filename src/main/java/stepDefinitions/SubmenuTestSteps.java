package stepDefinitions;

import functionLibraries.CommonFunction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import pageObjects.HomePage;
import pageObjects.SubmenuProductPage;

public class SubmenuTestSteps extends CommonFunction {
    HomePage homePage=new HomePage(driver);
    SubmenuProductPage submenuProductPage=new SubmenuProductPage(driver);
    @When("I am able to move cursor on {string}")
    public void moveToMenuOptions(String menu){
        homePage.moveToMenu(menu);

    }@When("I am able to click {string}")
    public void moveToSubmenuOptions(String subMenu){
        homePage.moveToSubMenu(subMenu);
    }
    @Then("I am moved to the particular productPage with appropriate {string}")
    public void verifySubmenuPageHeading(String submenuPageHeading){
        submenuProductPage.verifySubmenuProductPageHeading(submenuPageHeading);
    }


}
