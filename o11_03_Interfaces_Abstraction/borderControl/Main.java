package o11_03_Interfaces_Abstraction.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Identifiable> identifiables = new ArrayList<>();

        while(!input.equalsIgnoreCase("End")){

            String[] tokens = input.split("\\s+");

            Identifiable identifiable;

            if(tokens.length == 2){
                identifiable = new Robot(tokens[0], tokens[1]);
            } else {
                identifiable = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
            }

            identifiables.add(identifiable);

            input = scanner.nextLine();
        }

        String fakeIdCheck = scanner.nextLine();

        identifiables.stream().filter(i -> i.getId().endsWith(fakeIdCheck))
                .forEach(i -> System.out.println(i.getId()));



    }
}
