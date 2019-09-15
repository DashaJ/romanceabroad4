import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class PhotosPage extends BaseUI{


    @Test
    public void testPhotosPage() {
        driver.findElement(Locators.LINK_PHOTOS).click();

    }
}
