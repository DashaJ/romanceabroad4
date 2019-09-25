import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class RegistartionPage extends BaseActions {
    public RegistartionPage(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

public void clickjoinForFreeNow (){
    driver.findElement(Locators.REGISTRATION_BUTTON).click();
}
public void registrationFirstStep(){
    driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(Data.registration_email);
    driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(Data.registration_password);
    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.NEXT_BUTTON)));
    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}
public void completeFirstRegistartionStep(){
    driver.findElement(Locators.NEXT_BUTTON).click();
}
public void completeSecondRegistartionStep(){
    driver.findElement(Locators.USERNAME_FIELD).sendKeys(generateNewNumber(Data.username, 10));
    driver.findElement(Locators.CLICK_ON_DATE_FIELD).click();
    driver.findElement(Locators.BIRTH_DATE).click();
    driver.findElement(Locators.CLICK_ON_MONTH_FIELD).click();
    driver.findElement(Locators.MONTH_DATE).click();
    driver.findElement(Locators.CLICK_ON_YEAR_FIELD).click();
    driver.findElement(Locators.YEAR_DATE).click();
    driver.findElement(Locators.PHONE).sendKeys(Data.phone);

}
}
