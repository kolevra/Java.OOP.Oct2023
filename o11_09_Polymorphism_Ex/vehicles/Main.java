package o11_09_Polymorphism_Ex.vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] vehicleArr = scanner.nextLine().split("\\s+");
        Vehicle vehicle1 = new Car(Double.parseDouble(vehicleArr[1]), Double.parseDouble(vehicleArr[2]));
        vehicleArr = scanner.nextLine().split("\\s+");
        Vehicle vehicle2 = new Truck(Double.parseDouble(vehicleArr[1]), Double.parseDouble(vehicleArr[2]));

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        vehicleMap.put("Car", vehicle1);
        vehicleMap.put("Truck", vehicle2);

        int count = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < count; i++) {

            String[] inputArr = scanner.nextLine().split("\\s+");
            Vehicle vehicle = vehicleMap.get(inputArr[1]);
            double argument = Double.parseDouble(inputArr[2]);

            switch (inputArr[0]){

                case "Drive":
                    System.out.println(vehicle.drive(argument));
                    break;

                case "Refuel":
                    vehicle.refuel(argument);
                    break;
            }
        }

        vehicleMap.values().forEach(System.out::println);

    }
}
