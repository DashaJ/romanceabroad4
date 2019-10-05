import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListsHomework {

    @Test
    public void arrayListString() {
        String phrase = "This list contains Gifts tab";
        List<String> listOfTabs = new ArrayList<>(Arrays.asList("Home", "How We Work", phrase, "Pretty Women", "Blog", "Sign In"));
        System.out.println(listOfTabs);
        for (int i = 0; i < listOfTabs.size(); i++) {
            String element = listOfTabs.get(i);
            System.out.println("Iteration" + i);
            if (element.contains("Gif")) {
                System.out.println(phrase);
            }
        }
    }

    @Test
    public void arrayListString1() {
        String phrase = "This list contains Gifts tab";
        List<String> listOfTabs = new ArrayList<>(Arrays.asList("Home", "How We Work", phrase, "Pretty Women", "Blog", "Sign In"));
        System.out.println(listOfTabs);

        for (int i = 0; i < listOfTabs.size(); i++) {

            System.out.println("Iteration" + i);
            if (listOfTabs.get(i).contains("Gif")) {
                System.out.println(listOfTabs.get(i));
            } else if (listOfTabs.get(i).contains("ZZZ")) {
                System.out.println("Succes");
            } else if (listOfTabs.get(i).equals("Blog")) {
                System.out.println("Succes");
            } else {
                System.out.println("Bad Loop");
            }
        }
    }

    @Test
    public void arrayListIntegers() {
        List<Integer> listOfPrices = new ArrayList<>(Arrays.asList(200, 500, 100, 300, 5000));
        int sum = listOfPrices.get(3) + listOfPrices.get(4);
        System.out.println(sum);
        listOfPrices.add(400);
        if (!listOfPrices.contains(500)) {
            System.out.println(listOfPrices.size());
        } else {
            System.out.println(sum + listOfPrices.get(5));
        }
    }
}

