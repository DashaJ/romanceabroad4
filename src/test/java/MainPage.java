import org.testng.annotations.Test;

public class MainPage extends BaseUI {


    @Test
    public void testMainPage() {
        mainPage.getToTheMainPage();
        mainPage.requestTourInfo();

    }
}
