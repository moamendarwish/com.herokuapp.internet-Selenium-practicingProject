package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage clickFormAuthenticationLink() {
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }

    public HoversPage clickHoversLink() {
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public MultipleWindowsPage clickMultipleWindowsLink() {
        clickLink("Multiple Windows");
        return new MultipleWindowsPage(driver);
    }
    public InfiniteScrollPage InfiniteScrollLink() {
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public LargeAndDeepDOMPage LargeAndDeepDOMLink() {
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }
    public AlertsPage clickAlertsLink() {
        clickLink("JavaScript Alerts");
        return new AlertsPage(driver);
    }
    public DynamicLoadingPage clickDynamicLoadingLink() {
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public FramesPage clickFramesLink() {
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public WYSIWYGEditorPage clickWYSIWYGEditorLink() {
        clickLink("WYSIWYG Editor");
        return new WYSIWYGEditorPage(driver);
    }
    public ContextMenuPage clickContextMenuLink() {
        clickLink("Context Menu");
        return new ContextMenuPage(driver);
    }
    public FileUploadPage clickFileUploadLink() {
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public SliderPage clickHorizontalSliderLink() {
        clickLink("Horizontal Slider");
        return new SliderPage(driver);
    }

    public KeyPressesPage clickKeyPressesLink() {
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public DropDownPage clickDropDownLink() {
        clickLink("Dropdown");
        return new DropDownPage(driver);
    }

    private void clickLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }
}
