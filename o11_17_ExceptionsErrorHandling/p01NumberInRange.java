package o11_17_ExceptionsErrorHandling;

import java.util.Arrays;
import java.util.Scanner;

public class p01NumberInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int begin = range[0];
        int end = range[1];
        System.out.printf("Range: [%d...%d]%n", begin, end);

        String input = scanner.nextLine();

        boolean isValid = false;

        while(!isValid){

            try{
                int currentNumber = Integer.parseInt(input);

                if(currentNumber >= begin && currentNumber <= end){
                    isValid = true;
                    System.out.printf("Valid number: %d", currentNumber);
                    break;
                } else {
                    System.out.println("Invalid number: " + input);
                }
            } catch (NumberFormatException ignored) {

                System.out.println("Invalid number: " + input);
            }

            input = scanner.nextLine();
        }
    }
}
