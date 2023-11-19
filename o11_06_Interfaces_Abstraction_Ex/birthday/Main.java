package o11_06_Interfaces_Abstraction_Ex.birthday;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> birthableList = new ArrayList<>();

        while (!input.equalsIgnoreCase("end")){

            String[] inputArr = input.split("\\s+");

            String object = inputArr[0];

            switch (object){

                case "Citizen":
                    //"Citizen {name} {age} {id} {birthdate}"

                    String name = inputArr[1];
                    int age = Integer.parseInt(inputArr[2]);
                    String id = inputArr[3];
                    String birthdate = inputArr[4];
                    Citizen citizen = new Citizen(name, age, id, birthdate);
                    birthableList.add(citizen);

                    break;
                case "Pet":
                    //"Pet {name} {birthdate}"
                    name = inputArr[1];
                    birthdate = inputArr[2];
                    Pet pet = new Pet(name, birthdate);
                    birthableList.add(pet);

                    break;

            }

            input = scanner.nextLine();
        }

        String filterYear = scanner.nextLine();

        birthableList.stream()
                .filter(b->b.getBirthDate().endsWith(filterYear))
                .forEach(b-> System.out.println(b.getBirthDate()));






    }
}
