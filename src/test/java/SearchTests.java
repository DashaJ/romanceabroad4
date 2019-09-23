import org.testng.annotations.Test;

public class SearchTests extends BaseUI {

    @Test
    public void testSearchPage() {
        searchpage.getToSearchPeoplePage();

        searchpage.clickOnGallery();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        searchpage.fillMinMaxAge();
        searchpage.sortSearchResultsByIndex();
        //Fly-out menu
        searchpage.getToNews();
    }

}