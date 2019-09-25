import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

public class BaseUI {
    String mainUrl = "https://romanceabroad.com/";
    WebDriverWait wait;
    WebDriver driver;
    MainClass mainPage;
    SearchPage searchpage;
    BlogPage blogpage;
    GiftsPage giftspage;
    HowWeWorkPage howweworkpage;
    PhotosPage photospage;
    RegistartionPage registrationpage;
    SignInPage signinpage;
    SignUpOnFlyOutPage signuponflyoutpage;
    TourToUkrainePage tourtoukrainepage;
    SoftAssert softAssert = new SoftAssert();



    @BeforeMethod

    @Parameters("browser")
    public void setup(@Optional("chrome") String browser, Method method){
// Check if parameter passed from TestNG is 'firefox'
        if (browser.equalsIgnoreCase("firefox")) {
// Create firefox instance
            System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
            driver = new FirefoxDriver();
        }
// Check if parameter passed as 'chrome'
        else if (browser.equalsIgnoreCase("chrome")) {
// Set path to chromedriverOLD.exe
            System.setProperty("webdriver.chrome.driver", "chromedriverNEW.exe");
// Create chrome instance
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");
        } else if (browser.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.manage().deleteAllCookies();

        } else {
            System.setProperty("webdriver.chrome.driver", "chromedriverNEW.exe");
            driver = new ChromeDriver();
            driver.get("chrome://settings/clearBrowserData");
        }

        wait =new WebDriverWait(driver, 20);
        mainPage= new MainClass(driver, wait);
        searchpage= new SearchPage(driver, wait);
        blogpage = new BlogPage(driver, wait);
        giftspage = new GiftsPage(driver, wait);
        howweworkpage = new HowWeWorkPage(driver, wait);
        photospage = new PhotosPage(driver, wait);
        registrationpage = new RegistartionPage(driver, wait);
        signinpage = new SignInPage(driver, wait);
        signuponflyoutpage = new SignUpOnFlyOutPage(driver, wait);
        tourtoukrainepage = new TourToUkrainePage(driver, wait);

        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}