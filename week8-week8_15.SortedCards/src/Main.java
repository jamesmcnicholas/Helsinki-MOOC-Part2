
public class Main {

    public static void main(String[] args) {
        Hand hand1 = new Hand();
        hand1.add( new Card(12,Card.HEARTS) );
        hand1.add( new Card(14,Card.DIAMONDS) );
        System.out.println("hand value: "+hand1.getValue());
        Hand hand2 = new Hand();
        hand2.add( new Card(3,Card.SPADES) );
        hand2.add( new Card(8,Card.DIAMONDS) );
        hand2.add( new Card(7,Card.CLUBS) );
        hand2.add( new Card(9,Card.HEARTS) );
        System.out.println("value: "+hand2.getValue());

        System.out.println(hand1.compareTo(hand2));
    }
}
