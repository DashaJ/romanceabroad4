package com.romanceabroad.ui;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class BaseActions {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public static String generateNewNumber(String name, int lenght) {
        return name + RandomStringUtils.random(lenght, "7979898");
    }

    //Method for random choice of DropDown
    public void selectItemDropDownRandomOption(By locator, String dropDownName) {
        try {
            WebElement element = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true) ;", element);
            Select select = new Select(driver.findElement(locator));
            select.selectByIndex((int) (Math.random() * (select.getOptions().size() - 1)) + 1);
            System.out.println(dropDownName + ": " + select.getFirstSelectedOption().getText());
        } catch (NoSuchElementException e) {
        }
    }

    public int getSizeDropDownList(By locator) {
        try {
            WebElement element = driver.findElement(locator);
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true) ;", element);
            Select select = new Select(driver.findElement(locator));
            return select.getOptions().size();

        } catch (NoSuchElementException e) {
            System.out.println("getSizeDropDownList error");
        }
        return 0;
    }
    public void getDropDownListByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void getDropDownListByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void getDropDownByValue(By locator, String value) {
        Select select = new Select(driver.findElement(locator));
        select.selectByValue(value);
    }

    public void getDropDownListByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
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
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void ajaxClick(By by) {
        wait.until(ExpectedConditions.elementToBeClickable(by));
        ajaxClick(driver.findElement(by));
    }
    public void scrollToBottomOfPage(){
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
    public void ajaxScroll(WebElement element){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void checkValueOfLists(By locator, String text) {
        Reports.log("Collect elements in a list");
        List<WebElement> elements = driver.findElements(locator);
        Reports.log("Start looping");
        for (int i = 0; i < elements.size(); i++) {
            Reports.log("Select new element from the list");
            WebElement elementOfList = elements.get(i);
            String value = elementOfList.getText();
            if (value.contains(text)) {
                Reports.log("Wait for the list be clickable");
                wait.until(ExpectedConditions.elementToBeClickable(elementOfList));
                Reports.log("Click on new element inteh list");
                elementOfList.click();
            }
        }
    }
    public void performClick(By locator) {
        WebElement element = driver.findElement(locator);
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }
    public void performClick(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
        actions.click().build().perform();
    }

    public void javaWaitSec(int sec) {
        System.out.println("");
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void ajaxKeys(WebElement element, String text) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true) ;", element);
    }

    public void checkLinksOnWebPage(String typElement, String attribute) {
        List<WebElement> links = driver.findElements(By.xpath(typElement));

        System.out.println("Starting crawling links");
        for (int i = 0; i < links.size(); i++) {
            WebElement ele = links.get(i);
            String url = ele.getAttribute(attribute);
            verifyLinkActive(url);
        }
        System.out.println("Total links are " + links.size());
    }

    //Method for links verification
    public void verifyLinkActive(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() == 200) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            } else if (httpURLConnect.getResponseCode() >= 400 && httpURLConnect.getResponseCode() <= 504) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - " + httpURLConnect.getResponseMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getAnyTitle(){
        String title = driver.findElement(Locators.H1_TITLE).getText();
        return title;
    }

}


