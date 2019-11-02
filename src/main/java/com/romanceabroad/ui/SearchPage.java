package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BaseActions {
    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void fillMinMaxAge (){
        getDropDownByIndex(Locators.DROPDOWNLIST_AGE_MIN,0 );
        getDropDownByIndex(Locators.DROPDOWNLIST_AGE_MAX, 15);
        driver.findElement(Locators.SEARCH_BUTTON_ONSEARCHWIDGET).click();
    }
    public void sortSearchResultsByIndex (){
        getDropDownByIndex(Locators.DROPDOWNLIST_SORT_BY, 3);
    }
    public void getToNews (){
        driver.findElement(Locators.FLYOUT_MENU).click();
        driver.findElement(Locators.NEWS_ON_THE_FLYOUT).click();
    }
    public void clickSearchButton(){
        driver.findElement(Locators.SEARCH_BUTTON_ONSEARCHWIDGET).click();
    }
}
