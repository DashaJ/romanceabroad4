import org.openqa.selenium.By;
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
    }
    public String getSearchResult(){
        String text = driver.findElement(Locators.RESULT_OF_THE_SEARCH).getText();
        return text;
    }
    public void clickOnPaypal() {
        driver.navigate().back();
    }
}
