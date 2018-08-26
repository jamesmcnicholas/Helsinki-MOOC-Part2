
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public FileManager() {
    }

    public List<String> read(String file) {
        List<String> lines = new ArrayList<String>();

        try{

            File readFile = new File(file);
            Scanner sc = new Scanner(readFile);

            while(sc.hasNextLine()){
                lines.add(sc.nextLine());
            }

            sc.close();
            return lines;

        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }


    }

    public void save(String file, String text)  {
        /*
        List<String> lines = new ArrayList<String>();
        if(read(file) != null){
            lines = read(file);
        }

        File writeFile = new File(file);

        lines.add(text);
        try{

            for(String s : lines){
                FileWriter fw = new FileWriter(writeFile,true);
                fw.write(s + "\n");
                fw.close();
            }

        } catch (Exception e){
            System.out.println(e.getMessage() + "\n" + e.getStackTrace());
        }
        */
        try{

            File writeFile = new File(file);
            FileWriter fr = new FileWriter(writeFile,true);

            fr.write(text);
            fr.close();

        }catch (Exception e) {
            System.out.println(e.getMessage() + "\n" + e.getStackTrace());
        }


    }

    public void save(String file, List<String> texts){
        for(String s : texts){
            save(file,s + "\n");
        }
    }
}
