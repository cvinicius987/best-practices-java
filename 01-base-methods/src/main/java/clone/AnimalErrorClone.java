package clone;

import java.util.List;

public class AnimalErrorClone implements Cloneable{

    private String name;
    private List<String> places;

    public AnimalErrorClone(String name, List<String> places) {
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

        AnimalErrorClone animal = (AnimalErrorClone) o;

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
    public AnimalErrorClone clone(){
        try {
            return (AnimalErrorClone) super.clone();

        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
