package o11_06_Interfaces_Abstraction_Ex.food;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());

        Map<String, Buyer> buyerMap = new HashMap<>();

        for (int i = 0; i < count; i++) {
            String[] inputArr = scanner.nextLine().split("\\s+");
            String name = inputArr[0];
            int age = Integer.parseInt(inputArr[1]);

            if(inputArr.length == 4){
                Citizen citizen = new Citizen(name, age, inputArr[2], inputArr[3]);
                buyerMap.put(name, citizen);
            } else {

                Rebel rebel = new Rebel(name, age, inputArr[2]);
                buyerMap.put(name, rebel);

            }
        }

        String input = scanner.nextLine();

        while (!"End".equals(input)){

            Buyer buyer = buyerMap.get(input);

            if(buyer != null){
                buyer.buyFood();
            }
            input = scanner.nextLine();
        }

        int boughtFood = buyerMap.values()
                .stream()
                .mapToInt(Buyer::getFood)
                .sum();

        System.out.println(boughtFood);

    }
}
