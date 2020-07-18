import model.VoivodshipMapper;

import java.util.List;

public class App {
    public static void main(String[] args) {
        List<String> test = DataLoader.loadFile("TERC.csv");
        VoivodshipMapper.voivodshipMapper(test);
    }
}
