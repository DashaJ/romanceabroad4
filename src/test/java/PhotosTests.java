import org.testng.annotations.Test;

public class PhotosTests extends BaseUI {

    @Test
    public void testPhotosPage() {
       photosPage.getToPhotosPage();
        photosPage.clickOnDropdownViewsCount();
    }
    @Test
    public void testLinksOnPhotosPage(){
        mainPage.checkLinksOnWebPage("//a", "href" );
        mainPage.checkLinksOnWebPage("//img", "src" );
    }
}