package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private WebDriver driver;
    private By dropDown = By.id("dropdown");


    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedOptions = findDropDownElement().getAllSelectedOptions();
        return selectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public void addMultipleAttribute(){
        String script = "arguments[0].setAttribute('multiple','')";
        ((JavascriptExecutor)driver).executeScript(script, findDropDownElement());
    }
    private Select findDropDownElement(){
        return new Select(driver.findElement(dropDown));
    }

}
