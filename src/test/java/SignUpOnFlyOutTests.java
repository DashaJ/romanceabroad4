import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SignUpOnFlyOutTests extends BaseUI {

    @Test
    public void testSignUpOnFlyOut() {
        signuponflyoutpage.getTotheSignUp();
        signuponflyoutpage.fillRegistrationInfoFirstStep();
        //Dropdowns
        signuponflyoutpage.fillRegistartionInfoSecondStep();
        //Checkbox lates news and //Checkbox Terms and Conditions
        signuponflyoutpage.checkboxesHandling();

    }
}

