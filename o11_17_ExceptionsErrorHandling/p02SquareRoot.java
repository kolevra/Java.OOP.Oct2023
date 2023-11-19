package o11_17_ExceptionsErrorHandling;

import java.util.Scanner;

public class p02SquareRoot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        try {
            int currentNumber = Integer.parseInt(input);

            if (currentNumber >= 0) {
                double sqrt = Math.sqrt(currentNumber);
                System.out.printf("%.2f%n", sqrt);
            } else {
                System.out.println("Invalid");
            }
        } catch (NumberFormatException ignored){
            System.out.println("Invalid");
        } finally {
            System.out.println("Goodbye");
        }


    }
}
