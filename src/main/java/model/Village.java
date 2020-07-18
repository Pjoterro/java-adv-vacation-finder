package model;

public class Village extends Location {

    public Village(String name, String viovodeship) {
        super(name, viovodeship, LocationType.VILLAGE);
    }

    @Override
    public String sayGreeting() {
        return "Witaj we wsi " + this.getName();
    }
}
