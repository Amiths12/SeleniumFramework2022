package TestScripts;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_RF_003 extends BaseTest{
    @Test

    public void invalidMailTest(){

        HomePage hp= new HomePage(driver);
        hp.naivigateToLoginPage();
        LoginPage lp= new LoginPage(driver);
        lp.loginPage("xyzabc123@gmail.com","12345");
        lp.loginFailureMsg();
    }
}
