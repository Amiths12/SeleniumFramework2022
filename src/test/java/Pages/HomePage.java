package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountMenu;


    @FindBy(xpath = "//a[text()='Login']")
    WebElement loginButton;


    @FindBy(xpath = "//a[text()='Register']")
    WebElement registerButton;

    public void naivigateToRegisterPage(){
        myAccountMenu.click();
        registerButton.click();
    }
    public void naivigateToLoginPage(){
        myAccountMenu.click();
        loginButton.click();
    }


}
