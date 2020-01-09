package com.romanceabroad.ui;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SignInTests extends BaseUI {
    public static final boolean testCase12 = true;

    @Test(dataProvider = "Sign In", dataProviderClass = DataProviders.class)

    public void testSignIn(String signinemail, String signinpassword, boolean requirment) {
        signInPage.signInCredentials(signinemail, signinpassword);

        driver.findElement(Locators.SUBMIT_SIGNIN).click();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='error alert-danger alert-warning_pop_']"))));
        if (!requirment) {
            driver.findElement(By.xpath("//div[@class='error alert-danger alert-warning_pop_']")).getText().contains("Login or password are incorrect, please try again");
            {
                System.out.println("Passed");
            }
        } else {
            System.out.println("Failed");
        }
    }

    @Test
    public void testSignInPageTestCase12() {
        mainPage.logInUsingFacebook();
        signInPage.getFacebookLogo();

        WebElement facebookLogo = driver.findElement(Locators.FACEBOOK_LOGO);
        if (facebookLogo.getText().contains("Facebook")) {
            System.out.println("Test Passed");
        } else {
            Assert.fail("User prompted to the wrong page");
        }
    }
}
