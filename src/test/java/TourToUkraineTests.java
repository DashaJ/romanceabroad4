import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkraineTests extends BaseUI {
    public static final boolean testCase14 = true;

    @Test(priority= 3, enabled = testCase14, groups ={"regression"})
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
}
