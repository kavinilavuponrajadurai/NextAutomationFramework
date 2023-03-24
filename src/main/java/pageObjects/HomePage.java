package pageObjects;

import functionLibraries.CommonFunction;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.layertree.model.StickyPositionConstraint;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonFunction {
    public static WebDriver driver;
    public HomePage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//input[@id=\"header-big-screen-search-box\"]")
    public WebElement searchBar;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement searchIcon;
    @FindBy(className ="header-1sw7q4x")
    public WebElement pageHeading;
    @FindBy(xpath = "//span[@data-testid=\"header-myaccount-username\"]")
    public WebElement myAccountBtn;
    @FindBy(xpath = "//div[@data-testid=\"header-adaptive-checkout\"]")
    public WebElement checkOutBtn;
    @FindBy(xpath = "//div[@data-testid=\"header-shopping-bag\"]")
    public WebElement basketBtn;
    @FindBy(xpath = "//a[@title=\"Store Locator\"]")
    public WebElement storeLocator;

    public void enterProductName(String product){
        searchBar.sendKeys(product);
    }
    public void clickSearchIcon(){
        searchIcon.click();

    }
    public void verifyPageHeading(String expectedPageHeading){
        Assert.assertEquals(expectedPageHeading,driver.getTitle());
    }
    public void moveToMenu(String Menu){
        waitForTime(2);
        mouseOver(driver.findElement(By.xpath("//div[text()='"+Menu+"']")));
        waitForTime(3);
    }
    public void moveToSubMenu(String SubMenu){
      driver.findElement(By.xpath("//span[text()='"+SubMenu+"']")).click();



    }





}
