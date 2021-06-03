package clone;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalErrorCloneTest {

    @Test
    public void when_clone_animal_result_is_the_same(){

        var list = new ArrayList<String>();

        list.add("EUA");

        var animal = new AnimalErrorClone("Urso", list);

        var animalClone = animal.clone();

        assertNotSame(animal, animalClone);
        assertEquals(animal, animalClone);
        assertEquals(animal.getClass(), animalClone.getClass());
    }

    @Test
    public void when_change_value_clone_not_change(){

        var list = new ArrayList<String>();

        list.add("EUA");

        var animal = new AnimalErrorClone("Urso", list);

        var animalClone = animal.clone();

        animal.addPlace("Canada");
        animal.addPlace("Artartida");

        assertNotSame(animal, animalClone);
        assertNotSame(animal.getPlaces().size(), animalClone.getPlaces().size());
    }
}
