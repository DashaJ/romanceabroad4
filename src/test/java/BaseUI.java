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
    MainPage mainPage;
    SearchPage searchPage;
    BlogPage blogPage;
    GiftsPage giftsPage;
    HowWeWorkPage howWeWorkPage;
    PhotosPage photosPage;
    RegistartionPage registrationPage;
    SignInPage signInPage;
    SignUpOnFlyOutPage signUpOnFlyOutPage;
    ContactUsPage contactUsPage;
    TourToUkrainePage tourToUkrainePage;
    SoftAssert softAssert = new SoftAssert();


    @BeforeMethod(groups = {"search","admin", "user"}, alwaysRun = true)

    @Parameters("browser")
    public void setup(@Optional("chrome") String browser, Method method){
// Check if parameter passed from TestNG is 'firefox'
        if (browser.equalsIgnoreCase("firefox")) {
// Create firefox instance
            System.setProperty("webdriver.gecko.driver", "geckodriver0.26.exe");
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
        mainPage= new MainPage(driver, wait);
        searchPage= new SearchPage(driver, wait);
        blogPage = new BlogPage(driver, wait);
        giftsPage = new GiftsPage(driver, wait);
        howWeWorkPage = new HowWeWorkPage(driver, wait);
        photosPage = new PhotosPage(driver, wait);
        registrationPage = new RegistartionPage(driver, wait);
        signInPage = new SignInPage(driver, wait);
        signUpOnFlyOutPage = new SignUpOnFlyOutPage(driver, wait);
        tourToUkrainePage = new TourToUkrainePage(driver, wait);
        contactUsPage = new ContactUsPage(driver, wait);

        driver.manage().window().maximize();
        driver.get(mainUrl);
    }

    //@AfterMethod
    //public void tearDown() {
       // driver.quit();
    }

//}