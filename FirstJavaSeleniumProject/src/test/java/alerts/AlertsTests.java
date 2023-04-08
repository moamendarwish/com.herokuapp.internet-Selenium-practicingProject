package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertsTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickAlertsLink();
        alertsPage.triggerAlert();
        alertsPage.alert_toAccept();
        assertEquals(alertsPage.getResult(),
                "You successfully clicked an alert",
                "result message is incorrect");
    }    @Test
    public void testDismissAlert(){
        var alertsPage = homePage.clickAlertsLink();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_ToGetMessage();
        alertsPage.alert_ToDismiss();
        assertEquals(text,
                "I am a JS Confirm",
                "result message is incorrect");
    }    @Test
    public void testSendTextToAlert(){
        var alertsPage = homePage.clickAlertsLink();
        alertsPage.triggerPrompt();
        alertsPage.alert_ToSendText("testing is interesting");
        alertsPage.alert_toAccept();
        assertEquals(alertsPage.getResult(),
                "You entered: testing is interesting",
                "result message is incorrect");
    }
}
