import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BlogPage extends BaseActions {
    public BlogPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void GetToTheBlogPage (){
        driver.findElement(Locators.LINK_BLOG).click();
        String currentBlogPageURL = driver.getCurrentUrl();
        System.out.println(currentBlogPageURL);
        //Verify that title of the Blog page is correct
        Assert.assertEquals(currentBlogPageURL, Data.expectedBlogPageURL);
    }

    public void clickOnOdessaDatingAgency(){
        driver.findElements(Locators.ODESSA_DATING_AGENCY_LINK).get(Data.indexOdessaDatingAgency);
    }
}
