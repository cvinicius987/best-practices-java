package clone;

import java.util.List;

public class Animal implements Cloneable{

    private String name;
    private List<String> places;

    public Animal(String name, List<String> places) {
        this.name = name;
        this.places = places;
    }

    public void addPlace(String place){
        this.places.add(place);
    }

    public String getName() {
        return name;
    }

    public List<String> getPlaces() {
        return places;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Animal animal = (Animal) o;

        if((name == null || animal.name == null))
            return false;

        if(name.equals(animal.name))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = 31 * (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public Animal clone(){
        return new Animal(name, List.copyOf(places));
    }
}
