import org.testng.annotations.Test;

public class SignInTests extends BaseUI {

    @Test
    public void testSignInPage() {
        signInPage.logInUsingFacebook();
    }
}
