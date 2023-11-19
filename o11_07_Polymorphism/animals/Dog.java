package o11_07_Polymorphism.animals;

public class Dog extends Animal{


    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nDJAAF", getName(), getFavouriteFood());
        //return String.format("%s%nDJAAF", super.explainSelf());
    }
}
