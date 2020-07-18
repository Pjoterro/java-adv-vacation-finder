package model;

public class City extends Location {

    public City(String name, String viovodeship) {
        super(name, viovodeship, LocationType.CITY);
    }

    @Override
    public String sayGreeting() {
        return "Witaj w miescie " + this.getName();
    }
}
