package TestScripts;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class TC_RF_006 extends BaseTest{
    @Test

    public void placeHolderTextTest(){

        HomePage hp= new HomePage(driver);
        hp.naivigateToLoginPage();
        LoginPage lp= new LoginPage(driver);
        lp.browsingBackButton();





    }
    @Test
    public void multipleInvalidLogin() throws InterruptedException {

        HomePage hp= new HomePage(driver);
        hp.naivigateToLoginPage();
        LoginPage lp= new LoginPage(driver);
        lp.multipleInvalidLogin();
    }
}
