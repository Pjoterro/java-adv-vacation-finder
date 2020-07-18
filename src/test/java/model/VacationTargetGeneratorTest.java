package model;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class VacationTargetGeneratorTest {

    @Test
    public void shouldReturnSomething() {
        //given
        List<Location> locationsForTest = List.of(
                new Village("Hobbiton", "Shire"),
                new Village("Wola Zaorana", "Testowe"),
                new City("Gdańsk", "Pomorskie"),
                new UrbanRural("I have no idea", "Dunno")
        );
        //when
        Location randomLocation = VacationTargetGenerator.getRandomLocation(locationsForTest);
        //then
        assertNotNull(randomLocation);
    }

    @Test
    public void shouldReturnByType() {
        //given
        List<Location> locationsForTest = List.of(
                new Village("Hobbiton", "Shire"),
                new Village("Wola Zaorana", "Testowe"),
                new City("Gdańsk", "Pomorskie"),
                new UrbanRural("I have no idea", "Dunno")
        );
        //when
        Location randomLocation = VacationTargetGenerator.getRandomLocation(locationsForTest, LocationType.CITY);
        //then
        assertEquals(LocationType.CITY, randomLocation.getType());
    }

}