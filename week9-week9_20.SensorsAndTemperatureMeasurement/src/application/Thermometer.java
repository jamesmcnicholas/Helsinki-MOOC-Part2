package application;

import java.util.concurrent.ThreadLocalRandom;

public class Thermometer implements Sensor{

    private boolean isOn;

    public Thermometer() {
        this.isOn = false;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void on() {
        isOn = true;
    }

    @Override
    public void off() {
        isOn = false;
    }

    @Override
    public int measure() {
        if(isOn){

            return ThreadLocalRandom.current().nextInt(-30,31);
        } else {
            throw new IllegalStateException();
        }
    }
}
