import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignInTests extends BaseUI {

    @Test
    public void testSignInPage() {
        mainPage.logInUsingFacebook();

        WebElement facebookLogo = driver.findElement(Locators.FACEBOOK_LOGO);
        if (facebookLogo.getText().contains("Facebook")) {
            System.out.println("Test Passed");
        } else {
            Assert.fail("User prompted to the wrong page");
        }
    }
}
