package o10_26_WorkingWithAbstraction_Ex.cardsPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String color = scanner.nextLine();

        Card card = new Card(CardSuit.valueOf(color), ThirteenRanks.valueOf(rank));

        System.out.printf("Card name: %s of %s; Card power: %d", rank, color, card.calculateValue());

    }
}
