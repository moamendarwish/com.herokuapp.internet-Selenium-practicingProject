package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SliderPage {
    private WebDriver driver;
    private By sliderInput = By.cssSelector(".sliderContainer input");
    private By rangeIndicator = By.id("range");

    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setSliderValue(String value) {

        while (!getSliderValue().equals(value)){
            driver.findElement(sliderInput).sendKeys(Keys.ARROW_RIGHT);}
    }

    public String getSliderValue() {
        return driver.findElement(rangeIndicator).getText();
    }

}
