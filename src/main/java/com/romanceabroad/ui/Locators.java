package com.romanceabroad.ui;

import org.openqa.selenium.By;

public class Locators {

    public static final By H1_TITLE= By.xpath("//h1");
    //Blog page
    public static final By LINK_BLOG = By.xpath("a[@href='https://romanceabroad.com/content/view/blog']");
    public static final By ODESSA_DATING_AGENCY_LINK = By.xpath("//div[@class='info-menu-inner']");
    public static final By BLOG_CATEGORIES = By.xpath("//div[@class='info-content-block wysiwyg']//ul//li");
    //Gifts page
    public static final By GIFTS_LINK = By.xpath("//a[contains(text(),'GIFTS')]");
    public static final By FLOWER_BASKET = By.xpath("//div[@class='text-overflow'][contains(text(),'Flower basket')]");
    //How we work page
    public static final By LINK_HOW_WE_WORK = By.xpath("//ul//a[contains(text(),'HOW WE WORK')]");
    public static final By LIST_OF_LINKS = By.xpath("//ul[@class='nav nav-pills nav-stacked content-pages-tree']//li");
    public static final By CAROUSEL_IMAGES = By.xpath("//div[contains(@class,'user-carousel-line')] ");
    //Main page
    public static final By REQUEST_TOUR_INFO = By.xpath("//a[@href='https://romanceabroad.com/REQUEST_TOUR_INFO+Application_Form.doc']");
    public static final By IFRAMELOCATOR = By.xpath("//iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By YOUTUBE_BUTTON = By.xpath("//div[@data-layer='4']//button[@class='ytp-large-play-button ytp-button']");
    public static final By JOIN_TODAY = By.xpath("//div[@class='col-lg-12 text-center']//a[@href='#']");
    public static final By LINK_SERACH = By.xpath("//a[@href='https://romanceabroad.com/users/search']");
    public static final By TABS_MAINPAGE = By.xpath("//ul[@clas='navbar_nav']//li/a");
    //Photos page
    public static final By LINK_PHOTOS = By.xpath("//a[@href='https://romanceabroad.com/media/index']");
    public static final By DROPDOWN_SORT_BY_PHOTOS = By.xpath("//span[@id='gallery_media_sorter']//select[@class='form-control']");
    public static final By LINK_TAB_USER_PROFILE= By.xpath("//ul[@id='gallery_filters']//a");
    public static final By TEXT_ON_VIDEO_TAB = By.xpath("//div[@class='g-flatty-block'");
    public static final By TEXT_ON_ALBUMS_TAB=By.xpath("//div[@class='main-inner-content']");
    public static final By ALBUMS_TABS = By.xpath("//span[@data-click='album']");
    //Search page
    public static final By SEARCH_BUTTON_ONSEARCHWIDGET = By.cssSelector("#main_search_button_user_advanced");
    public static final By DEFAULT_DROPDOWN = By.xpath("//div[@class='form-inline']//select");
    public static final By NEWS_ON_THE_FLYOUT = By.xpath("//a[@id='user_main-menu-news-item']");
    public static final By FLYOUT_MENU = By.xpath("//i[@class='fa fa-bars fa-lg item']");
    public static final By DROPDOWNLIST_SORT_BY = By.xpath("//div[@class='pull-left pl15']//select");
    public static final By DROPDOWNLIST_AGE_MIN = By.xpath("//div[@class='col-xs-5 no-padding-left']//select[@id='age_min']");
    public static final By DROPDOWNLIST_AGE_MAX = By.xpath("//div[@class='col-xs-5 no-padding-right']//select[@name='age_max']");
    public static final By CONTACT_US = By.xpath("//a[@id='footer_footer-menu-help-item_footer-menu-tickets-item']//div[1]");
    //Sign in Page
    public static final By LOGIN_ON_THE_FLYOUT = By.xpath("//a[@id='user_main-menu-login-item']");
    public static final By FACEBOOK_LINK = By.xpath("//a[@href='https://romanceabroad.com/users_connections/oauth_login/1']");
    public static final By FACEBOOK_LOGO = By.xpath("//i[contains(@class, 'fb_logo')]");
    //Registration page
    public static final By PAYPAL_LINK = By.xpath("//a[@class='btn btn-primary btn-block']");
    public static final By REGISTRATION_BUTTON = By.xpath("//button[@id='show-registration-block']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input#email");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input#password");
    public static final By NEXT_BUTTON = By.xpath("//div[@class='col-xs-12']//button[@class='btn btn-primary btn-block btn-lg'][contains(text(),'Next')] ");
    public static final By USERNAME_FIELD = By.cssSelector("input#nickname");

    public static final By LIST_DAYS = By.cssSelector("#daySelect");
    public static final By LIST_VALUE_DAYS = By.xpath("//li[@data-handler='selectDay']");
    public static final By LIST_MONTH = By.cssSelector("#monthSelect");
    public static final By LIST_VALUE_MONTH = By.xpath("//li[@data-handler='selectMonth']");
    public static final By LIST_YEAR = By.cssSelector("#yearSelect");
    public static final By LIST_VALUE_YEAR = By.xpath("//li[@data-handler='selectYear']");
    public static final By PHONE = By.xpath("//input[@name='data[phone]']");
    public static final By AUTO_FILLING_LOCATION = By.xpath("//input[@name='region_name']");
    public static final By LIST_VALUE_LOCATION = By.xpath("//div[@class='dropdown dropdown_location']//ul//li");
    public static final By CHECKBOX_CONFIRMATION = By.xpath("//input[@type='checkbox']");
    public static final By TOOLTIP_ERROR = By.xpath("//div[@class='tooltip']");

    //Contact Us Page
    public static final By LIST_REASON_VALUE = By.xpath("//select[@name='id_reason']//option");
    public static final By LIST_REASON = By.xpath("//select[@name='id_reason']");
    public static final By YOUR_NAME = By.xpath("//input[@name='user_name']");
    public static final By YOUR_EMAIL = By.xpath("//input[@name='user_email']");
    public static final By SUBJECT = By.xpath("//input[@name='subject']");
    public static final By MESSAGE = By.xpath("//div//div//textarea[@name='message']");
    public static final By SEND_BUTTON = By.xpath("//input[@value='Send']");
    public static final By ERROR_ALERT = By.xpath("//div[@class='error alert-danger alert-warning_pop_']");
    //Tours To Ukraine Page
    public static final By TOUR_TO_UKRAINE = By.xpath("//a[contains(text(),'TOUR TO UKRAINE')]");
    public static final By SEARCH_BUTTON_ON_TOURS_TO_UKRAINE_PAGE = By.cssSelector("button#search_friend");
    public static final By SEARCH_FIELD_ON_TOURS_TO_UKRAINE_PAGE = By.cssSelector("input#search_product");
    public static final By RESULT_OF_THE_SEARCH = By.xpath("//div[@class='store-main-block']//h2");
    //SIGN UP ON THE FLY OUT
    public static final By SIGN_UP_ON_THE_FLYOUT = By.xpath("//a[@id='user_main-menu-registration-item']");
    public static final By EMAIL_FIELD = By.xpath("//input[@name='email']");
    public static final By USERNAME_FIELD1 = By.xpath("//input[@name='nickname']");
    public static final By PASSWORD_FIELD1 = By.xpath("//input[@name='password']");
    public static final By DROPDOWNLIST_BIRTH_DATE = By.xpath("//div[@id='daySelect']//select");
    public static final By DROPDOWNLIST_BIRTH_MONTH = By.xpath("//div[@id='monthSelect']//select");
    public static final By DROPDOWNLIST_BIRTH_YEAR = By.xpath("//div[@id='yearSelect']//select");
    public static final By PHONE_FIELD = By.xpath("//div[@class='form-group']//input[@name='phone']");
    public static final By CHECKBOX_LATEST_NEWS = By.xpath("//div[@class='col-sm-6']//input");

    //Xpath com.romanceabroad.ui.Locators with 2 attributes
    //Search Page
    public static final By GALLERY_VIEW = By.xpath("//a[@title='Gallery view'][contains(text(),'Gallery view')]");
    //Gifts Page
    public static final By SPA = By.xpath("//div[@class='text-overflow'][contains(text(),'Spa')]");
    public static final By TEDDYBEAR_QUICK_VIEW = By.xpath("//div[@id='product_quick_view_2']//input[@class='btn btn-primary']");
    //Footer
    public static final By SITEMAP = By.xpath("//a[@id='footer_footer-menu-help-item_footer-menu-map-item']//div[@class='footer-menu-list-group-item-text']");
    //Gifts Page
    public static final By LANGUAGE_RUSSIAN = By.xpath("//li[@class='last']//a[contains(text(),'Русский')]");
    //Tour to Ukraine Page
    public static final By PAYPAL_BUTTON = By.xpath("//div[@class='mt20']//a[@class='btn btn-primary btn-block']");
    //News Page
    public static final By RSS_FEED = By.xpath("//div[@class='search-header']//a[@href='https://romanceabroad.com/news/rss']");


    // Xpath com.romanceabroad.ui.Locators with 2 parents
    public static final By ADD_PHOTO_ALBUMSPAGE = By.xpath("//div[@class='col-sm-6 col-md-3 b-album-filters__addfile']//div[@class='btn-group']//button[@type='button']");
    //Photos Page
    public static final By ALBUMS = By.xpath("//ul//li//a[@href='https://romanceabroad.com/media/albums']");
    //News Page
    public static final By MARRY_UKRANIAN_LADY = By.xpath("//div[@class='col-xs-12']//div[@class='breadcrumbs']//span[@itemprop='title']");


}
