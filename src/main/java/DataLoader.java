import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataLoader {

    public static List<String> fileLoad(String filePath) {
        FileReader fileReader;
        try {
            fileReader = new FileReader(filePath);
        } catch (FileNotFoundException e) {
            System.out.println("Brak takiego pliku");
            return new ArrayList<>();
        }
        return new ArrayList<>(Arrays.asList(fileReader.toString().split("\\n")));
    }
}
