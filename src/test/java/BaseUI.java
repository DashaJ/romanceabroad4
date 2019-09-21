import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    String mainUrl = "https://romanceabroad.com/";
    WebDriverWait wait;
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait =new WebDriverWait(driver, 20);
        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    public void getDropDownBirthDate(By locator, String value) {
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }

    public void getDropDownBirthMonth(By locator, int index) {
        Select select = new Select(driver.findElement(locator));
        select.selectByIndex(index);
    }

    public void getDropDownBirthYear(By locator, String text) {
        Select select = new Select(driver.findElement(locator));
        select.selectByVisibleText(text);
    }
    public static String generateNewNumber( String name, int lenght){
        return name + RandomStringUtils.random(lenght, "7979898");
    }
}