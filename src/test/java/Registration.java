import org.testng.annotations.Test;

public class Registration extends BaseUI {
    @Test
    public void RegistrationTest(){
        driver.findElement(Locators.REGISTRATION_BUTTON).click();
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.registration_email);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.registration_password);
        driver.findElement(Locators.NEXT_BUTTON).click();
        driver.findElement(Locators.USERNAME_FIELD).sendKeys(Data.username);
        driver.findElement(Locators.PASSWORD_FIELD).sendKeys(Data.password);

    }

}
