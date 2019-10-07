import org.openqa.selenium.By;
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
        driver.findElement(Locators.YOUTUBE_BUTTON).click();
       driver.switchTo().defaultContent();
        mainPage.ajaxClick(driver.findElement(By.xpath("//div[@class='col-lg-12 text-center']//a[@href='#']")));
        softAssert.assertAll();
    }
}
