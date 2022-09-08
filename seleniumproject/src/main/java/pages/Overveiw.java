package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Overveiw {
    @FindBy(linkText = "Open New Account") private WebElement openAccountlink;

    public void clickOpenAccountLink(){
        openAccountlink.click();
    }
}
