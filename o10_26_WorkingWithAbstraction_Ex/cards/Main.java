package o10_26_WorkingWithAbstraction_Ex.cards;

import o10_26_WorkingWithAbstraction_Ex.cardsPower.CardSuit;

public class Main {
    public static void main(String[] args) {

        CardSuit[] cardSuits = CardSuit.values();

        System.out.println("Card Suits:");

        for (CardSuit cs : cardSuits) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", cs.ordinal(), cs.name());
        }
    }
}
