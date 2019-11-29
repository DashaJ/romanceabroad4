package com.romanceabroad.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class TourToUkraineTests extends BaseUI {
    public static final boolean testCase14 = true;

    @Test(priority = 3, enabled = testCase14, groups = {"regression"})
    public void testTourToUkrainePage() {
        mainPage.getToTourToUkraine();
        tourToUkrainePage.performSearchOnItemAndVerifyResult();
        mainPage.performClick(Locators.SEARCH_BUTTON_ON_TOURS_TO_UKRAINE_PAGE);
        String searchResult = tourToUkrainePage.getSearchResult();
        System.out.println(searchResult);
        //Verify that User gets 'no items' result when performing search on a word "Test"
        Assert.assertEquals("No items", searchResult);
        tourToUkrainePage.clickOnPaypal();
        mainPage.performClick(Locators.PAYPAL_LINK);
    }

       @Test
    public void testFooter() {
        mainPage.getToTourToUkraine();
        mainPage.scrollToBottomOfPage();
        WebElement helpFooter = driver.findElement(By.xpath("//div[@id='footer-menu-title-0']"));
        WebElement aboutFooter = driver.findElement(By.xpath("//div[@id='footer-menu-title-1']"));
        WebElement privacypolicyFooter = driver.findElement(By.xpath("//div[@id='footer-menu-title-2']"));
        if (helpFooter.getText().contains("HELP") && (aboutFooter.getText().contains("ABOUT")
                && (privacypolicyFooter.getText().contains("PRIVACY POLICY")))) {

            mainPage.javaWaitSec(3);
            List<WebElement> footertabs = driver.findElements(By.xpath("//div[@class='footer-menu-list-group-item-text']"));
            for (int i = 0; i < footertabs.size(); i++) {
                footertabs.get(i).click();
                String actualTitle = tourToUkrainePage.getAnyTitle();
                if (i == 0) {
                    Assert.assertEquals(actualTitle, Data.expectedTitleContactUs);
                } else if (i == 1) {
                    Assert.assertEquals(actualTitle, Data.expectedTitleSiteMap);
                } else if (i == 2) {
                    Assert.assertEquals(actualTitle, Data.expectedTitleHowItWorks);
                } else if (i == 3) {
                    WebElement newsText = driver.findElement(By.xpath("//div[@class='title col-xs-12 col-sm-6 col-md-9 col-lg-9'] "));
                   String actualnewsText1= newsText.getText();
                    Assert.assertEquals(actualnewsText1, Data.expectednewsText);
                } else if (i == 4) {
                    Assert.assertEquals(actualTitle, Data.expectedTitlePrivacy);
                } else if (i == 5) {
                    Assert.assertEquals(actualTitle, Data.expectedTitleTermsOfUse);
                }
                mainPage.scrollToBottomOfPage();
                footertabs = driver.findElements(By.xpath("//div[@class='footer-menu-list-group-item-text']"));
            }
        } else {
            Assert.fail("Footer tabs dont display correctly");
        }
    }
}

