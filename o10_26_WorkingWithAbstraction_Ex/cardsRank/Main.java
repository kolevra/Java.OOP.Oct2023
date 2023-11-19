package o10_26_WorkingWithAbstraction_Ex.cardsRank;

import o10_26_WorkingWithAbstraction_Ex.cardsPower.ThirteenRanks;

public class Main {
    public static void main(String[] args) {

        ThirteenRanks[] ranks = ThirteenRanks.values();

        System.out.println("Card Ranks:");

        for (ThirteenRanks r : ranks){

            System.out.printf("Ordinal value: %d; Name value: %s%n", r.ordinal(), r.name());

        }

    }
}
