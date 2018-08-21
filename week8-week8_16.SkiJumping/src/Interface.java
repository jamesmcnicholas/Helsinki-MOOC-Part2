
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Interface {

    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Participant> participants = new ArrayList<Participant>();

        System.out.println("Kumpula ski jumping week\n");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while(true){
            System.out.println("  Participant name: ");
            String name = input.nextLine();
            if(name.equals("")){
                break;
            }else{
                participants.add(new Participant(name));
            }
        }

        System.out.print("The tournament begins!");


        int round = 0;
        boolean cont = true;
        while(cont){
            round++;
            //Starting new rounds
            System.out.println("\n\nWrite \"jump\" to jump; otherwise you quit:");
            if(!input.nextLine().equals("jump")){
                break;
            }
            Collections.sort(participants);
            Collections.reverse(participants);
            System.out.println("Round "+(round)+"\n");
            System.out.println("Jumping order:");

            int index = 1;
            for(Participant p: participants){
                System.out.println("  "+(index++)+". "+p);
            }

            //Game logic
            System.out.println("\nResults of round "+round);
            //Generates votes and length
            for(Participant p : participants){
                int length = (int)(Math.random() * 61) + 60;
                p.setPoints(p.getPoints()+length);
                p.addJump(length);
                ArrayList<Integer> votes = new ArrayList<Integer>();
                for(int i=0;i<5;i++){
                    votes.add((int)(Math.random()*11)+10);
                }
                int smallest = 1000;
                int largest = 0;
                ArrayList<Integer> usableVotes = new ArrayList<Integer>();
                for(int v: votes){
                    if(v>largest) {
                        largest = v;
                    }
                    if(v<smallest){
                        smallest = v;
                    }
                    usableVotes.add(v);
                }
                usableVotes.remove(usableVotes.indexOf(smallest));
                usableVotes.remove(usableVotes.indexOf(largest));


                int total = 0;
                for(int vote:usableVotes){
                    total+=vote;
                }

                p.setPoints(p.getPoints()+total);

                System.out.println("  "+p.getName());
                System.out.println("    length: "+length);
                System.out.println("    judge votes: "+votes.toString());
            }

        }

        System.out.println("Thanks!\n");

        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        int index = 1;
        Collections.sort(participants);
        for(Participant p : participants){
            System.out.println((index++)+"           "+p.toString());
            System.out.print("            jump lengths: ");
            p.printJumps();

        }
    }
}
