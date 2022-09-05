package alltest;

import Browers.browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Homepagetest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        browser.setDriver();
        driver = browser.getDriver();
        driver.navigate().to(browser.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test
    public void test2(){

        System.out.println("this is a test");
        System.out.println("adding a new line");
        System.out.println("Making another");
    }
}
