import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class card {
    String suit;
    String rank;

    card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
}
class deck{
        ArrayList<card> cards;
        deck(){
            cards = new ArrayList<>();
            String[] suits = {"Hearts", "Spades", "Clubs", "Diamonds"};
            String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen", "King", "Ace"};
        }

}
class player{
        ArrayList<card> hand;
}

public class Main {
    public static void main(String[] args) {

    }
}