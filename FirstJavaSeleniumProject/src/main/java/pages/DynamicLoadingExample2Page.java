package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class DynamicLoadingExample2Page {
    private WebDriver driver;
    private By startButton = By.id("start");
    public DynamicLoadingExample2Page(WebDriver driver) {
        this.driver = driver;
    }
    public boolean isStartButtonVisible(){
        return driver.findElement(startButton).isDisplayed();
    }

}
