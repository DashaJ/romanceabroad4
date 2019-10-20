import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactUsPage extends BaseActions {

    public ContactUsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void getToContactUsPage() {
        driver.findElement(Locators.LINK_SERACH).click();
        scrollToBottomOfPage();
        ajaxClick(Locators.CONTACT_US);
    }

    public void fillTextFields() {
        driver.findElement(Locators.LIST_REASON).click();
        checkValueOfLists(Locators.LIST_REASON_VALUE, Data.reasontext);
        driver.findElement(Locators.YOUR_NAME).sendKeys(Data.yourname);
        driver.findElement(Locators.YOUR_EMAIL).sendKeys(Data.registration_email);
        driver.findElement(Locators.SUBJECT).sendKeys(Data.subject);
        driver.findElement(Locators.MESSAGE).sendKeys(Data.messagetext);
        driver.findElement(Locators.SEND_BUTTON).click();
    }
}


