package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected AppiumDriver driver;

    // Constructor to initialize the AppiumDriver
    public BasePage(AppiumDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  // Initializes PageFactory elements
    }

    // You can now use AppiumDriver methods like findElement
    public WebElement findElementById(String id) {
        return driver.findElementById(id);
    }
}



