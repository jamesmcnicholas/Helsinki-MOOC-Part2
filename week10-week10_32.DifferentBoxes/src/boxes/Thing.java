package boxes;

import java.util.Objects;

public class Thing {

    private String name;
    private int weight;

    public Thing(String name, int weight) {

        this.name = name;

        if(weight >= 0){
            this.weight = weight;
        } else {
            throw new IllegalArgumentException();
        }

    }


    public Thing(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean equals(Thing o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thing thing = (Thing) o;
        return Objects.equals(name, thing.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
