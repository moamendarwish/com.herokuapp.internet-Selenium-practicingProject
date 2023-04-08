package login;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfullLogin(){
        var loginPage = homePage.clickFormAuthenticationLink();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        var secureAreaPage = loginPage.clickLogin();
        assertTrue (secureAreaPage.getAlertMessage().contains("You logged into a secure area!"),
                "alert text is error");
    }

}
