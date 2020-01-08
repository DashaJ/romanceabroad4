package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import java.util.List;

public class SearchTests extends BaseUI {
    public static final boolean testCase4 = true;
    public static final boolean testCase5 = false;
    public static final boolean testCase6 = true;
    public static final boolean testCase20 = true;

    @Test
    public void testSearchPageTestCase1() {
        mainPage.getToSearchPeoplePage();
        String currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedurlsearch);
    }

    @Test
    public void testDefaultDropdownTestCase2() {
        mainPage.getToSearchPeoplePage();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DEFAULT_DROPDOWN);
        System.out.println(sizeOfDropDownListSortBy);

        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            mainPage.selectItemDropDownRandomOption(Locators.DEFAULT_DROPDOWN, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }

    @Test
    public void testAgeDropdownsTestCase3() {
        mainPage.getToSearchPeoplePage();
        searchPage.fillMinMaxAge();
        searchPage.sortSearchResultsByIndex();
        //Fly-out menu
        searchPage.getToNews();
    }

    @Test(dataProvider = "Search", groups = {"regression"})
    public void testDefaultDropdownTestCase4(String minAge, String maxAge, String sortBy) {
        int min = Integer.parseInt(minAge);
        int max = Integer.parseInt(maxAge);
        System.out.println(min);
        System.out.println(max);

        mainPage.getToSearchPeoplePage();
        searchPage.getDropDownListByText(driver.findElement(Locators.DROPDOWNLIST_AGE_MIN), minAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROPDOWNLIST_AGE_MAX), maxAge);
        searchPage.getDropDownListByText(driver.findElement(Locators.DROPDOWNLIST_SORT_BY), sortBy);
        searchPage.clickSearchButton();
        List<WebElement> infoAboutUser = driver.findElements(Locators.TEXT_USER_PROFILE);

        for (int i = 0; i < infoAboutUser.size(); i++) {
            if (i % 2 == 0) {
                WebElement text = infoAboutUser.get(i);
                String info = text.getText();
                String[] splitedPhrase = info.split(",");
                String age = splitedPhrase[1];
                int ageNum = Integer.parseInt(age);
                if (min <= ageNum || ageNum <= max) {
                    System.out.println("This age: " + ageNum + " is correct");
                } else {
                    Assert.fail("Wrong age: " + ageNum);
                }
            }
            mainPage.javaWaitSec(3);
            infoAboutUser = driver.findElements(Locators.TEXT_USER_PROFILE);
        }
    }

}

