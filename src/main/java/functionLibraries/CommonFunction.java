package functionLibraries;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class CommonFunction {
    public  static WebDriver driver;
    public  void  openBrowser(){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
    }
    public void mouseOver(WebElement element){
        Actions action=new Actions(driver);
        action.moveToElement(element).build().perform();
    }
    public void waitForTime(int waitTime){
        driver.manage().timeouts().implicitlyWait(waitTime, TimeUnit.SECONDS);


    }
    public void closeBrowser(){
        driver.quit();
    }
}
