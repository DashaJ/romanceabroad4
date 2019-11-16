package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhotosPage extends BaseActions {
    public PhotosPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void clickOnDropdownViewsCount(){
            wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.DROPDOWN_SORT_BY_PHOTOS)));
    getDropDownByIndex(Locators.DROPDOWN_SORT_BY_PHOTOS, 1);}


}

