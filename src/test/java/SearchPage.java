import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SearchPage extends BaseUI {

    @Test
    public void testSearchPage() {
        driver.findElement(Locators.LINK_SERACH).click();
        String currentURLsearch = driver.getCurrentUrl();
        System.out.println(currentURLsearch);
        Assert.assertEquals(currentURLsearch, Data.expectedURLsearch);
        driver.findElement(Locators.GALLERY_VIEW).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        getDropDownListByIndex(Locators.DROPDOWNLIST_AGE_MIN,0 );
        getDropDownListByIndex(Locators.DROPDOWNLIST_AGE_MAX, 15);
        driver.findElement(Locators.SEARCH_BUTTON_OnTheSearchWidget).click();
        getDropDownListByIndex(Locators.DROPDOWNLIST_SORT_BY, 3);
        //Fly-out menu
        driver.findElement(Locators.FLYOUT_MENU).click();
        driver.findElement(Locators.NEWS_ON_THE_FLYOUT).click();
    }
    public void getDropDownListByIndex(By locator, int index) {
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);

    }
}