package hashcode;

import java.util.Objects;

public class CarWithoutHashcode {

    private String name;
    private int power;

    public CarWithoutHashcode(String name, int power) {
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

        CarWithoutHashcode car = (CarWithoutHashcode) o;

        return power == car.power && name.equals(car.name);
    }

    @Override
    public int hashCode() {

        int result = 31 * name.hashCode();

        result += 31 * power;

        return result;
    }
}