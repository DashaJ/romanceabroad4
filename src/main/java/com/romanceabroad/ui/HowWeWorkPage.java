package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HowWeWorkPage extends BaseActions {
    public HowWeWorkPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public List<WebElement> collectLinks(){
        List<WebElement> howWeWorkLinks = driver.findElements(Locators.LIST_OF_LINKS);
    return howWeWorkLinks;
    }


    public void findCarouselImages(){
        driver.findElement(Locators.CAROUSEL_IMAGES).isDisplayed();
    }


}
