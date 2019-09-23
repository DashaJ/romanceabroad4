import org.testng.annotations.Test;

public class TourToUkraineTests extends BaseUI {

    @Test
    public void testTourToUkrainePage() {
        tourtoukrainepage.getToTourToUkraine();
        tourtoukrainepage.performSearchOnItemAndVerifyResult();
        tourtoukrainepage.clickOnPaypal();
    }
}
