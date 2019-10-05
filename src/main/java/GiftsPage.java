import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftsPage extends BaseActions {
    public GiftsPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void getToGiftsPage(){
        driver.findElement(Locators.GIFTS_LINK).click();
        String currentgiftsPage = driver.getCurrentUrl();
        System.out.println(currentgiftsPage);
        //Verify that User prompted to correct Gifts page
        Assert.assertEquals(currentgiftsPage, Data.expectedgiftsPage);
    }
}
