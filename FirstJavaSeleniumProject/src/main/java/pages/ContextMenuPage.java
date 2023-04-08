package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;
    private By contextMenuBox = By.id("hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void contextClickInBox() {
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(contextMenuBox)).perform();
    }
    public void alert_ToAccept(){
        driver.switchTo().alert().accept();
    }
    public String alert_ToGetText(){
        return driver.switchTo().alert().getText();
    }
}
