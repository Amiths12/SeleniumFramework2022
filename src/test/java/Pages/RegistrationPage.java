package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage{
    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "input-firstname")
    WebElement firstNameTextField;
    @FindBy(id = "input-lastname")
    WebElement lastNameTextField;
    @FindBy(id = "input-email")
    WebElement emailTextField;
    @FindBy(id = "input-telephone")
    WebElement telephoneTextField;
    @FindBy(id = "input-password")
    WebElement passwordTextField;
    @FindBy(id = "input-confirm")
    WebElement confirmpasswordTextField;
    @FindBy(xpath = "//input[@name='agree']")
    WebElement agreeCheckbox;
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;
    @FindBy(xpath = "//h1[text()='Your Account Has Been Created!']")
    WebElement accountCreatedSuccessmsg;

    public void enterMandatoryFields(String name,String lastname,String email,String telephone,String password,String confirmpassword){
        firstNameTextField.sendKeys(name);
        lastNameTextField.sendKeys(lastname);
        emailTextField.sendKeys(email);
        telephoneTextField.sendKeys(telephone);
        passwordTextField.sendKeys(password);
        confirmpasswordTextField.sendKeys(confirmpassword);
        agreeCheckbox.click();
        continueButton.click();

    }
    public void validateAccountCreation(){
        assertTitle(accountCreatedSuccessmsg,"Your Account Has Been Created!");
    }









}
