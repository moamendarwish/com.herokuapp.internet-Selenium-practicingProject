package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContextMenu(){
        var contextMenuPage = homePage.clickContextMenuLink();
        contextMenuPage.contextClickInBox();
        String text = contextMenuPage.alert_ToGetText();
        contextMenuPage.alert_ToAccept();
        assertEquals(text,"You selected a context menu","errorMessage");
    }
}
