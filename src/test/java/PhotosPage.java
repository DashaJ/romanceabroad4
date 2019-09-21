import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class PhotosPage extends BaseUI {

    @Test
    public void testPhotosPage() {
        driver.findElement(Locators.LINK_PHOTOS).click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.DROPDOWN_SORT_BY_PHOTOS)));
        getDropDownByIndex(Locators.DROPDOWN_SORT_BY_PHOTOS, 1);
    }
    public void getDropDownByIndex(By locator, int index) {
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);

    }
}