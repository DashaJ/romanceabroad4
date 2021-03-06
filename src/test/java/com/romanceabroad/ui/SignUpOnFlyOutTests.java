package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpOnFlyOutTests extends BaseUI {
    public static final boolean testCase13 = true;

    @Test
    public void testSignUpOnFlyOut() {
        mainPage.getTotheSignUpOnFlyOut();
        signUpOnFlyOutPage.fillRegistrationInfoFirstStep();
        //Dropdowns
        signUpOnFlyOutPage.fillRegistartionInfoSecondStep();
        //Checkbox lates news and //Checkbox Terms and Conditions
        WebElement checkboxConfirmationLatestNews = driver.findElement(Locators.CHECKBOX_LATEST_NEWS);
        Assert.assertTrue(driver.findElement(Locators.CHECKBOX_LATEST_NEWS).isDisplayed());
        mainPage.ajaxClick(checkboxConfirmationLatestNews);

        WebElement checkboxConfirmationOnSignupPage = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        Assert.assertTrue(driver.findElement(Locators.CHECKBOX_CONFIRMATION).isSelected());
        checkboxConfirmationOnSignupPage.click();
    }
}

