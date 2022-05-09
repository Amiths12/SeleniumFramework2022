package TestScripts;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_RF_002 extends BaseTest{
    @Test

    public void invalidLogin(){

        HomePage hp= new HomePage(driver);
        hp.naivigateToLoginPage();
        LoginPage lp= new LoginPage(driver);
        lp.loginPage("xyzabc123@gmail.com","xyzabc123");
        lp.loginFailureMsg();
    }
}
