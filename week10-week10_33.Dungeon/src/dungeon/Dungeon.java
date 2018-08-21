package dungeon;

import java.util.ArrayList;
import java.util.Scanner;

public class Dungeon {

    private int length;
    private int height;
    private int vampires;
    private int moves;
    private boolean vampiresMove;

    private ArrayList<Vampire> vampireList;

    private Player player;


    public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
        this.length = length;
        this.height = height;
        this.vampires = vampires;
        this.moves = moves;
        this.vampiresMove = vampiresMove;

        vampireList = new ArrayList<Vampire>();

        for(int k = 0; k < vampires; k++){
            vampireList.add(new Vampire(height,length));
        }



        player = new Player(height,length);
    }

    public void run(){

        Scanner sc = new Scanner(System.in);



        for(int i = moves; i >= 1; i--){

            System.out.println(i+"\n");

            printCoordinates();

            checkForCollisions();

            if(vampireList.isEmpty()){
                System.out.println("YOU WIN");
                break;
            }

            printMap();

            String input = sc.nextLine();
            if(vampiresMove){
                for(Vampire v : vampireList){
                    v.move();
                }
            }
            player.move(input);

        }

        System.out.println("YOU LOSE");


    }

    public void printMap(){
        for (int x = 0; x < length; x++){

            for (int y = 0; y < height; y++){
                System.out.print(checkSquare(x,y));
            }

            System.out.print("\n");
        }
    }


    public char checkSquare(int x, int y) {
        if (player.getX() == x && player.getY() == y) {
            return '@';
        } else {
            for (Vampire v : vampireList) {
                if (v.getX() == x && v.getY() == y) {
                    return 'v';
                }
            }

            return '.';
        }

    }

    public void checkForCollisions(){
        ArrayList<Vampire> vampiresToRemove = new ArrayList<Vampire>();

        for(Vampire v : vampireList){
            if(v.getX() == player.getX() && v.getY() == player.getY()){
                vampiresToRemove.add(v);
            }
        }

        for(Vampire v : vampiresToRemove){
            vampireList.remove(v);
        }
    }

    public void printCoordinates(){
        System.out.println(player);

        for(Vampire v: vampireList){
            System.out.println(v);
        }
        System.out.println();
    }
}

