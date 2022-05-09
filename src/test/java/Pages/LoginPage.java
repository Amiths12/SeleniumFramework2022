package Pages;

import org.apache.commons.collections4.trie.PatriciaTrie;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import javax.naming.directory.Attribute;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "input-email")
    WebElement emailId;
    @FindBy(id = "input-password")
    WebElement inputPassword;
    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;
    @FindBy(xpath = "//*[contains(text(),' Warning: No match for E-Mail Address and/or Password.')]")
    WebElement loginFailMsg;
    @FindBy(xpath = "(//a[text()='Forgotten Password'])[1]")
    WebElement forgotPasswordButton;
    @FindBy(xpath = "//h1[text()='Forgot Your Password?']")
    WebElement forgotPasswordMsg;
    @FindBy(xpath = "//input[@value='qwerty']")
    WebElement qwertyInput;

    public void loginPage(String email, String password) {
        emailId.sendKeys(email);
        inputPassword.sendKeys(password);
        loginButton.click();
    }

    public void loginFailureMsg() {
        assertTitle(loginFailMsg, "Warning: No match for E-Mail Address and/or Password.");
    }

    public void fortgotPasswordField() {
        forgotPasswordButton.click();
    }

    public void forgetPasswordField() {
        assertTitle(forgotPasswordMsg, "Forgot Your Password?");
    }

    public void validatingUsingTab() {
        emailId.sendKeys(Keys.TAB);
        emailId.sendKeys("pavanoltraining@gmail.com\n");
        inputPassword.sendKeys(Keys.TAB);
        inputPassword.sendKeys("12345");
    }

    public void placeHolderText() {

        System.out.println(emailId.getAttribute("placeholder"));

        System.out.println(inputPassword.getAttribute("placeholder"));


    }

    public void browsingBackButton() {

        emailId.sendKeys("pavanoltraining@gmail.com");

        inputPassword.sendKeys("12345");
        loginButton.click();
        driver.navigate().back();
    }

    public void multipleInvalidLogin() throws InterruptedException {
       emailId.sendKeys("xyzabc123@gmail.com");
       inputPassword.sendKeys("xyzabc123");

        for (int i = 0; i < 6; i++) {
            //click the button
            loginButton.click();

        }
    }
    public void invisibletext(){
        inputPassword.sendKeys("qwerty");
        loginButton.click();
        Assert.assertEquals(true,qwertyInput.isDisplayed() );

    }
}
