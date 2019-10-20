import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;


public class ContactUsTests extends BaseUI {
    public static final boolean testCase15 = true;

    @Test(priority= 1, enabled = testCase15, groups ={"regression"})
    public void contactUstestCase15(){
    contactUsPage.getToContactUsPage();
    contactUsPage.fillTextFields();
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.ERROR_ALERT)));
        WebElement alertMessageelement = driver.findElement(Locators.ERROR_ALERT);
        alertMessageelement.getText();

        if (alertMessageelement.equals("Please enter security code")) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}
