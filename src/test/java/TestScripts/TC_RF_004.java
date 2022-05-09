package TestScripts;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_RF_004 extends BaseTest{
    @Test

    public void forgotPasswordTest(){

        HomePage hp= new HomePage(driver);
        hp.naivigateToLoginPage();
        LoginPage lp= new LoginPage(driver);
        lp.fortgotPasswordField();
        lp.forgetPasswordField();

    }
}
