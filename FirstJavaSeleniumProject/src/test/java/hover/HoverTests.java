package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUser1(){
        var hoversPage = homePage.clickHoversLink();
        var figureCaption = hoversPage.hoverOverFigures(1);
        assertTrue(figureCaption.isCaptionDisplayed(),"figure caption is not displayed ");
        assertTrue(figureCaption.getLink().endsWith("users/1"),"figure caption is not displayed ");
        assertEquals(figureCaption.getTitle(),"name: user1","error message");
        assertEquals(figureCaption.getLinkText(),"View profile","error message");
    }
}
