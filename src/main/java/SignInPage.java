import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends BaseActions {
    public SignInPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void logInUsingFacebook() {
        driver.findElement(Locators.LINK_SERACH).click();
        driver.findElement(Locators.FLYOUT_MENU).click();
        driver.findElement(Locators.LOGIN_ON_THE_FLYOUT).click();
        driver.findElement(Locators.FACEBOOK_LINK).click();
    }

    public String getFacebookLogo() {
        String text = driver.findElement(Locators.FACEBOOK_LOGO).getText();
        return text;
    }
    }

