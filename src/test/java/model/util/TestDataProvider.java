package model.util;

import java.util.List;
import java.util.Map;

public class TestDataProvider {
    public static final List<String> rawData() {

        return List.of(
                //"02;10;05;4;Olszyna;miasto;2020-01-01",
                "02;11;01;1;Lubin;gmina miejska;2020-01-01",
                "02;11;03;2;Rudna;gmina wiejska;2020-01-01",
                "02;11;04;3;Ścinawa;gmina miejsko-wiejska;2020-01-01"


        );
    }

    public static final Map<Integer, String> mappedVoivodeships() {
        return Map.of(
                2, "DOLNOŚLĄSKIE",
                20, "PODLASKIE",
                22, "POMORSKIE"
        );
    }
}
