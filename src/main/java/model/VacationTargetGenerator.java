package model;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class VacationTargetGenerator {

    public static Location getRandomLocation(List<Location> location) {
        int randomNumber = new Random().nextInt(location.size());
        return location.get(randomNumber);
    }

    public static Location getRandomLocation(List<Location> locations, LocationType wantedType) {
        List<Location> collect = locations.stream()
                .filter(loc -> loc.getType() == wantedType)
                .collect(Collectors.toList());
        return getRandomLocation(collect);

    }
}
