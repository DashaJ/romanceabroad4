package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ContactUsTests extends BaseUI {

    public static final boolean testCase15 = true;
    @Test(dataProvider = "ContactUs", dataProviderClass = DataProviders.class)
    //(priority= 1, enabled = testCase15, groups ={"regression"})
    public void contactUstestCase15(String reasontext ,String yourname,String registration_email,String subject,String messagetext){
        contactUsPage.getToContactUsPage();
    contactUsPage.fillTextFields(reasontext,yourname,registration_email,subject,messagetext);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.ERROR_ALERT)));
        WebElement alertMessageelement = driver.findElement(Locators.ERROR_ALERT);
        alertMessageelement.getText();

        if (alertMessageelement.equals("Please enter security code")) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}
