import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class  BaseActions {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait){
        this.driver=driver;
        this.wait = wait;
    }
    public static String generateNewNumber( String name, int lenght){
        return name + RandomStringUtils.random(lenght, "7979898");
    }
    public void getDropDownByValue(By locator, String value) {
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }
    public void getDropDownByText(By locator, String text) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }
    public void getDropDownByIndex(By locator, int index) {
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }
    public void ajaxClick(WebElement element) {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void ajaxClick(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElement(by));
    }
}
