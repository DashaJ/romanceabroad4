import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RegistrationTests extends BaseUI {

    @DataProvider(name = "Registration1")
    public static Object[][] testRegistration1() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("RegistrationData.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6]
            });
        });
        return out.toArray(new Object[out.size()][]);
    }

    public static final boolean testCase9 = true;

    @Test(dataProvider = "Registration1")
    //(priority= 1, enabled = testCase9, groups ={"smoke"})
    public void registrationTestCase9(String registration_email, String registration_password, String day, String month, String year, String phone,String city) {
        mainPage.clickjoinForFreeNow();
        registrationPage.registrationFirstStep(registration_email, registration_password);
        registrationPage.completeSecondRegistartionStep(mainPage.generateNewNumber(Data.username, 5), day, month,
                year, phone, city);
        mainPage.ajaxClick(driver.findElement(By.xpath("//li[@city='355536']")));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(Locators.CHECKBOX_CONFIRMATION)));
        WebElement checkboxConfirmation = driver.findElement(Locators.CHECKBOX_CONFIRMATION);
        if (!driver.findElement(Locators.CHECKBOX_CONFIRMATION).isSelected()) {
            checkboxConfirmation.click();
        } else {
            Assert.fail("Checkbox already selected");
        }
    }
}



