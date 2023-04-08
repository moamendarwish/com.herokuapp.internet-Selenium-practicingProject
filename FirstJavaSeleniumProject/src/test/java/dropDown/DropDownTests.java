package dropDown;

import base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropDown() {
        var dropDownPage = homePage.clickDropDownLink();
        String selectedOption = "Option 1";
        dropDownPage.selectFromDropDown(selectedOption);
        assertTrue(dropDownPage.getSelectedOptions().contains(selectedOption), "your selected option is incorrect");
    }

    @Test
    public void testAddAttribute() {
        var dropDownPage = homePage.clickDropDownLink();
        dropDownPage.addMultipleAttribute();
        var optionsToSelect = List.of("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);
        assertEquals(dropDownPage.getSelectedOptions().size(),optionsToSelect.size(),"errorMessage");
    }
}
