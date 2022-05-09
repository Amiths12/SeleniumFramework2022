package TestScripts;

import Pages.BasePage;
import Pages.HomePage;
import Pages.RegistrationPage;
import org.testng.annotations.Test;

public class TC_RF_001 extends BaseTest{

    @Test
            public void TC_RF_001(){
        String fn= BasePage.firstName(),ln= BasePage.lastName(),email= BasePage.emailId(),telephone= BasePage.telephone(),pw=BasePage.password();
        HomePage hp = new HomePage(driver);

        hp.naivigateToRegisterPage();
        RegistrationPage rap= new RegistrationPage(driver);
        rap.enterMandatoryFields(fn,
                ln,email,telephone,pw,pw);
        rap.validateAccountCreation();


    }


}
