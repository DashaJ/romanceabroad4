import org.openqa.selenium.By;

public class Locators {
    //Blog page
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    public static final By ODESSA_DATING_AGENCY_LINK = By.xpath("//div[@class='info-menu-inner']");
    //Gifts page
    public static final By GIFTS_LINK = By.xpath("//a[contains(text(),'GIFTS')]");
    public static final By FLOWER_BASKET = By.xpath("//div[@class='text-overflow'][contains(text(),'Flower basket')]");
    //How we work page
    public static final By LINK_HOW_WE_WORK = By.xpath("//ul//a[contains(text(),'HOW WE WORK')]");
    public static final By ADVERTISING_LINK = By.xpath("//div[contains(text(),'Advertising')]");
    public static final By LIST_OF_LINKS = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li");
    public static final By CAROUSEL_IMAGES = By.xpath("//div[contains(@class,'user-carousel-line')] ");
    //Main page
    public static final By REQUEST_TOUR_INFO = By.xpath("//a[@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
    public static final By IFRAMELOCATOR = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By YOUTUBE_BUTTON = By.xpath("//div[@data-layer='4']//button[@class='ytp-large-play-button ytp-button']");
    //Photos page
    public static final By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    public static final By DROPDOWN_SORT_BY_PHOTOS = By.xpath("//span[@id='gallery_media_sorter']//select[@class='form-control']");
    //Search page
    public static final By SEARCH_BUTTON_OnTheSearchWidget = By.cssSelector("#main_search_button_user_advanced");
    public static final By LINK_SERACH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By GALLERY_VIEW = By.xpath("//a[@title='Gallery view']");
    public static final By NEWS_ON_THE_FLYOUT = By.xpath("//a[@id='user_main-menu-news-item']");
    public static final By FLYOUT_MENU = By.xpath("//i[@class='fa fa-bars fa-lg item']");
    public static final By DROPDOWNLIST_SORT_BY = By.xpath("//div[@class='pull-left pl15']//select");
    public static final By DROPDOWNLIST_AGE_MIN = By.xpath("//div[@class='col-xs-5 no-padding-left']//select");
    public static final By DROPDOWNLIST_AGE_MAX = By.xpath("//div[@class='col-xs-5 no-padding-right']//select");
    //Sign in Page
    public static final By LOGIN_ON_THE_FLYOUT = By.xpath("//a[@id='user_main-menu-login-item']");
    public static final By FACEBOOK_LINK = By.xpath("//i[@class='fa fa-facebook-official']");
    //Registration page
    public static final By PAYPAL_LINK = By.xpath("//a[@class='btn btn-primary btn-block']");
    public static final By REGISTRATION_BUTTON = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By NEXT_BUTTON = By.xpath("//div[@class='col-xs-12']//button[@class='btn btn-primary btn-block btn-lg'][contains(text(),'Next')] ");
    public static final By USERNAME_FIELD = By.cssSelector("input#nickname");
    public static final By CLICK_ON_DATE_FIELD = By.cssSelector("#daySelect");
    public static final By BIRTH_DATE = By.xpath("//li[@data-handler='selectDay']//a[text()='2']");
    public static final By CLICK_ON_MONTH_FIELD = By.cssSelector("#monthSelect");
    public static final By MONTH_DATE = By.xpath("//li[@data-handler='selectMonth']//a[text()='Feb']");
    public static final By CLICK_ON_YEAR_FIELD = By.cssSelector("#yearSelect");
    public static final By YEAR_DATE = By.xpath("//li[@data-handler='selectYear']//a[text()='1990']");
    public static final By PHONE = By.xpath("//input[@name='data[phone]']");
    public static final By CHECKBOX_CONFIRMATION = By.cssSelector("input#confirmation");
    //Tours To Ukraine Page
    public static final By TOUR_TO_UKRAINE = By.xpath("//a[contains(text(),'TOUR TO UKRAINE')]");
    public static final By SEARCH_BUTTON_ON_TOURS_TO_UKRAINE_PAGE = By.cssSelector("button#search_friend");
    public static final By SEARCH_FIELD_ON_TOURS_TO_UKRAINE_PAGE = By.cssSelector("input#search_product");
    public static final By RESULT_OF_THE_SEARCH = By.xpath("//div[@class='store-main-block']//h2");
    //SIGN UP ON THE FLY OUT
    public static final By SIGN_UP_ON_THE_FLYOUT = By.xpath("//a[@id='user_main-menu-registration-item']");
    public static final By EMAIL_FIELD= By.xpath("//input[@name='email']");
    public static final By USERNAME_FIELD1= By.xpath("//input[@name='nickname']");
    public static final By PASSWORD_FIELD1= By.xpath("//input[@name='password']");
    public static final By DROPDOWNLIST_BIRTH_DATE = By.xpath("//div[@id='daySelect']//select");
    public static final By DROPDOWNLIST_BIRTH_MONTH = By.xpath("//div[@id='monthSelect']//select");
    public static final By DROPDOWNLIST_BIRTH_YEAR = By.xpath("//div[@id='yearSelect']//select");
    public static final By PHONE_FIELD = By.xpath("//div[@class='form-group']//input[@name='phone']");
    public static final By CHECKBOX_LATEST_NEWS = By.cssSelector("input#sub1");
}
