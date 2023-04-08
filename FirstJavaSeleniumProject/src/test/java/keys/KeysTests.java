package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeysTests extends BaseTests {
    @Test
    public void testKeys(){
        var keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterText("A"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResultText(),"You entered: BACK_SPACE","result message is incorrect");
    }
    @Test
    public void testDollarSign(){
        var keyPressesPage = homePage.clickKeyPressesLink();
        keyPressesPage.enterDollarSign();
    }

}
