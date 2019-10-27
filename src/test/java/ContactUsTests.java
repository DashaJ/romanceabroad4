import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ContactUsTests extends BaseUI {
    @DataProvider(name = "ContactUs")
    public static Object[][] testContactUs() throws Exception{
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("ContactUs.csv")).stream().forEach(s->{
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4],});
        });
        return out.toArray(new Object[out.size()][]);
    }
    public static final boolean testCase15 = true;
    @Test(dataProvider = "ContactUs")
    //(priority= 1, enabled = testCase15, groups ={"regression"})
    public void contactUstestCase15(String reasontext ,String yourname,String registration_email,String subject,String messagetext){
        contactUsPage.getToContactUsPage();
    contactUsPage.fillTextFields(reasontext,yourname,registration_email,subject,messagetext);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.ERROR_ALERT)));
        WebElement alertMessageelement = driver.findElement(Locators.ERROR_ALERT);
        alertMessageelement.getText();

        if (alertMessageelement.equals("Please enter security code")) {
            System.out.println("true");

        } else {
            System.out.println("false");
        }
    }
}
