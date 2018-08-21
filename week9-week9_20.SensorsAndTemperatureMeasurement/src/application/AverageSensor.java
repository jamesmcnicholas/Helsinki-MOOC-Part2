package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor{

    private List<Sensor> sensorList = new ArrayList<Sensor>();
    private List<Integer> readingList = new ArrayList<Integer>();


    public AverageSensor() { }

    @Override
    public boolean isOn() {
        boolean on = true;
        for (Sensor s : sensorList){
            if(!(s.isOn())){
                on = false;
            }
        }

        if(on){
            on();
            return true;
        } else {
            off();
            return false;
        }


    }

    @Override
    public void on() {
        for (Sensor s : sensorList){
            s.on();
        }
    }

    @Override
    public void off() {
        sensorList.get(0).off();
    }

    @Override
    public int measure() {

        if(isOn() && (sensorList.size() != 0)){
            int total = 0;
            int onSensors = 0;
            for(Sensor s : sensorList){
                if(s.isOn()){
                    total += s.measure();
                    onSensors++;
                }
            }
            int reading = Math.round(total / onSensors);
            readingList.add(reading);
            return reading;
        } else {
            throw new IllegalStateException();
        }
    }

    public void addSensor(Sensor additional){
        sensorList.add(additional);
        isOn();
    }

    public List<Integer> readings() {
        return readingList;
    }
}
