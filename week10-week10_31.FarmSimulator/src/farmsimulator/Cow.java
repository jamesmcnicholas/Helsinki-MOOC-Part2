package farmsimulator;

import java.util.Random;

public class Cow implements Milkable,Alive {

    private String name;
    private double capacity;
    private double amount;

    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"
    };

    public Cow() {
        capacity = 15 + new Random().nextInt(26);
        amount = 0;
        name = NAMES[new Random().nextInt(30)];
    }

    public Cow(String name) {
        capacity = 15 + new Random().nextInt(26);
        amount = 0;
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return name + " " + Math.ceil(amount) + "/" + Math.ceil(capacity);
    }

    @Override
    public void liveHour() {
        if(amount + .7 < capacity){

            amount += .7;
        } else {
            amount = capacity;
        }
    }

    @Override
    public double milk() {
        double milk = amount;
        amount = 0;
        return milk;
    }


}
