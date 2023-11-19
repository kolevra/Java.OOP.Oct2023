package o11_16_Reflection_Ex.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Class<RichSoilLand> richSoilLandClass = RichSoilLand.class;
        Field[] declaredFields = richSoilLandClass.getDeclaredFields();

        String input = scanner.nextLine();

        while (!"HARVEST".equals(input)) {

            if ("all".equals(input)) {
                Arrays.stream(declaredFields)
                        .forEach(f -> System.out.print(formatPrint(f)));
            } else {

                String command = input;

                Arrays.stream(declaredFields)
                        .filter(f -> Modifier.toString(f.getModifiers()).equals(command))
                        .forEach(f -> System.out.print(formatPrint(f)));

            }

            input = scanner.nextLine();
        }
    }

    private static String formatPrint(Field field) {

        return String.format("%s %s %s\n",
                Modifier.toString(field.getModifiers()),
                field.getType().getSimpleName(),
                field.getName());

    }

}
