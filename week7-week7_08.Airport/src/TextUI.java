import java.util.ArrayList;
import java.util.Scanner;

public class TextUI {
    private Scanner input;
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public TextUI(){
        this.input = new Scanner(System.in);
        this.flights  = new ArrayList<>();
        this.planes = new ArrayList<>();
    }

    public void Start(){
        AirportPanel(input);
        FlightService();
    }

    public void AirportPanel(Scanner input){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println();

        while (true){
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.println("> ");
            String answer = input.nextLine();
            if (answer.equals("x")){
                break;
            }else if(answer.equals("1")){
                addPlane();
            }else if(answer.equals("2")) {
                addFlight();
            }
        }
    }

    public void FlightService(){
        System.out.println("Flight service");
        System.out.println("------------\n");

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.println("> ");
            String answer = input.nextLine();
            if (answer.equals("x")) {
                break;
            } else if (answer.equals("1")) {
                printPlanes();
            } else if (answer.equals("2")) {
                printFlights();
            } else if (answer.equals("3")) {
                printPlaneInfo();
            }
        }
    }

    public void addPlane(){
        System.out.println("Give plane ID:");
        String id = input.nextLine();
        System.out.println("Give plane capacity:");
        int capacity = Integer.parseInt(input.nextLine());
        planes.add(new Plane(id,capacity));
    }

    public void addFlight(){
        String depart;
        String dest;
        Plane TempPlane;

        System.out.println("Give plane ID:");
        String planeID = input.nextLine();
        for(Plane plane:planes){
            if(plane.getID().equals(planeID)){
                TempPlane = plane;
                System.out.println("Give departure airport code:");
                depart=input.nextLine();
                System.out.println("Give destination airport code:");
                dest = input.nextLine();
                flights.add(new Flight(TempPlane,depart,dest));
                break;
            }
        }

    }

    public void printPlanes(){
        for(Plane plane:planes){
            System.out.println(plane);
        }
    }

    public void printFlights(){
        for(Flight flight:flights){
            System.out.println(flight);
        }
    }

    public void printPlaneInfo(){
        System.out.println("Give plane ID:");
        String ID = input.nextLine();

        for(Plane plane:planes) {
            if (plane.getID().equals(ID)) {
                System.out.println(plane);
            }
        }
    }
}
