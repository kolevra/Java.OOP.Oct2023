package o10_26_WorkingWithAbstraction_Ex.cardsPower;

public class Card {

    private CardSuit cardSuit;
    private ThirteenRanks thirteenRanks;

    public Card(CardSuit cardSuit, ThirteenRanks thirteenRanks) {
        this.cardSuit = cardSuit;
        this.thirteenRanks = thirteenRanks;
    }

    public int calculateValue(){
        return this.cardSuit.getValue() + this.thirteenRanks.getValue();
    }

}
