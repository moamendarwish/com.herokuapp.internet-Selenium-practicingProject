package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitsTests extends BaseTests {
    @Test
    public void testDynamicLoading(){
        var dynamicLoadingExample1Page = homePage.clickDynamicLoadingLink().clickExample1();
        dynamicLoadingExample1Page.clickStart();
        assertEquals (dynamicLoadingExample1Page.getText(),"Hello World!","Error Message");
    }

}
