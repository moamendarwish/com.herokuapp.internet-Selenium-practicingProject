package javaScriptExecuter;

import base.BaseTests;
import org.testng.annotations.Test;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        homePage.LargeAndDeepDOMLink().scrollIntoTable();
    }
//    @Test
//    public void testScrollToParagraph(){
//        homePage.InfiniteScrollLink().scrollToParagraph(5);
//    }
}
