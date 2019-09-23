import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainPage extends BaseActions {
    String expectedTitle_MainPage = Data.expectedTitle_MainPage;

    public MainPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void getToTheMainPage (){
        String actualTitle_MainPage = driver.getTitle();
        System.out.println(actualTitle_MainPage);
        //Verify that MainPage has correct title
        Assert.assertEquals(actualTitle_MainPage, expectedTitle_MainPage);
    }
    public void requestTourInfo (){
        driver.findElement(Locators.REQUEST_TOUR_INFO).click();
    }
}
