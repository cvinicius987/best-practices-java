package hashcode;

import java.util.Objects;

public class Car {

    private String name;
    private int power;

    public Car(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Car car = (Car) o;

        return power == car.power && name.equals(car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power);
    }
}