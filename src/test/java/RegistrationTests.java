import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {
    public static final boolean testCase9 = true;

    @Test(priority= 1, enabled = testCase9, groups ={"smoke"})
    public void registrationTestCase9() {
        mainPage.clickjoinForFreeNow();
        registrationPage.registrationFirstStep(Data.registration_email, Data.registration_password);
        registrationPage.completeSecondRegistartionStep(mainPage.generateNewNumber(Data.username, 5), Data.day, Data.month,
                Data.year, Data.phone, Data.city, Data.location);
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if(!driver.findElement(Locators.CHECKBOX_CONFIRMATION).isSelected()){
            checkboxConfirmation.click();
        }else{
            Assert.fail("Checkbox already selected");
        }
    }
}
