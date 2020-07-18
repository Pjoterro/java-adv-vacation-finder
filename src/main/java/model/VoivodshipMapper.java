package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoivodshipMapper {

    public static Map<Integer, String> voivodshipMapper(List<String> input) {
        Map<Integer, String> voivodshipMap = new HashMap<>();
        input.stream()
                .filter(line -> line.contains("województwo"))
                .forEach(filteredLine -> {
                    String[] splitLine = filteredLine.split(";");
                    Integer number = Integer.valueOf(splitLine[0]);
                    String name = splitLine[4];
                    voivodshipMap.put(number, name);
                    });
                return voivodshipMap;
    }
}
