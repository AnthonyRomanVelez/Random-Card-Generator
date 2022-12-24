import java.util.*;
public class CardMain {
    public static void main(String[] args) {

        String ranks[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String suits[] = {"Spades", "Diamonds", "Clubs", "Hearts"};

        Card deck[] = new Card[ranks.length * suits.length];

        int index = 0;
        for (String rank : ranks) {
            for (String suit : suits) {
                deck[index++] = new Card(suit, rank);
            }
        }

        Random random = new Random();
        int randomCard = 0;
        boolean allSuitPicked[] = {false, false, false, false};
        int attempts = 0;
        while (!allSuitPicked[0] || !allSuitPicked[1] || !allSuitPicked[2] || !allSuitPicked[3]) {
            attempts += 1;
            randomCard = random.nextInt(deck.length);
            Card card = deck[randomCard];
            System.out.println(card);
            if (card.getSuit().equals("Spades")) allSuitPicked[0] = true;
            else if (card.getSuit().equals("Diamonds")) allSuitPicked[1] = true;
            else if (card.getSuit().equals("Clubs")) allSuitPicked[2] = true;
            else if (card.getSuit().equals("Hearts")) allSuitPicked[3] = true;
        }
        System.out.println("Number of picks: "+attempts);
    }

}
