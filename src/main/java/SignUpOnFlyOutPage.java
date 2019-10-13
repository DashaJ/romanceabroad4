import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUpOnFlyOutPage extends BaseActions {
    public SignUpOnFlyOutPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }



    public void fillRegistrationInfoFirstStep() {
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.EMAIL_FIELD)));
        driver.findElement(Locators.EMAIL_FIELD).sendKeys(Data.registration_email);
        driver.findElement(Locators.USERNAME_FIELD1).sendKeys(Data.username);
        driver.findElement(Locators.PASSWORD_FIELD1).sendKeys(Data.password);
    }

    public void fillRegistartionInfoSecondStep() {
        getDropDownByValue(Locators.DROPDOWNLIST_BIRTH_DATE, "25");
        getDropDownByIndex(Locators.DROPDOWNLIST_BIRTH_MONTH, 1);
        getDropDownByText(Locators.DROPDOWNLIST_BIRTH_YEAR, "1988");
        driver.findElement(Locators.PHONE_FIELD).sendKeys("727272727");
    }

}



