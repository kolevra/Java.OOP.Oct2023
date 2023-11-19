package o11_02_Inheritance_Ex.restaurant.Food;

import o11_02_Inheritance_Ex.restaurant.Product;

import java.math.BigDecimal;

public class Food extends Product {

    private double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
