import org.testng.Assert;
import org.testng.annotations.Test;

public class TourToUkrainePage extends BaseUI {

    @Test
    public void testTourToUkrainePage() {
        driver.findElement(Locators.TOUR_TO_UKRAINE).click();
        driver.findElement(Locators.SEARCH_FIELD_ON_TOURS_TO_UKRAINE_PAGE).sendKeys("#");
        driver.findElement(Locators.SEARCH_BUTTON_ON_TOURS_TO_UKRAINE_PAGE).click();
        String searchResult = driver.findElement(Locators.RESULT_OF_THE_SEARCH).getText();
        System.out.println(searchResult);
        //Verify that User gets 'no items' result when performing search on a word "Test"
        Assert.assertEquals("No items", searchResult);
        driver.navigate().back();
        driver.findElement(Locators.PAYPAL_LINK).click();
    }
}
