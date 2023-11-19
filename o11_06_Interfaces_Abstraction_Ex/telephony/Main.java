package o11_06_Interfaces_Abstraction_Ex.telephony;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] phoneNumbersArr = scanner.nextLine().split("\\s+");
        String[] sitesArr = scanner.nextLine().split("\\s+");

        List<String> numbersList = Arrays.stream(phoneNumbersArr).collect(Collectors.toList());
        List<String> sitesList = Arrays.stream(sitesArr).collect(Collectors.toList());

        Smartphone smartphone =  new Smartphone(numbersList, sitesList);

        System.out.print(smartphone.call());
        System.out.print(smartphone.browse());

    }
}
