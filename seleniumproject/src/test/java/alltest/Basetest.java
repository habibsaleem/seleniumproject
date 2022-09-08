package alltest;

import Browers.browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import pages.Homepage;

import java.time.Duration;

public class Basetest {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        browser.setDriver();
        driver = browser.getDriver();
        driver.navigate().to(browser.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    public Homepage starthomepage(){
        return PageFactory.initElements(driver, Homepage.class);
    }

}
