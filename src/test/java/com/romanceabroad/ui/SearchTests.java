package com.romanceabroad.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class SearchTests extends BaseUI {
    public static final boolean testCase4 = true;
    public static final boolean testCase5 = false;
    public static final boolean testCase6 = true;
    public static final boolean testCase20 = true;

    @Test(priority = 1, enabled = testCase4, groups = {"smoke"})
    public void testSearchPageTestCase1() {
        mainPage.getToSearchPeoplePage();
        String currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedurlsearch);
    }
    @Test(priority = 2, enabled = testCase5, groups = {"regression"})
    public void testDefaultDropdownTestCase2() {
        mainPage.getToSearchPeoplePage();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DEFAULT_DROPDOWN);
        System.out.println(sizeOfDropDownListSortBy);

        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            mainPage.selectItemDropDownRandomOption(Locators.DEFAULT_DROPDOWN, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }
    @Test(priority = 3, enabled = testCase6, groups = {"regression"})
    public void testAgeDropdownsTestCase3() {
        mainPage.getToSearchPeoplePage();
        searchPage.fillMinMaxAge();
        searchPage.sortSearchResultsByIndex();
        //Fly-out menu
        searchPage.getToNews();
    }
    @Test(dataProvider = "Search", dataProviderClass = DataProviders.class, priority = 4, enabled = testCase20, groups = {"regression"})
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
        List<WebElement> infoAboutUser = driver.findElements(By.xpath("//div[@class='text-overflow']"));
        for (int i = 0; i < infoAboutUser.size(); i++) {
            WebElement text = infoAboutUser.get(i);
            String info = text.getText();
            System.out.println(info);
            mainPage.javaWaitSec(3);
            infoAboutUser = driver.findElements(By.xpath("//div[@class='text-overflow']"));
        }
    }

}
