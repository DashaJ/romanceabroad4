import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class HowWeWorkTests extends BaseUI {
    @Test
    public void testHowWeWorkPage() {

        howWeWorkPage.getToHowWeWorkPage();
        List<WebElement> howWeWorkLinks = driver.findElements(Locators.LIST_OF_LINKS);
        System.out.println(howWeWorkLinks.size());

        for (int i = 0; i < howWeWorkLinks.size(); i++) {
            String linksNames = howWeWorkLinks.get(i).getText();
            System.out.println(linksNames);

            howWeWorkLinks.get(i).click();
            if (linksNames.contains(Data.expectedtitlehowweworkpage)) {
                System.out.println("User was prompted to the correct page");
                String actualurl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedurlhowweworkpage, actualurl);

                driver.findElement(Locators.CAROUSEL_IMAGES).isDisplayed();
                if (actualurl.contains("#")) {
                    Assert.fail("Bad URL");
                } else {
                    System.out.println("The bug is fixed");
                }
            }

            driver.findElements(Locators.LIST_OF_LINKS);
        }
    }
}






