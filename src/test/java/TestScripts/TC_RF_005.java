package TestScripts;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_RF_005 extends BaseTest{
    @Test

    public void validatingUsingTabTest()  {

        HomePage hp= new HomePage(driver);
        hp.naivigateToLoginPage();
        LoginPage lp= new LoginPage(driver);
        lp.validatingUsingTab();





    }
}
