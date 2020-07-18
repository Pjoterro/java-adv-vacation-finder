package model;

import model.util.TestDataProvider;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class LocationMapperTest {

    @Test
    public void testMapping() {
        //given
        List<String> rawData = TestDataProvider.rawData();
        Map<Integer, String> mappedVoivodeships = TestDataProvider.mappedVoivodeships();
        //when
        List<Location> locations = LocationMapper.mapLocations(rawData, mappedVoivodeships);
        //then
        assertEquals(3, locations.size());
        List<String> resultNames = locations.stream()
                .map(Location::getName)
                .collect(Collectors.toList());
        assertTrue(resultNames.contains("Rudna"));
        assertFalse(locations.contains("XXXX"));
    }

}