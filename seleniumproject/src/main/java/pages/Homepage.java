package pages;

import Browers.browser;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

import static Browers.browser.getPropertyValue;

public class Homepage {

     WebDriver driver = browser.getDriver();
   @FindBy(linkText = "Register") private WebElement registerelement;
    @FindBy(id = "customer.firstName") private WebElement firstNmae;
    @FindBy(id = "customer.lastName") private WebElement lastName;
    @FindBy(id = "customer.address.street") private WebElement address;
    @FindBy(id = "customer.address.city") private WebElement city;
    @FindBy(id = "customer.address.state") private WebElement state;
    @FindBy(id = "customer.address.zipCode") private WebElement zipCode;
    @FindBy(id = "customer.phoneNumber") private WebElement phone;
    @FindBy(id = "customer.ssn") private WebElement ssn;
    @FindBy(id = "customer.username") private WebElement userName;
    @FindBy(id = "customer.password") private WebElement password;
     @FindBy(id = "repeatedPassword") private WebElement confirm;
    @FindBy(css = "input[value='Register']") private WebElement registerButton;


    public Overveiw registeruser() {
     String info = getPropertyValue("info");
     registerelement.click();
     firstNmae.sendKeys(info);
     lastName.sendKeys(info);
     address.sendKeys(info);
     city.sendKeys(info);
     state.sendKeys(info);
     zipCode.sendKeys(info);
     phone.sendKeys(info);
     ssn.sendKeys(info);
     userName.sendKeys(info);
     password.sendKeys(info);
     confirm.sendKeys(info);
     registerButton.click();
    return PageFactory.initElements(browser.getDriver(),Overveiw.class);


}
}
