package o10_30_Encapsulation_Ex.pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaArr = scanner.nextLine().split("\\s+");
        Pizza pizza = new Pizza(pizzaArr[1], Integer.parseInt(pizzaArr[2]));

        String[] doughArr = scanner.nextLine().split("\\s+");
        Dough dough = new Dough(doughArr[1], doughArr[2], Double.parseDouble(doughArr[3]));
        pizza.setDough(dough);

        String input = scanner.nextLine();

        while (!input.equalsIgnoreCase("end")) {

            String[] toppingArr = input.split("\\s+");
            Topping topping = new Topping(toppingArr[1], Double.parseDouble(toppingArr[2]));
            pizza.addTopping(topping);
            input = scanner.nextLine();
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
