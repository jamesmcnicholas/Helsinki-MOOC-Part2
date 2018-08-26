package game;

import gameoflife.GameOfLifeBoard;

import java.util.Random;

public class PersonalBoard extends GameOfLifeBoard {

    public PersonalBoard(int width, int height) {
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double probabilityForEachCell) {
        for(int x = 0; x < getWidth();x++){
            for(int y = 0; y < getHeight(); y++){
                double d = new Random().nextDouble();
                if(d < probabilityForEachCell){
                    getBoard()[x][y] = true;
                } else {
                    getBoard()[x][y] = false;
                }
            }
        }
    }

    @Override
    public boolean isAlive(int x, int y) {
        if(isValidCoord(x,y)){
            return super.getBoard()[x][y];
        }
        return false;
    }

    @Override
    public void turnToLiving(int x, int y) {
        if(isValidCoord(x,y)){
            super.getBoard()[x][y] = true;
        }
    }

    @Override
    public void turnToDead(int x, int y) {
        if(isValidCoord(x,y)) {
            super.getBoard()[x][y] = false;
        }
    }

    @Override
    public int getNumberOfLivingNeighbours(int x, int y) {
        int neighbours = 0;

        if(isValidCoord(x,y)) {


            if(isValidCoord(x+1,y)){
                if(getBoard()[x+1][y]){
                    neighbours++;
                }
            }

            if(isValidCoord(x-1,y)){
                if(getBoard()[x-1][y]){
                    neighbours++;
                }
            }

            if(isValidCoord(x,y+1)){
                if(getBoard()[x][y+1]){
                    neighbours++;
                }
            }

            if(isValidCoord(x,y-1)){
                if(getBoard()[x][y-1]){
                    neighbours++;
                }
            }

            if(isValidCoord(x+1,y+1)){
                if(getBoard()[x+1][y+1]){
                    neighbours++;
                }
            }

            if(isValidCoord(x+1,y-1)){
                if(getBoard()[x+1][y-1]){
                    neighbours++;
                }
            }

            if(isValidCoord(x-1,y+1)){
                if(getBoard()[x-1][y+1]){
                    neighbours++;
                }
            }

            if(isValidCoord(x-1,y-1)){
                if(getBoard()[x-1][y-1]){
                    neighbours++;
                }
            }

        }

        return neighbours;
    }

    @Override
    public void manageCell(int x, int y, int livingNeighbours) {

        livingNeighbours = getNumberOfLivingNeighbours(x,y);

        if(getNumberOfLivingNeighbours(x,y) < 2){
            turnToDead(x,y);
        }
        if (isAlive(x,y)){
            if(!(livingNeighbours == 2 || livingNeighbours == 3)){
                turnToDead(x,y);
            }
        } else if(livingNeighbours == 3){
            turnToLiving(x,y);
        }

    }

    public boolean isValidCoord(int x, int y){
        if(x < super.getWidth() && x >= 0){
            if(y < super.getHeight() && y >= 0){
                return true;
            }
        }
        return false;
    }

}
