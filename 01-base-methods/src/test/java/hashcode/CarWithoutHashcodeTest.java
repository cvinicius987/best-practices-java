package hashcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * The Problem the class CarWithout, not implement hascode, so the hascode method
 * will be from the Object class.
 */
class CarWithoutHashcodeTest {

    @DisplayName("The test fail, because the class not implements hascode")
    @Test
    public void when_equalsTrue_hascode_should_same(){

        var car1 = new CarWithoutHashcode("Gol", 10);
        var car2 = new CarWithoutHashcode("Gol", 10);

        Assertions.assertEquals(car1.hashCode(), car2.hashCode());
    }

    @DisplayName("The test pass, because hascode from object return different values")
    @Test
    public void when_equalsFalse_hascode_should_different(){

        var car1 = new CarWithoutHashcode("Gol", 10);
        var car2 = new CarWithoutHashcode("Parati", 20);

        Assertions.assertNotSame(car1.hashCode(), car2.hashCode());
    }

    @DisplayName("The test fail and return null because the map use the hash table to find element.")
    @Test
    public void when_createMap_find_corret_element(){

        var map = new HashMap<CarWithoutHashcode, String>();

        map.put(new CarWithoutHashcode("Gol", 10), "Basic");
        map.put(new CarWithoutHashcode("Passat", 50), "Lux");

        Assertions.assertEquals("Basic", map.get(new CarWithoutHashcode("Gol", 10)));
    }
}