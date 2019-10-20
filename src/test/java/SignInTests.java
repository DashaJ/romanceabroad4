import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignInTests extends BaseUI {
    public static final boolean testCase12 = true;

    @Test(priority= 3, enabled = testCase12, groups ={"regression"})
    public void testSignInPageTestCase12() {
        mainPage.logInUsingFacebook();
        signInPage.getFacebookLogo();

        WebElement facebookLogo = driver.findElement(Locators.FACEBOOK_LOGO);
        if (facebookLogo.getText().contains("Facebook")) {
            System.out.println("Test Passed");
        } else {
            Assert.fail("User prompted to the wrong page");
        }
    }
}
