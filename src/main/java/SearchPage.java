import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SearchPage extends BaseActions {
    public SearchPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void getToSearchPeoplePage(){
        driver.findElement(Locators.LINK_SERACH).click();
        String currentURLsearch = driver.getCurrentUrl();
        System.out.println(currentURLsearch);
        Assert.assertEquals(currentURLsearch, Data.expectedURLsearch);
    }
    public void clickOnGallery() {
        driver.findElement(Locators.GALLERY_VIEW).click();
    }
    public void fillMinMaxAge (){
        getDropDownListByIndex(Locators.DROPDOWNLIST_AGE_MIN,0 );
        getDropDownListByIndex(Locators.DROPDOWNLIST_AGE_MAX, 15);
        driver.findElement(Locators.SEARCH_BUTTON_OnTheSearchWidget).click();
    }
    public void sortSearchResultsByIndex (){
        getDropDownListByIndex(Locators.DROPDOWNLIST_SORT_BY, 3);
    }
    public void getToNews (){
        driver.findElement(Locators.FLYOUT_MENU).click();
        driver.findElement(Locators.NEWS_ON_THE_FLYOUT).click();
    }

}
