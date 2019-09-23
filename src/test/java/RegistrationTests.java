import org.testng.annotations.Test;

public class RegistrationTests extends BaseUI {
    @Test
    public void RegistrationTest() {
        registrationpage.clickjoinForFreeNow();
        registrationpage.registrationFirstStep();
        registrationpage.completeFirstRegistartionStep();
        registrationpage.completeSecondRegistartionStep();


    }

}
