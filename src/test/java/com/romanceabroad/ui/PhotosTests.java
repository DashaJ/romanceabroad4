package com.romanceabroad.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class PhotosTests extends BaseUI {
    public static final boolean testCase7 = true;
    public static final boolean testCase8 = true;
    String actualTitle;

    @Test(priority = 1, enabled = testCase7, groups = {"regression"})
    public void PhotosPagetestCase7() {
        mainPage.getToPhotosPage();
        photosPage.clickOnDropdownViewsCount();
    }

    @Test(priority = 1, enabled = testCase8, groups = {"regression"})
    public void LinksOnPhotosPagetestCase8() {
        mainPage.checkLinksOnWebPage("//a", "href");
        mainPage.checkLinksOnWebPage("//img", "src");
    }

    @Test
    public void testPhotosTabs() {
        mainPage.getToPhotosPage();
        List<WebElement> usertabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        actualTitle = photosPage.getAnyTitle();
        Assert.assertEquals(actualTitle, Data.expectedTitleAll);
        for (int i = 0; i < usertabs.size(); i++) {
            usertabs.get(i).click();
            String actualTitle = photosPage.getAnyTitle();
            if (i == 0) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGallery);
            } else if (i == 1) {
                Assert.assertEquals(actualTitle, Data.expectedTitlePhotoGallery);
            } else if (i == 2) {
                Assert.assertEquals(actualTitle, Data.expectedTitleVideoGallery);
                mainPage.ajaxClick(Locators.TEXT_ON_VIDEO_TAB);
                String textMedia = driver.findElement(Locators.TEXT_ON_VIDEO_TAB).getText();
                System.out.println(textMedia);
                if (textMedia.contains(Data.textMedia)) {
                    System.out.println("Text Media is correct");
                }
            } else if (i == 3) {
                Assert.assertEquals(actualTitle, Data.expectedTitleGalleryAlbums);
                mainPage.ajaxClick(Locators.TEXT_ON_ALBUMS_TAB);
                mainPage.javaWaitSec(2);
                Assert.assertTrue(driver.findElement(Locators.ALBUMS_TABS).isDisplayed());
            }
            usertabs = driver.findElements(Locators.LINK_TAB_USER_PROFILE);
        }
    }

    @Test
    public void testUserProfile() {
        mainPage.getToPhotosPage();
        mainPage.javaWaitSec(3);
        List<WebElement> userProfileList = driver.findElements(By.xpath("//div[@class='g-users-gallery__info']//a[@class='g-users-gallery__name']"));
        mainPage.javaWaitSec(3);
        if (userProfileList.size() > 1) {
            for (int i = 0; i < userProfileList.size(); i++) {
                WebElement profilename = userProfileList.get(i);
                String nameOfUser = profilename.getText();
                System.out.println(nameOfUser);
            }
        } else {
            System.out.println("There are " + userProfileList.size() + "user profiles on the page");
        }
        userProfileList = driver.findElements(By.xpath("//div[@class='g-users-gallery__info']//a[@class='g-users-gallery__name']"));

    }
}



