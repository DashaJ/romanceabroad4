import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {
    public static final boolean testCase10 = true;
    public static final boolean testCase11 = true;

    @Test(priority= 1, enabled = testCase10, groups ={"regression"})
    public void testBlogPageTestCase10() {
        mainPage.getToTheBlogPage();
        String currentBlogPageURL = driver.getCurrentUrl();
        System.out.println(currentBlogPageURL);
        //Verify that title of the Blog page is correct
        Assert.assertEquals(currentBlogPageURL, Data.expectedblogpageURL);
    }
    @Test(priority= 1, enabled = testCase11, groups ={"regression"})
    public void numberOfBlogCategoriesTestCase11() {
        List<WebElement> BlogCategories = driver.findElements(Locators.BLOG_CATEGORIES);
        for (int i = 0; i < BlogCategories.size(); i++) {
            String numberOfLinks = BlogCategories.get(i).getText();
            System.out.println(numberOfLinks);

            blogPage.clickOnOdessaDatingAgency();
        }
    }
}
