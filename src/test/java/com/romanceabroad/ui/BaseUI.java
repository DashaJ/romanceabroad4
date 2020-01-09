package com.romanceabroad.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITest;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

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

    protected TestBox testBox;
    protected TestBrowser testBrowser;

    protected enum TestBox {
        WEB, MOBILE, SAUCE
    }

    protected enum TestBrowser{
        CHROME, FIREFOX, IE, REMOTE_CHROME, REMOTE_FIREFOX
    }
    @BeforeMethod
    @Parameters({"browser", "testbox", "platform","version","deviceName", "testEnv"})

    public void setup(@Optional("chrome") String browser, @Optional("web") String box,
                      @Optional("null") String platform,
                      @Optional("null") String version, @Optional("null") String device,
                      @Optional("qa") String env,
                      Method method, ITestContext context) throws MalformedURLException {
        Reports.start(method.getDeclaringClass().getName() + " :" + method.getName());

        if (box.equalsIgnoreCase( "web")) {
            testBox = TestBox.WEB;
            if (box.equalsIgnoreCase("mobile")) {
                testBox = TestBox.MOBILE;
            } else if (box.equalsIgnoreCase("sauce")) {
                testBox = TestBox.SAUCE;
            }

            if (box.equalsIgnoreCase("chrome")) {
                testBrowser = TestBrowser.CHROME;
            } else if (box.equalsIgnoreCase("firefox")) {
                testBrowser = TestBrowser.FIREFOX;
            } else if (box.equalsIgnoreCase("ie")) {
                testBrowser = TestBrowser.IE;
            } else if (box.equalsIgnoreCase("remoteChrome")) {
                testBrowser = TestBrowser.REMOTE_CHROME;
            } else if (box.equalsIgnoreCase("remoteFirefox")) {
                testBrowser = TestBrowser.REMOTE_FIREFOX;
            }

            switch (testBox) {
                case WEB:
                    switch (testBrowser) {
                        case FIREFOX:
                            System.setProperty("webdriver.gecko.driver", "geckodriver0.26.exe");
                            driver = new FirefoxDriver();
                            break;

                        case CHROME:
                            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                            driver = new ChromeDriver();
                            driver.get("chrome://settings/clearBrowserData");
                            break;

                        case IE:
                            System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
                            driver = new InternetExplorerDriver();
                            driver.manage().deleteAllCookies();
                            break;

                        case REMOTE_CHROME:
                            System.out.println("Remote chrome");
                            ChromeOptions chromeOptions = new ChromeOptions();
                            chromeOptions.addArguments(" --headless");
                            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
                            break;

                        case REMOTE_FIREFOX:
                            System.out.println("Remote firefox");
                            FirefoxOptions firefoxOptions = new FirefoxOptions();
                            firefoxOptions.addArguments(" --headless");
                            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), firefoxOptions);
                            break;

                        default:
                            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
                            driver = new ChromeDriver();
                            driver.get("chrome://settings/clearBrowserData");
                            break;

                    }

                    case SAUCE:
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setCapability("username", "DashaJ");
                    capabilities.setCapability("accessKey", "181a1fe6-4642-468f-9a57-5cb8a81420a5");
                    capabilities.setCapability("browserName", browser);
                    capabilities.setCapability("platform", platform);
                    capabilities.setCapability("version", version);
                    capabilities.setCapability("name", "method.getName())");
                    driver = new RemoteWebDriver(
                            new URL("http://" + System.getenv("SAUCE_USERNAME") + ":" + System.getenv("SAUCE_ACCESS_KEY") + "@ondemand.saucelabs.com:80/wd/hub"), capabilities);

                    break;
            }}


                    wait = new WebDriverWait(driver, 20);
                    mainPage = new MainPage(driver, wait);
                    searchPage = new SearchPage(driver, wait);
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

                    PageFactory.initElements(driver, signInPage);
            }

    @AfterMethod
    public void afterActions(ITestResult testResult){
                if (testResult.getStatus() == ITestResult.FAILURE) {
                    Reports.fail(driver, testResult.getName());
                }
                Reports.stop();
                driver.quit();
            } }