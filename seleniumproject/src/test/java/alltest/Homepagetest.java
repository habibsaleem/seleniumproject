package alltest;

import Browers.browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Homepage;

import java.time.Duration;
@Listeners(value = Testlistener.class)
public class Homepagetest extends Basetest{




    @Test
    public void test1(){
        starthomepage().registeruser();

    }
}
