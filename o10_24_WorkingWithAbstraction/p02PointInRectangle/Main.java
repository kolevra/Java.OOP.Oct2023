package o10_24_WorkingWithAbstraction.p02PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] inputArr = readArr(scanner);

        Rectangle rectangle = new Rectangle(inputArr[0], inputArr[1], inputArr[2], inputArr[3]);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {

            int[] pointCoord = readArr(scanner);

            Point p = new Point(pointCoord[0], pointCoord[1]);

            System.out.println(rectangle.contains(p));

        }



    }

    private static int[] readArr(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
