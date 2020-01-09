package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BaseActions {

    @FindBy(xpath ="//a[contains(text(),'SIGN IN')]")
    WebElement signInNavButton;

    public SignInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void signInCredentials(String signinemail,String signinpassword) {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.SIGN_IN_NAV)));

        signInNavButton.click();

        ajaxClick(Locators.SIGNIN_EMAIL);
        driver.findElement(Locators.SIGNIN_EMAIL).sendKeys(signinemail);

        ajaxClick(Locators.SIGNIN_PASSWORD);
        driver.findElement(Locators.SIGNIN_PASSWORD).sendKeys(signinpassword);
    }
    public void getFacebookLogo() {
        driver.findElement(Locators.FACEBOOK_LINK).click();

    }
}

