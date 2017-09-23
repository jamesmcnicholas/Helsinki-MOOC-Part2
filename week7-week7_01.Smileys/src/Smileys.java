
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        printWithSmileys("odd");
        printWithSmileys("even");
        printWithSmileys("waht the fuck");
    }
    private static void printWithSmileys(String input){
        if(input.length() % 2 == 1) {
            input=("\n:) " + input + "  :)");
        }else{
            input=("\n:) " + input + " :)");
        }
        for (int i=0;i<input.length()/2;i++){
            System.out.print(":)");
        }
        System.out.println(input);
        for (int i=0;i<input.length()/2;i++){
            System.out.print(":)");
        }
        System.out.println("");
    }


}
