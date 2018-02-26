import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards = new ArrayList<Card>();

    public void add(Card card){
        cards.add(card);
    }

    public void print(){
        for(Card c:cards){
            System.out.println(c);
        }
    }

    public int getValue(){
        int value=0;
        for(Card c:cards){
            value+=c.getValue();
        }
        return value;
    }

    public void sort(){
        Collections.sort(this.cards);
    }

    public int compareTo(Hand hand){
        if(hand.getValue()<this.getValue()){
            return 1;
        }else if(hand.getValue()>this.getValue()) {
            return -1;
        }
        return 0;
    }

    public void sortAgainstSuit(){
        SortAgainstSuitAndValue suitSorter = new SortAgainstSuitAndValue();
        Collections.sort(cards,suitSorter);
    }
}
