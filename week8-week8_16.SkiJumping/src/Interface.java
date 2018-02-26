import java.util.ArrayList;
import java.util.Scanner;

public class Interface {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Participant> participants = new ArrayList<>();

        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while(true){
            System.out.println("Participant name: ");
            String name = input.nextLine();
            if(name.equals("")){
                break;
            }else{
                participants.add(new Participant(name));
            }
        }


        
    }
}
