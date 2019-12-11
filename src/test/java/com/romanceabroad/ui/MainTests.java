package com.romanceabroad.ui;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class MainTests extends BaseUIWithSauceLabs {
    public static final boolean testCase1 = true;
    public static final boolean testCase2 = true;
    public static final boolean testCase3 = true;

    @Test(priority= 1, enabled = testCase1, groups ={"smoke"})
    public void smokeTestForTheMainPageTestCase1(){
    List<WebElement> mainTabs= driver.findElements(Locators.TABS_MAINPAGE);
    for (int i = 0; i <mainTabs.size() ; i++) {
        mainTabs.get(i).click();
        driver.get(Data.mainUrl);
        mainTabs= driver.findElements(Locators.TABS_MAINPAGE);
    }
}

    @Test(priority= 1, enabled = testCase2, groups ={"smoke"})
    public void testMainPageTestCase2() {
        mainPage.requestTourInfo();
        String actualtitlemainpage = driver.getTitle();
        System.out.println(actualtitlemainpage);
        String expectedtitlemainpage = Data.expectedtitlemainpage;
        //Verify that com.romanceabroad.ui.MainPage has correct title
        softAssert.assertEquals(actualtitlemainpage, expectedtitlemainpage);
    }
    @Test(priority= 1, enabled = testCase3, groups ={"regression"})
    public void youtubeTestCase3() {
        WebElement ele = driver.findElement(Locators.IFRAMELOCATOR);
        driver.switchTo().frame(ele);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        mainPage.youtubeButton();
        driver.switchTo().defaultContent();
        mainPage.ajaxClick(driver.findElement(Locators.JOIN_TODAY));
        softAssert.assertAll();
    }

}
