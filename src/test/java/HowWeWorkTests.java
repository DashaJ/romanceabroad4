import org.testng.annotations.Test;

public class HowWeWorkTests extends BaseUI {
    @Test
    public void testHowWeWorkPage() {
        howweworkpage.GetToHowWeWorkPage();
        howweworkpage.advertisingLink();
    }

}
