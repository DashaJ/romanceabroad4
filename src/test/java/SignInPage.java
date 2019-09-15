import org.testng.annotations.Test;

public class SignInPage extends BaseUI {

    @Test
    public void testSignInPage() {
        driver.findElement(Locators.LINK_SERACH).click();
        driver.findElement(Locators.FLYOUT_MENU).click();
        driver.findElement(Locators.LOGIN_ON_THE_FLYOUT).click();
        driver.findElement(Locators.FACEBOOK_LINK).click();
    }
}
