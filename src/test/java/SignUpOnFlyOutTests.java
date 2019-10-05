import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpOnFlyOutTests extends BaseUI {

    @Test
    public void testSignUpOnFlyOut() {
        signUpOnFlyOutPage.getTotheSignUp();
        signUpOnFlyOutPage.fillRegistrationInfoFirstStep();
        //Dropdowns
        signUpOnFlyOutPage.fillRegistartionInfoSecondStep();
        //Checkbox lates news and //Checkbox Terms and Conditions
        WebElement checkboxConfirmationLatestNews = driver.findElement(Locators.CHECKBOX_LATEST_NEWS);
        Assert.assertTrue(driver.findElement(Locators.CHECKBOX_LATEST_NEWS).isDisplayed());
        checkboxConfirmationLatestNews.click();

        WebElement checkboxConfirmationOnSignupPage = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        Assert.assertTrue(!driver.findElement(Locators.CHECKBOX_CONFIRMATION).isSelected());
        checkboxConfirmationOnSignupPage.click();
    }
}

