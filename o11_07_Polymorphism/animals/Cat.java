package o11_07_Polymorphism.animals;

public class Cat extends Animal{

    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nMEEOW", getName(), getFavouriteFood());
        //return String.format("%s%nMEEOW", super.explainSelf());
    }
}
