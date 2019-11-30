package com.romanceabroad.ui;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.automation.remarks.testng.VideoListener;
import com.automation.remarks.video.annotations.Video;
import org.testng.annotations.Listeners;

@Listeners(VideoListener.class)
public class RegistrationTests extends BaseUI {

    @Video(name = "Registration Test")
    @Test(dataProvider = "Registration2", dataProviderClass = DataProviders.class)
    //(priority= 1, enabled = testCase9, groups ={"smoke"})
    public void registrationTestCase2(String registration_email, String nickname, boolean requirment) {

        Reports.log("Click Join for free button");
        mainPage.clickjoinForFreeNow();
        registrationPage.registrationFirstStep(registration_email, Data.registration_password);
        if (!requirment) {
            Reports.log("Error message is not displayed");
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR).isDisplayed());
        } else {
            registrationPage.clickNextButton();
            registrationPage.completeSecondRegistartionStep(nickname, Data.day, Data.month,
                    Data.year, Data.phone);
        }
    }
    public static final boolean testCase9 = true;
    @Test(dataProvider = "Registration1", dataProviderClass = DataProviders.class)
    //(priority= 1, enabled = testCase9, groups ={"smoke"})
    public void registrationTestCase9(String registration_email, String registration_password, String day, String month, String year, String phone) {
        Reports.log("Click Join for free button");
        mainPage.clickjoinForFreeNow();
        Reports.log("Type email and password");
        registrationPage.registrationFirstStep(registration_email, registration_password);
        Reports.log("Click Next button");
        registrationPage.clickNextButton();
        Reports.log("Fill username,day,month,year,phone ");
        registrationPage.completeSecondRegistartionStep(mainPage.generateNewNumber(Data.username, 5), day, month,
                year, phone);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.CHECKBOX_CONFIRMATION)));
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if (!driver.findElement(Locators.CHECKBOX_CONFIRMATION).isSelected()) {
            checkboxConfirmation.click();
        } else {
            Assert.fail("Checkbox already selected");
        }
    }
}



