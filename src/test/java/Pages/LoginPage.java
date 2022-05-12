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
    WebDriver driver;
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
    @FindBy(xpath = "//a[text()='Change your password']")
    WebElement passwordChangeField;
    @FindBy(xpath = "//input[@name='password']")
    WebElement newPasswordTextField;
    @FindBy(xpath = "//input[@name='confirm']")
    WebElement confirmNewPasswordTextField;
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement confirmButton;
    @FindBy(xpath = "//span[text()='My Account']")
    WebElement myAccountMenu;
    @FindBy(xpath = "(//a[text()='Logout'])[1]")
    WebElement logoutButton;
    @FindBy(xpath = "(//a[text()='Login'])[1]")
    WebElement reloginButton;
    @FindBy(xpath = "//a[text()='Continue']")
    WebElement continueButton;
    @FindBy(xpath = "//a[text()='Account']")
    WebElement accountBreadcrump;
    @FindBy(xpath = "//a[text()='Desktops']")
    WebElement desktopDropDown;
    @FindBy(xpath = "//a[text()='Software']")
    WebElement softwareDropDown;
    @FindBy(xpath = "//a[text()='About Us']")
    WebElement aboutUsFooterMenu;





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
    public void passwordChange() throws InterruptedException {
        emailId.sendKeys("pavanoltraining@gmail.com");
        inputPassword.sendKeys("12345");
        loginButton.click();
        passwordChangeField.click();
        newPasswordTextField.sendKeys("12345");
        confirmNewPasswordTextField.sendKeys("12345");
        confirmButton.click();
        myAccountMenu.click();
        logoutButton.click();
        myAccountMenu.click();
        Thread.sleep(3000);
        reloginButton.click();
        emailId.sendKeys("pavanoltraining@gmail.com");
        inputPassword.sendKeys("12345");
        loginButton.click();
        driver.quit();

    }
//    public void loginBack(){
//        driver.get("https://demo.opencart.com/index.php?route=account/account");
//    }
    public void validatingFunctionality(){
        continueButton.click();
        waitForElement(3000);
        accountBreadcrump.click();
        desktopDropDown.click();
        softwareDropDown.click();
        aboutUsFooterMenu.click();


//        driver.navigate().back();

    }
}
