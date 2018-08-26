
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FileManager t = new FileManager();

        ArrayList<String> names = new ArrayList<String>();

        names.add("john");
        names.add("sid");
        names.add("sam");

        t.save("src/test2.txt",names);
    }
}
