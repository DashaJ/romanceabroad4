import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    @Test
    public void testSearchPage() {
        mainPage.getToSearchPeoplePage();
        String currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedurlsearch);
    }
    @Test
    public void testDefaultDropdown() {
        mainPage.getToSearchPeoplePage();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DEFAULT_DROPDOWN);
        System.out.println(sizeOfDropDownListSortBy);

        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            mainPage.selectItemDropDownRandomOption(Locators.DEFAULT_DROPDOWN, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }
    @Test
    public void testAgeDropdowns() {
        mainPage.getToSearchPeoplePage();
        searchPage.fillMinMaxAge();
        searchPage.sortSearchResultsByIndex();
        //Fly-out menu
        searchPage.getToNews();
    }
}
