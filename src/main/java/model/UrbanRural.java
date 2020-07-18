package model;

public class UrbanRural extends Location {

    public UrbanRural(String name, String viovodeship) {
        super(name, viovodeship, LocationType.URBAN_RURAL);
    }

    @Override
    public String sayGreeting() {
        return "Witaj w gminie miejsko-wiejskiej " + this.getName();
    }
}
