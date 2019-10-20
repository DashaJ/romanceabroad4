import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HowWeWorkPage extends BaseActions {
    public HowWeWorkPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }
    public void findCarouselImages(){
        driver.findElement(Locators.CAROUSEL_IMAGES).isDisplayed();
    }


}
