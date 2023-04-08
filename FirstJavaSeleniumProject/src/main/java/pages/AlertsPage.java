package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    private WebDriver driver;
    private By triggerJSAlertButton = By.xpath("//button[text()='Click for JS Alert']");
    private By triggerJSConfirmButton = By.xpath("//button[text()='Click for JS Confirm']");
    private By triggerJSPromptButton = By.xpath("//button[text()='Click for JS Prompt']");
    private By resultText = By.id("result");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerAlert() {
        clickButton(triggerJSAlertButton);
    }

    public void triggerConfirm() {
        clickButton(triggerJSConfirmButton);
    }
    public void triggerPrompt() {
        clickButton(triggerJSPromptButton);
    }

    public void alert_toAccept() {
        driver.switchTo().alert().accept();
    }
    public String getResult(){
        return driver.findElement(resultText).getText();
    }

    public void alert_ToDismiss() {
        driver.switchTo().alert().dismiss();
    }
    public String alert_ToGetMessage(){
        return driver.switchTo().alert().getText();
    }

    public void alert_ToSendText(String text) {
        driver.switchTo().alert().sendKeys(text);
    }
    private void clickButton(By button){
        driver.findElement(button).click();
    }


}
