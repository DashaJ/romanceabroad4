import org.openqa.selenium.By;

public class Locators {
    //Blog page
    public static final By LINK_BLOG = By.cssSelector("a[href='https://romanceabroad.com/content/view/blog']");
    public static final By ODESSA_DATING_AGENCY_LINK = By.xpath("//div[@class='info-menu-inner']");
    public static final int indexOdessaDatingAgency = 4;
    //Gifts page
    public static final By GIFTS_LINK = By.xpath("//a[contains(text(),'GIFTS')]");
    //How we work page
    public static final By LINK_HOW_WE_WORK = By.cssSelector("a[href='https://romanceabroad.com/content/view/how-it-works']");
    public static final By ADVERTISING_LINK = By.xpath("//div[contains(text(),'Advertising')]");
    //Main page
    public static final By SIGN_IN_OnNavBar = By.xpath("//ul[@class='navbar-nav']//li//a[@href='https://romanceabroad.com/users/login_form']");
    public static final By REQUEST_TOUR_INFO = By.xpath("//a[@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
    //Photos page
    public static final By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    //Search page
    public static final By SEARCH_BUTTON_OnTheSearchWidget = By.cssSelector("#main_search_button_user_advanced");
    public static final By LINK_SERACH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By GALLERY_VIEW = By.xpath("//a[@title='Gallery view']");
    public static final By NEWS_ON_THE_FLYOUT = By.xpath("//a[@id='user_main-menu-news-item']");
    public static final By FLYOUT_MENU = By.xpath("//i[@class='fa fa-bars fa-lg item']");
    //public static final By DROPDOWNLIST_SORT_BY = By.xpath("//div[@class='pull-left pl15']//select";
    //Sign in Page
    public static final By LOGIN_ON_THE_FLYOUT = By.xpath("//a[@id='user_main-menu-login-item']");
    public static final By FACEBOOK_LINK = By.xpath("//i[@class='fa fa-facebook-official']");
    //Registration page
    public static final By PAYPAL_LINK = By.xpath("//a[@class='btn btn-primary btn-block']");
    public static final By REGISTRATION_BUTTON = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By NEXT_BUTTON = By.xpath("//div[@class='col-xs-12']//button[@class='btn btn-primary btn-block btn-lg'][contains(text(),'Next')] ");
    public static final By USERNAME_FIELD = By.cssSelector("#nickname");
    public static final By PASSWORD_FIELD = By.xpath("//input[@name='data[phone]']");
    //Tours To Ukraine Page
    public static final By TOUR_TO_UKRAINE = By.xpath("//a[contains(text(),'TOUR TO UKRAINE')]");
    public static final By SEARCH_BUTTON_ON_TOURS_TO_UKRAINE_PAGE = By.cssSelector("button#search_friend");
    public static final By SEARCH_FIELD_ON_TOURS_TO_UKRAINE_PAGE = By.cssSelector("input#search_product");
    public static final By RESULT_OF_THE_SEARCH = By.xpath("//div[@class='store-main-block']//h2");
}
