import org.testng.Assert;
import org.testng.annotations.Test;
public class BlogPage extends BaseUI {

    @Test
    public void testBlogPage() {
        driver.findElement(Locators.LINK_BLOG).click();
        String currentBlogPageURL = driver.getCurrentUrl();
        System.out.println(currentBlogPageURL);
        //Verify that title of the Blog page is correct
        Assert.assertEquals(currentBlogPageURL, Data.expectedBlogPageURL);
        driver.findElements(Locators.ODESSA_DATING_AGENCY_LINK).get(Data.indexOdessaDatingAgency);
    }
}
