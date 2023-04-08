package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testUploadFile(){
        var uploadPage = homePage.clickFileUploadLink();
        uploadPage.uploadFile
                ("E:\\First_java_selenium_project\\" +
                        "FirstJavaSeleniumProject\\resources\\chromedriver.exe");
        assertEquals(uploadPage.getUploadedFile(),"chromedriver.exe","error message");

    }
}
