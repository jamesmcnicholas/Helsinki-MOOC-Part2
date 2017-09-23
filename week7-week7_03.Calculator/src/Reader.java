import java.util.Scanner;

/**
 * Created by James on 17/09/2017.
 */
public class Reader {
    private Scanner input = new Scanner (System.in);

    public String readString(){
        return this.input.nextLine();
    }
    public int readInteger(){
        return Integer.parseInt(input.nextLine());
    }

}
