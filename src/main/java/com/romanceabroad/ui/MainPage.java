package com.romanceabroad.ui;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MainPage extends BaseActions {

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void youtubeButton(){
        ajaxClick(driver.findElement(Locators.YOUTUBE_BUTTON));
    }

    public void requestTourInfo() {
        driver.findElement(Locators.REQUEST_TOUR_INFO).click();
    }
    public void getToTheBlogPage() {
        driver.findElement(Locators.LINK_BLOG).click();
    }
    public void getToGiftsPage() {
        driver.findElement(Locators.GIFTS_LINK).click();
    }
    public void getToHowWeWorkPage() {
        driver.findElement(Locators.LINK_HOW_WE_WORK).click();
    }

    public void getToPhotosPage() {
        driver.findElement(Locators.LINK_PHOTOS).click();
    }

    public void clickjoinForFreeNow() {
        driver.findElement(Locators.REGISTRATION_BUTTON).click();
    }

    public void getToSearchPeoplePage() {
        driver.findElement(Locators.LINK_SERACH).click();
    }

    public void logInUsingFacebook() {
        driver.findElement(Locators.LINK_SERACH).click();
        driver.findElement(Locators.FLYOUT_MENU).click();
        driver.findElement(Locators.LOGIN_ON_THE_FLYOUT).click();
    }
    public void getTotheSignUpOnFlyOut() {
        driver.findElement(Locators.LINK_SERACH).click();
        driver.findElement(Locators.FLYOUT_MENU).click();
        driver.findElement(Locators.SIGN_UP_ON_THE_FLYOUT).click();
    }
    public void getToTourToUkraine() {
        driver.findElement(Locators.TOUR_TO_UKRAINE).click();
    }
    }
