package model;

import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class VoivodshipMapperTest {

    @Test
    public void testMapping() {
        //given
        List<String> rawData = List.of(
                "02;;;;DOLNOŚLĄSKIE;województwo;2020-01-01",
                "02;01;;;bolesławiecki;powiat;2020-01-01",
                "02;01;01;1;Bolesławiec;gmina miejska;2020-01-01",
                "02;01;02;2;Bolesławiec;gmina wiejska;2020-01-01",
                "24;78;;;Zabrze;miasto na prawach powiatu;2020-01-01",
                "24;78;01;1;Zabrze;gmina miejska;2020-01-01",
                "24;79;;;Żory;miasto na prawach powiatu;2020-01-01",
                "24;79;01;1;Żory;gmina miejska;2020-01-01",
                "26;;;;ŚWIĘTOKRZYSKIE;województwo;2020-01-01",
                "26;01;;;buski;powiat;2020-01-01",
                "26;01;01;3;Busko-Zdrój;gmina miejsko-wiejska;2020-01-01",
                "26;01;01;4;Busko-Zdrój;miasto;2020-01-01",
                "26;01;01;5;Busko-Zdrój;obszar wiejski;2020-01-01",
                "26;01;02;2;Gnojno;gmina wiejska;2020-01-01",
                "26;01;03;3;Nowy Korczyn;gmina miejsko-wiejska;2020-01-01",
                "26;01;03;4;Nowy Korczyn;miasto;2020-01-01"
        );
        //when
        Map<Integer, String> result = VoivodshipMapper.voivodshipMapper(rawData);
        //then
        assertEquals(2, result.size());
        assertTrue(result.containsValue("ŚWIĘTOKRZYSKIE"));

    }

}