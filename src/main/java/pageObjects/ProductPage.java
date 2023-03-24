package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
    public static WebDriver driver;
    public ProductPage (WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    public WebElement productPageHeading = null;
    public void findProductPageHeading(){
        productPageHeading = driver.findElement(By.xpath("//*[@id=\"plp-results-title-container\"]/h1/span[1]"));
    }
    public void verifyProductPageHeading(String expectedProductPageHeading) {
        Assert.assertEquals(expectedProductPageHeading,productPageHeading.getText());
    }
    public void verifySubMenuPageHeading(String submenuPageHeading){
        driver.findElement(By.xpath("//span[text()='"+submenuPageHeading+"']"));

    }

}
