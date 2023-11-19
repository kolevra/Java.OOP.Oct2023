package o11_17_ExceptionsErrorHandling;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class p03EnterNumbers {

    private static class InvalidNumberException extends RuntimeException {

        public InvalidNumberException(String message) {
            super(message);
        }

        public InvalidNumberException(String message, Exception cause) {
            super(message, cause);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() != 10) {

            try {
                readNumber(numbers, scanner.nextLine());
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(numbers.stream()
                .map(String::valueOf).collect(Collectors.joining(", ")));

    }

    private static void readNumber(List<Integer> numbers, String input) {

        int currentNumber = -1;

        try {
            currentNumber = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidNumberException("Invalid Number!", e);
        }

        int start = -1;

        if (numbers.isEmpty()) {
            start = 1;
        } else {
            start = numbers.get(numbers.size() - 1);
        }

        int end = 100;

        if (currentNumber <= start || currentNumber >= end) {
            throw new InvalidNumberException(
                    String.format("Your number is not in range %d - %d!", start, end));
        }

        numbers.add(currentNumber);

    }


}
