import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class MainTests extends BaseUI {


    @Test
    public void testMainPage() {
        mainPage.requestTourInfo();
        String actualtitlemainpage = driver.getTitle();
        System.out.println(actualtitlemainpage);
        String expectedtitlemainpage = Data.expectedtitlemainpage;
        //Verify that MainPage has correct title
        softAssert.assertEquals(actualtitlemainpage, expectedtitlemainpage);
        WebElement ele = driver.findElement(Locators.IFRAMELOCATOR);
        driver.switchTo().frame(ele);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(Locators.YOUTUBE_BUTTON);
        softAssert.assertAll();
    }
}
