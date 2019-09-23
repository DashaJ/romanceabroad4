import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class TourToUkrainePage extends BaseActions {
    public TourToUkrainePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void getToTourToUkraine() {
        driver.findElement(Locators.TOUR_TO_UKRAINE).click();
    }
    public void performSearchOnItemAndVerifyResult() {
        driver.findElement(Locators.SEARCH_FIELD_ON_TOURS_TO_UKRAINE_PAGE).sendKeys("#");
        driver.findElement(Locators.SEARCH_BUTTON_ON_TOURS_TO_UKRAINE_PAGE).click();
        String searchResult = driver.findElement(Locators.RESULT_OF_THE_SEARCH).getText();
        System.out.println(searchResult);
        //Verify that User gets 'no items' result when performing search on a word "Test"
        Assert.assertEquals("No items", searchResult);
    }
    public void clickOnPaypal() {
        driver.navigate().back();
        driver.findElement(Locators.PAYPAL_LINK).click();
    }
}
