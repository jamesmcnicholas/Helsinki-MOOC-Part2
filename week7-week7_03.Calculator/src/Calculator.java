public class Calculator {
    private int value1;
    private int value2;
    private int stats;
    private Reader reader = new Reader();

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            } else if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }
        statistics();
    }
    private void sum(){
        readValues();
        int result = value1+ value2;
        System.out.println("sum of the values "+ result);
        this.stats++;
    }
    private void product(){
        readValues();
        int result = value1 * value2;
        System.out.println("product of the values "+result);
        this.stats++;
    }
    private void difference(){
        readValues();
        int result = value1 - value2;
        System.out.println("difference of the values "+result);
        this.stats++;
    }
    private void statistics(){
        System.out.println("Calculations done "+this.stats++);
    }
    private void readValues(){
        System.out.println("value1:");
        this.value1= reader.readInteger();
        System.out.println("value2:");
        this.value2= reader.readInteger();
    }

}
