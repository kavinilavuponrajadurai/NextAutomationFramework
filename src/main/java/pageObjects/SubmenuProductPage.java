package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SubmenuProductPage {
    public WebDriver driver;
    public SubmenuProductPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }
    public void verifySubmenuProductPageHeading(String submenuProductPageHeading){
        String actualHeading=driver.findElement(By.xpath("//h1[text()='"+submenuProductPageHeading+"']")).getText();
        Assert.assertEquals(submenuProductPageHeading,actualHeading);

    }
}
