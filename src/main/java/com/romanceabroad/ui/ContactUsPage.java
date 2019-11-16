package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage extends BaseActions {

    public ContactUsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void getToContactUsPage() {
        driver.findElement(Locators.LINK_SERACH).click();
        scrollToBottomOfPage();
        ajaxClick(Locators.CONTACT_US);
    }
    public void fillTextFields(String reasontext ,String yourname,String registration_email,String subject,String messagetext) {
        driver.findElement(Locators.LIST_REASON).click();
        checkValueOfLists(Locators.LIST_REASON_VALUE, reasontext);
        driver.findElement(Locators.YOUR_NAME).sendKeys(yourname);
        driver.findElement(Locators.YOUR_EMAIL).sendKeys(registration_email);
        driver.findElement(Locators.SUBJECT).sendKeys(subject);
        driver.findElement(Locators.MESSAGE).sendKeys(messagetext);
        ajaxClick(Locators.SEND_BUTTON);
    }
}


