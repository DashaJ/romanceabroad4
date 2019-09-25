import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MainPage extends BaseUI {


    @Test
    public void testMainPage() {

        String actualTitle_MainPage = driver.getTitle();
        System.out.println(actualTitle_MainPage);
        String expectedTitle_MainPage = Data.expectedTitle_MainPage;
        //Verify that MainPage has correct title
        softAssert.assertEquals(actualTitle_MainPage, expectedTitle_MainPage);
        softAssert.assertAll();
        mainPage.requestTourInfo();

    }
}
