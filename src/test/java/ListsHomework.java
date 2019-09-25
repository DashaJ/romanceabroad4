import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListsHomework {

    @Test
    public void arrayListwithString () {
        List<String> listOfTabs = new ArrayList<>(Arrays.asList("Home", "How We Work", "Pretty Women", "Photos", "Gifts", "Tour To Ukraine", "Blog", "Sign In"));
        if (listOfTabs.contains("Gifts")) {
            System.out.println(listOfTabs);
        }
    }
        @Test
        public void arrayIntegersList(){
            List<Integer> listOfPrices = new ArrayList<>(Arrays.asList(200, 500, 100, 300, 5000));
            int sum = listOfPrices.get(3)+listOfPrices.get(4);
            System.out.println(sum);
        }

        }


