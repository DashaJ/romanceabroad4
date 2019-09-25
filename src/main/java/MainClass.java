import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MainClass extends BaseActions {


    public MainClass(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void requestTourInfo (){
        driver.findElement(Locators.REQUEST_TOUR_INFO).click();
    }
}
