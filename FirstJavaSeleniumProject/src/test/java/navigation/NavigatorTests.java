package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigatorTests extends BaseTests {
    @Test
    public void testWindowNavigator(){
        homePage.clickDynamicLoadingLink().clickExample1();
        getWindowManger().goBack();
        getWindowManger().refresh();
        getWindowManger().goForward();
        getWindowManger().goToPage("https://google.com");
    }
    @Test
    public void testMultipleTaps(){
        var multipleWindowPage = homePage.clickMultipleWindowsLink();
        multipleWindowPage.setClickButton();
        getWindowManger().switchToTap("New Window");
    }

}
