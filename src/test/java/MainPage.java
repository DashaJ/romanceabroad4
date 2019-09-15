import org.testng.Assert;
import org.testng.annotations.Test;
public class MainPage extends BaseUI{

    String expectedTitle_MainPage = "The Best Free Ukrainian Dating Site| Romanceabroad.Com";

    @Test
    public void testMainPage() {
        String actualTitle_MainPage = driver.getTitle();
        System.out.println(actualTitle_MainPage);
        //Verify that MainPage has correct title
        Assert.assertEquals(actualTitle_MainPage, expectedTitle_MainPage);
        driver.findElement(Locators.SIGN_IN_OnNavBar).click();
        driver.findElement(Locators.REQUEST_TOUR_INFO).click();
    }
}
