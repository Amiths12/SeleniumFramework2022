package TestScripts;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_RF_0010 extends BaseTest{
    @Test

    public void validatingLoginFunctionality() throws InterruptedException {

        HomePage hp= new HomePage(driver);
        hp.naivigateToRegisterPage();
        LoginPage lp= new LoginPage(driver);
        lp.validatingLoginFunctionality();
        hp.naivigateToLoginPage();
    }

}
