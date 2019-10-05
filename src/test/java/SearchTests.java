import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    @Test
    public void testSearchPage() {
        searchPage.getToSearchPeoplePage();

        searchPage.clickOnGallery();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchPage.fillMinMaxAge();
        searchPage.sortSearchResultsByIndex();
        //Fly-out menu
        searchPage.getToNews();
    }

}