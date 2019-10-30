import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTests extends BaseUI {


    @Test(dataProvider = "Registration2", dataProviderClass = DataProviders)
    //(priority= 1, enabled = testCase9, groups ={"smoke"})
    public void registrationTestCase2(String registration_email, String nickname, boolean requirment) {

        mainPage.clickjoinForFreeNow();
        registrationPage.registrationFirstStep(registration_email, Data.registration_password);
        if (requirment) {
            Assert.assertTrue(driver.findElement(Locators.TOOLTIP_ERROR).isDisplayed());
        } else {
            registrationPage.clickNextButton();
            registrationPage.completeSecondRegistartionStep(nickname, Data.day, Data.month,
                    Data.year, Data.phone, Data.city);

        }
    }

    public static final boolean testCase9 = true;

    @Test(dataProvider = "Registration1", dataProviderClass = DataProviders.class)
    //(priority= 1, enabled = testCase9, groups ={"smoke"})
    public void registrationTestCase9(String registration_email, String registration_password, String day, String month, String year, String phone, String city) {
        mainPage.clickjoinForFreeNow();
        registrationPage.registrationFirstStep(registration_email, registration_password);
        registrationPage.completeSecondRegistartionStep(mainPage.generateNewNumber(Data.username, 5), day, month,
                year, phone, city);
        mainPage.ajaxClick(driver.findElement(By.xpath("//li[@city='355536']")));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.CHECKBOX_CONFIRMATION)));
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if (!driver.findElement(Locators.CHECKBOX_CONFIRMATION).isSelected()) {
            checkboxConfirmation.click();
        } else {
            Assert.fail("Checkbox already selected");
        }
    }
}



