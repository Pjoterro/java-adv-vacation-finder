import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DataLoader {

    public static List<String> loadFile(String path) {
        List<String> loadedRows = new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                loadedRows.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File not found: " + path);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error accessing file: " + path);
        }
        return loadedRows;
    }

}
