package com.romanceabroad.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class RegistartionPage extends BaseActions {
    public RegistartionPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void registrationFirstStep(String registrationemail, String registrationpassword) {
        driver.findElement(Locators.TEXT_FIELD_EMAIL).sendKeys(registrationemail);
        driver.findElement(Locators.TEXT_FIELD_PASSWORD).sendKeys(registrationpassword);
    }
   public void clickNextButton(){
       wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.NEXT_BUTTON)));
       driver.findElement(Locators.NEXT_BUTTON).click();

   }

    public void completeSecondRegistartionStep(String username, String days, String month, String year, String phone
                                               ) {
        driver.findElement(Locators.USERNAME_FIELD).sendKeys(username);

        driver.findElement(Locators.LIST_DAYS).click();
        checkValueOfLists(Locators.LIST_VALUE_DAYS, days);

        driver.findElement(Locators.LIST_MONTH).click();
        checkValueOfLists(Locators.LIST_VALUE_MONTH, month);

        driver.findElement(Locators.LIST_YEAR).click();
        checkValueOfLists(Locators.LIST_VALUE_YEAR, year);

        driver.findElement(Locators.PHONE).sendKeys(phone);

}
    public void checkValueOfLists(By locator, String text) {
        List<WebElement> elements = driver.findElements(locator);
        for (int i = 0; i < elements.size(); i++) {
            WebElement elementOfList = elements.get(i);
            String value = elementOfList.getText();
            if (value.contains(text)) {
                elementOfList.click();
            }

        }

    }
}
/*public void clickSpecificLocation(String location){
        List<WebElement>locations =driver.findElements(By.xpath("//div[@class='dropdown dropdown_location']//ul//li"));
    for (int i = 0; i <locations.size(); i++) {
        if (locations.get(i).getText().contains(location));
        locations.get(i).click();
    }*/
