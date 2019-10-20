import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.List;

public class HowWeWorkTests extends BaseUI {
    public static final boolean testCase9 = true;

    @Test(priority= 1, enabled = testCase9, groups ={"regression"})
    public void testHowWeWorkPageTestCase9() {
        mainPage.getToHowWeWorkPage();
        List<WebElement> howWeWorkLinks = driver.findElements(Locators.LIST_OF_LINKS);
        System.out.println(howWeWorkLinks.size());

        for (int i = 0; i < howWeWorkLinks.size(); i++) {
            String linksNames = howWeWorkLinks.get(i).getText();
            System.out.println(linksNames);

            mainPage.performClick(howWeWorkLinks.get(i));
            if (linksNames.contains(Data.expectedtitlehowweworkpage)) {
                System.out.println("User prompted to the correct page");
                String actualurl = driver.getCurrentUrl();
                Assert.assertEquals(Data.expectedurlhowweworkpage, actualurl);

                howWeWorkPage.findCarouselImages();
                if (actualurl.contains("#")) {
                    Assert.fail("Bad URL");
                } else {
                    System.out.println("The bug was fixed");
                }
            }
            howWeWorkLinks = driver.findElements(Locators.LIST_OF_LINKS);
        }
    }
}






