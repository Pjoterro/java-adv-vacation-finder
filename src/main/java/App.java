import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> test = DataLoader.fileLoad("TERC.csv");
        System.out.println(test.toString());
    }
}
