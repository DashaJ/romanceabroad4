package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void clickOnOdessaDatingAgency() {
        driver.findElements(Locators.ODESSA_DATING_AGENCY_LINK).get(Data.indexodessadatingAgency);
    }

    public List<WebElement> collectBlogCategories() {
        List<WebElement> BlogCategories = driver.findElements(Locators.BLOG_CATEGORIES);
        return BlogCategories;
    }
}
