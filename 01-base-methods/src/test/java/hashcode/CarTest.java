package hashcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

/**
 * Correct implementation from equals/hascode
 */
class CarTest {

    @Test
    public void when_equalsTrue_hascode_should_same(){

        var car1 = new Car("Gol", 10);
        var car2 = new Car("Gol", 10);

        Assertions.assertEquals(car1.hashCode(), car2.hashCode());
    }

    @Test
    public void when_equalsFalse_hascode_should_different(){

        var car1 = new CarWithoutHashcode("Gol", 10);
        var car2 = new CarWithoutHashcode("Parati", 20);

        Assertions.assertNotSame(car1.hashCode(), car2.hashCode());
    }

    @Test
    public void when_createMap_find_corret_element(){

        var map = new HashMap<CarWithoutHashcode, String>();

        map.put(new CarWithoutHashcode("Gol", 10), "Basic");
        map.put(new CarWithoutHashcode("Passat", 50), "Lux");

        Assertions.assertEquals("Basic", map.get(new CarWithoutHashcode("Gol", 10)));
    }
}