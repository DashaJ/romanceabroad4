import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "Registration2")
    public static Object[][] testRegistration2() {
        return new Object[][]{
                {Data.email1,Data.nickname,true},
                {Data.email2,Data.nickname, false},
                {Data.email3,Data.nickname, true},

        };
    }
    @org.testng.annotations.DataProvider(name = "Registration1")
    public static Object[][] testRegistration1() throws Exception {
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("RegistrationData.csv")).stream().forEach(s -> {
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4], data[5], data[6]
            });
        });
        return out.toArray(new Object[out.size()][]);
    }
    @org.testng.annotations.DataProvider(name = "ContactUs")
    public static Object[][] testContactUs() throws Exception{
        ArrayList<Object[]> out = new ArrayList<>();
        Files.readAllLines(Paths.get("ContactUs.csv")).stream().forEach(s->{
            String[] data = s.split(",");
            out.add(new Object[]{data[0], data[1], data[2], data[3], data[4],});
        });
        return out.toArray(new Object[out.size()][]);
    }
}



