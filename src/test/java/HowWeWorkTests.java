import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.util.List;

public class HowWeWorkTests extends BaseUI {
    @Test
    public void testHowWeWorkPage() {
        howweworkpage.GetToHowWeWorkPage();
        List<WebElement> howWeWorkLinks = driver.findElements(Locators.LIST_OF_LINKS);
        System.out.println(howWeWorkLinks.size());
        for (int i= 0; i< howWeWorkLinks.size(); i++) {
            String numberOfLinks =howWeWorkLinks.get(i).getText();
            System.out.println(numberOfLinks);
            howweworkpage.advertisingLink();
        }
    }

}
