package o11_02_Inheritance_Ex.restaurant.Beverage;

import java.math.BigDecimal;

public class Tea extends HotBeverage{
    public Tea(String name, BigDecimal price, double milliliters) {
        super(name, price, milliliters);
    }
}
