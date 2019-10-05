import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class BlogTests extends BaseUI {

    @Test
    public void testBlogPage() {
        blogPage.getToTheBlogPage();
        List<WebElement> BlogCategories = driver.findElements(By.xpath("//div[@class='info-content-block wysiwyg']//ul//li"));
        for (int i = 0; i < BlogCategories.size(); i++) {
            String numberOfLinks = BlogCategories.get(i).getText();
            System.out.println(numberOfLinks);
            blogPage.clickOnOdessaDatingAgency();
        }
    }
}
