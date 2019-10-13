import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BaseActions {
    public SignInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public String getFacebookLogo() {
        driver.findElement(Locators.FACEBOOK_LINK).click();
        String text = driver.findElement(Locators.FACEBOOK_LOGO).getText();
        return text;
    }
    }

