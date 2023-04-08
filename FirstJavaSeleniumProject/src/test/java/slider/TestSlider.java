package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSlider extends BaseTests {
    @Test
    public void testSlider() {
        var sliderPage = homePage.clickHorizontalSliderLink();
        sliderPage.setSliderValue("4");
        assertEquals(sliderPage.getSliderValue(), "4", "slider value is incorrect");
    }
}
