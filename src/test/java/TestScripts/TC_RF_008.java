package TestScripts;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_RF_008 extends BaseTest{
    @Test

    public void paswswordChangeTest() throws InterruptedException {

        HomePage hp= new HomePage(driver);
        hp.naivigateToLoginPage();
        LoginPage lp= new LoginPage(driver);
        lp.passwordChange();







    }
}
