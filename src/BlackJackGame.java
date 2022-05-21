import java.sql.SQLOutput;
import java.util.Scanner;

public class BlackJackGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        CardDeck playDeck = new CardDeck();
        Player player1 = new Player();
        Player bot = new Player();
        boolean game = true;
        while (game) {
            player1.addCard(playDeck.drawCard());
            bot.addCard(playDeck.drawCard());
            player1.addCard(playDeck.drawCard());
            bot.addCard(playDeck.drawCard());
            System.out.print("One of the dealers cards: ");
            bot.printOneCard();
            String playerInput;
            boolean drawCards = true;
            while (drawCards) {
                playerInput = "";
                System.out.print("Your cards: ");
                player1.printDeck();
                System.out.println("Your decks value: " + player1.deckValue());
                System.out.println("Do you want to hit or stand? Enter h/s");
                playerInput = scan.next();
                System.out.println(playerInput);
                if (playerInput.equals("s")) {
                    break;
                } else {
                    player1.addCard(playDeck.drawCard());
                }
                if (player1.deckValue() > 21) {
                    drawCards = false;
                }
            }
            while (bot.deckValue() < 17) {
                bot.addCard(playDeck.drawCard());
            }
            System.out.println("Bot value: " + bot.deckValue());
            System.out.println("Your value: " + player1.deckValue());
            if (player1.deckValue() > 21 || player1.deckValue() < bot.deckValue() && bot.deckValue() <= 21) {
                System.out.println("You lost!");
            } else {
                System.out.println("You won!");
            }
            game = false;
        }
    }
}
