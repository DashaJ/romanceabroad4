import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsPage extends BaseUI {



    @Test
    public void testGiftsPage() {
        driver.findElement(Locators.GIFTS_LINK).click();
        String currentGiftsPage = driver.getCurrentUrl();
        System.out.println(currentGiftsPage);
        //Verify that User prompted to correct Gifts page
        Assert.assertEquals(currentGiftsPage, Data.expectedGiftsPage);
    }
}
