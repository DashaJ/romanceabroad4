import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {
    public static final boolean testCase4 = true;
    public static final boolean testCase5 = false;
    public static final boolean testCase6 = true;

    @Test(priority= 1, enabled = testCase4, groups ={"smoke"})
    public void testSearchPageTestCase1() {
        mainPage.getToSearchPeoplePage();
        String currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedurlsearch);
    }
    @Test(priority= 2, enabled = testCase5, groups ={"regression"})
    public void testDefaultDropdownTestCase2() {
        mainPage.getToSearchPeoplePage();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DEFAULT_DROPDOWN);
        System.out.println(sizeOfDropDownListSortBy);

        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            mainPage.selectItemDropDownRandomOption(Locators.DEFAULT_DROPDOWN, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }
    @Test(priority= 3, enabled = testCase6, groups ={"regression"})
    public void testAgeDropdownsTestCase3() {
        mainPage.getToSearchPeoplePage();
        searchPage.fillMinMaxAge();
        searchPage.sortSearchResultsByIndex();
        //Fly-out menu
        searchPage.getToNews();
    }
}
