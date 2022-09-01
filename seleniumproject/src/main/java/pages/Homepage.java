package pages;

import Browers.browser;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static Browers.browser.getPropertyValue;

public class Homepage {

    @FindBy (xpath ="//input[@name='username']") private WebElement userName;
    @FindBy (xpath ="//input[@name='password']") private WebElement password;
    @FindBy(xpath = "//button[@type='submit']")  private WebElement logIn;

    public void login(){
        userName.sendKeys(getPropertyValue("userName"));
        password.sendKeys(getPropertyValue("password"));
        logIn.click();

    }
}
