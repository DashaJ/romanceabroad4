import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HowWeWorkPage extends BaseActions {
    public HowWeWorkPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

    public void getToHowWeWorkPage(){
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
    }
    public void advertisingLink(){
        driver.findElement(Locators.ADVERTISING_LINK).click();
    }

}
