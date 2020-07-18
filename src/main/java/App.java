import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> test = DataLoader.loadFile("TERC.csv");
        System.out.println(test);

    }
}
