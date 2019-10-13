import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTests extends BaseUI {

    @Test
    public void testGiftsPage() {
        mainPage.getToGiftsPage();
        String currentgiftsPage = driver.getCurrentUrl();
        System.out.println(currentgiftsPage);
        //Verify that User prompted to correct Gifts page
        Assert.assertEquals(currentgiftsPage, Data.expectedgiftsPage);

        WebElement flowerBasketonGiftsPage = driver.findElement(Locators.FLOWER_BASKET);
        if (flowerBasketonGiftsPage.getText().contains("Flower basket")) {
            flowerBasketonGiftsPage.click();
        } else {
            Assert.fail("Flower Basket is not available");
        }
    }
}
