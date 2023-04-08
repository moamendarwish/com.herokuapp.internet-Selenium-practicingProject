package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {
    @Test
    public void testFrameEditor(){
        var framePage = homePage.clickWYSIWYGEditorLink();
        framePage.clearText();
        framePage.sendText("iamMo2men");
        assertEquals( framePage.getText(),"iamMo2men","error Message");
    }
}
