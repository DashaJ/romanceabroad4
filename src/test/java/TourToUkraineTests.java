import org.testng.annotations.Test;

public class TourToUkraineTests extends BaseUI {

    @Test
    public void testTourToUkrainePage() {
        tourToUkrainePage.getToTourToUkraine();
        tourToUkrainePage.performSearchOnItemAndVerifyResult();
        tourToUkrainePage.clickOnPaypal();
    }
}
