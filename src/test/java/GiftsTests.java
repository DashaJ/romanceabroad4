import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GiftsTests extends BaseUI {

    @Test
    public void testGiftsPage() {
        giftspage.GetToGiftsPage();

    WebElement flowerBasketonGiftsPage = driver.findElement(Locators.FLOWER_BASKET);
    if (flowerBasketonGiftsPage.getText().contains("Flower basket")){
        flowerBasketonGiftsPage.click();
    }
    else{
        Assert.fail("Flower Basket is not available");
    }
}
}
