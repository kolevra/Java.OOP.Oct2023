package o10_24_WorkingWithAbstraction;

import java.util.Scanner;

public class p01RhombusOfStars {
    public static void main(String[] args) {

        int size = readInput();
        printRhombus(size);

    }

    private static int readInput(){
        return Integer.parseInt(new Scanner(System.in).nextLine());
    }

    private static void printRhombus(int size){

        for (int i = 1; i <= size; i++) {

            printRhombusLine(size, i);
        }

        for (int i = size - 1; i >= 1 ; i--) {

            printRhombusLine(size, i);
        }

    }

    private static void printRhombusLine (int size, int row){

        for (int k = 0; k < size - row; k++) {
            System.out.print(" ");
        }

        for (int k = 0; k < row; k++) {
            System.out.print("* ");
        }
        System.out.println();

    }
}
