import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {

    @Test
    public void testBlogPage() {
        mainPage.getToTheBlogPage();
        String currentBlogPageURL = driver.getCurrentUrl();
        System.out.println(currentBlogPageURL);
        //Verify that title of the Blog page is correct
        Assert.assertEquals(currentBlogPageURL, Data.expectedblogpageURL);
    }
    @Test
    public void numberOfBlogCategories() {
        List<WebElement> BlogCategories = driver.findElements(Locators.BLOG_CATEGORIES);
        for (int i = 0; i < BlogCategories.size(); i++) {
            String numberOfLinks = BlogCategories.get(i).getText();
            System.out.println(numberOfLinks);

            blogPage.clickOnOdessaDatingAgency();
        }
    }
}
