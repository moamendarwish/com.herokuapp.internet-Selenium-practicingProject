package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIframeID = "mce_0_ifr";
    private By textArea = By.id("tinymce");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clearText(){
        switchToEditFrame();
        driver.findElement(textArea).clear();
        switchToParentFrame();
    }
    public void sendText(String text){
        switchToEditFrame();
        driver.findElement(textArea).sendKeys(text);
        switchToParentFrame();
    }
    public String getText(){
        switchToEditFrame();
        String text = driver.findElement(textArea).getText();
        switchToParentFrame();
        return text;
    }

    private void switchToEditFrame() {
        driver.switchTo().frame(editorIframeID);
    }
    private void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }
}
