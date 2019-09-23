import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpOnFlyOutPage extends BaseActions {
    public SignUpOnFlyOutPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void getTotheSignUp() {
        driver.findElement(Locators.LINK_SERACH).click();
        driver.findElement(Locators.FLYOUT_MENU).click();
        driver.findElement(Locators.SIGN_UP_ON_THE_FLYOUT).click();
    }

    public void fillRegistrationInfoFirstStep() {
        driver.findElement(Locators.EMAIL_FIELD).sendKeys(Data.registration_email);
        driver.findElement(Locators.USERNAME_FIELD1).sendKeys(Data.username);
        driver.findElement(Locators.PASSWORD_FIELD1).sendKeys(Data.password);
    }

    public void fillRegistartionInfoSecondStep() {
        getDropDownBirthDate(Locators.DROPDOWNLIST_BIRTH_DATE, "25");
        getDropDownBirthMonth(Locators.DROPDOWNLIST_BIRTH_MONTH, 1);
        getDropDownBirthYear(Locators.DROPDOWNLIST_BIRTH_YEAR, "1988");
        driver.findElement(Locators.PHONE_FIELD).sendKeys("727272727");
    }

    public void checkboxesHandling() {
        WebElement checkboxConfirmationLatestNews = driver.findElement(Locators.CHECKBOX_LATEST_NEWS);
        boolean selectedCheckBox1 = checkboxConfirmationLatestNews.isSelected();
        System.out.println(selectedCheckBox1 + "!!!");
        checkboxConfirmationLatestNews.click();
        WebElement checkboxConfirmationOnSignupPage = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        boolean selectedCheckBox = checkboxConfirmationOnSignupPage.isSelected();
        System.out.println(selectedCheckBox + "!!!");
        checkboxConfirmationOnSignupPage.click();

    }
}


