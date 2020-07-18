package model;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LocationMapper {

    public static List<Location> mapLocations (List<String> rawLines, Map<Integer, String> voivodeships) {
        return rawLines.stream()
                .filter(lines -> lines.contains("gmina"))
                .map(filteredLine -> mapRow(filteredLine, voivodeships))
                .collect(Collectors.toList());
    }

    private static Location mapRow(String line, Map<Integer, String> voivodeships) {
        String[] splitLines = line.split(";");
        String type = splitLines[5];
        String name = splitLines[4];
        Integer voiNumber = Integer.valueOf(splitLines[0]);
        String voiName = voivodeships.get(voiNumber);
        switch (type) {
            case "gmina miejska":
                return new City(name, voiName);
            case "gmina wiejska":
                return new Village(name, voiName);
            case "gmina miejsko-wiejska":
                return new UrbanRural(name, voiName);
            default:
                throw new IllegalArgumentException();
        }

    }
}
