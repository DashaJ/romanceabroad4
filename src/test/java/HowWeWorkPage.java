import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HowWeWorkPage extends BaseUI {
    @Test
    public void testHowWeWorkPage() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
        driver.findElement(Locators.ADVERTISING_LINK).click();
    }

}
