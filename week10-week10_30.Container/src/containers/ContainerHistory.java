package containers;

import java.util.ArrayList;

public class ContainerHistory {

    private ArrayList<Double> historyList;

    public ContainerHistory() {
        historyList = new ArrayList<Double>();
    }

    public void add(double situation){
        historyList.add(situation);
    }

    public void reset(){
        historyList = new ArrayList<Double>();
    }

    @Override
    public String toString() {
        return historyList.toString();
    }

    public double maxValue(){
        if(historyList.isEmpty()){
            return 0;
        }

        double max = 0;

        for(Double d: historyList){
            if (d > max) {
                max = d;
            }
        }

        return max;
    }

    public double minValue(){
        if(historyList.isEmpty()){
            return 0;
        }

        double min = Integer.MAX_VALUE;

        for(Double d: historyList){
            if (d < min) {
                min = d;
            }
        }

        return min;
    }

    public double average() {
        if(historyList.isEmpty()){
            return 0;
        }

        double total = 0;

        for(double d: historyList){
            total += d;
        }

        return total/historyList.size();
    }

    public double greatestFluctuation(){

        //return Math.abs(maxValue()-minValue());
        double last = historyList.get(0);
        double max = 0;

        if(historyList.size() < 2){
            return 0;
        }

        for(double d: historyList){
            if(Math.abs(d-last) > max){
                max = Math.abs(d-last);
            }

            last = d;
        }

        return max;
    }

    public double variance(){
        if(historyList.size() < 2){
            return 0;
        }

        double average = average();
        double total = 0;

        for(double d: historyList){
            total += (d-average)*(d-average);
        }

        return  total/(historyList.size()-1);
    }
}
