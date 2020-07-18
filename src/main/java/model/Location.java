package model;

public abstract class Location {
    private String name;
    private String viovodeship;
    private LocationType type;

    public String getName() {
        return name;
    }

    public String getViovodeship() {
        return viovodeship;
    }

    public LocationType getType() {
        return type;
    }

    public Location(String name, String viovodeship, LocationType type) {
        this.name = name;
        this.viovodeship = viovodeship;
        this.type = type;
    }

    public abstract String sayGreeting();
}
