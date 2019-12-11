package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUIWithSauceLabs {
    public static final boolean testCase10 = true;
    public static final boolean testCase11 = true;
    String currentBlogPageURL;
    String numberOfLinks;

    @Test(priority= 1, enabled = testCase10, groups ={"regression"})
    public void testBlogPageTestCase10() {
        mainPage.getToTheBlogPage();
        currentBlogPageURL = driver.getCurrentUrl();
        System.out.println(currentBlogPageURL);
        //Verify that title of the Blog page is correct
        Assert.assertEquals(currentBlogPageURL, Data.expectedblogpageURL);
    }
    @Test(priority= 1, enabled = testCase11, groups ={"regression"})
    public void numberOfBlogCategoriesTestCase11() {
        List<WebElement> BlogCategories = blogPage.collectBlogCategories();
        for (int i = 0; i < BlogCategories.size(); i++) {
            numberOfLinks = BlogCategories.get(i).getText();
            System.out.println(numberOfLinks);

            blogPage.clickOnOdessaDatingAgency();
        }
    }
}
