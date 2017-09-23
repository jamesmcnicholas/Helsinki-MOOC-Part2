import java.util.Scanner;

/**
 * Created by James on 20/09/2017.
 */
public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader=reader;
        this.dictionary=dictionary;

    }

    public void start(){
        System.out.println("Statement:");
        System.out.println("    quit - quit the text user interface");
        System.out.println("    translate - asks a word and prints its translation");
        System.out.println("    quit - quit the text user interface");

        while(true){

            String input = getInput();;
            if(input.equals("quit")){
                quit();
                break;
            } else if(input.equals("add")){
                add();
            }else if(input.equals("translate")) {
                translate();
            } else{
                System.out.println("Unknown statement\n");
            }
        }
    }

    public void add(){
        System.out.println("In Finnish:");
        String fin = reader.nextLine();
        System.out.println("In English:");
        String eng = reader.nextLine();
        dictionary.add(fin,eng);

    }

    public void translate(){
        System.out.println("Give a word:");
        System.out.println("In english: "+this.dictionary.translate(reader.nextLine()));
    }
    public void quit(){
        System.out.println("Cheers!");
    }
    public String getInput() {
        System.out.print("Statement: ");
        String input = this.reader.nextLine();
        input = input.toLowerCase().trim();
        return input;
    }
}
