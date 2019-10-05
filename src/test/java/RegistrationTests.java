import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {
    @Test
    public void registrationTest() {
        registrationPage.clickjoinForFreeNow();
        registrationPage.registrationFirstStep();
        registrationPage.completeFirstRegistartionStep();
        registrationPage.completeSecondRegistartionStep();
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if(!driver.findElement(Locators.CHECKBOX_CONFIRMATION).isSelected()){
            checkboxConfirmation.click();
        }else{
            Assert.fail("Checkbox already selected");
        }

    }

}
