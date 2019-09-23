import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseUI {
    String mainUrl = "https://romanceabroad.com/";
    WebDriverWait wait;
    WebDriver driver;
    MainPage mainPage;
    SearchPage searchpage;
    BlogPage blogpage;
    GiftsPage giftspage;
    HowWeWorkPage howweworkpage;
    PhotosPage photospage;
    RegistartionPage registrationpage;
    SignInPage signinpage;
    SignUpOnFlyOutPage signuponflyoutpage;
    TourToUkrainePage tourtoukrainepage;


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        wait =new WebDriverWait(driver, 20);
        mainPage= new MainPage(driver, wait);
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