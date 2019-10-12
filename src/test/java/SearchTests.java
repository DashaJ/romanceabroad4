import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    @Test
    public void testSearchPage() {
        searchPage.getToSearchPeoplePage();
        String currentUrlSearch = driver.getCurrentUrl();
        System.out.println(currentUrlSearch);
        Assert.assertEquals(currentUrlSearch, Data.expectedurlsearch);
    }
    @Test
    public void testDefaultDropdown() {
        searchPage.getToSearchPeoplePage();

        int sizeOfDropDownListSortBy = searchPage.getSizeDropDownList(Locators.DEFAULT_DROPDOWN);
        System.out.println(sizeOfDropDownListSortBy);

        for (int i = 0; i < sizeOfDropDownListSortBy; i++) {
            mainPage.selectItemDropDownRandomOption(Locators.DEFAULT_DROPDOWN, "Sort by");
            mainPage.javaWaitSec(3);
        }
    }
    @Test
    public void testAgeDropdowns() {
        searchPage.getToSearchPeoplePage();
        searchPage.fillMinMaxAge();
        searchPage.sortSearchResultsByIndex();
        //Fly-out menu
        searchPage.getToNews();
    }
}
