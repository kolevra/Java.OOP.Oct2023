package o11_16_Reflection_Ex.blackBoxInteger;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {

        Scanner scanner = new Scanner(System.in);

        Class<BlackBoxInt> blackBoxClass = BlackBoxInt.class;
        Constructor<BlackBoxInt> constructor = blackBoxClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBox = constructor.newInstance();

        String input = scanner.nextLine();

        while(!"END".equals(input)){

            String[] tokens = input.split("_");
            String methodName = tokens[0];
            int value = Integer.parseInt(tokens[1]);

            Method currentMethod = blackBoxClass.getDeclaredMethod(methodName, int.class);
            currentMethod.setAccessible(true);
            currentMethod.invoke(blackBox, value);

            Field innerValue = blackBoxClass.getDeclaredField("innerValue");
            innerValue.setAccessible(true);
            System.out.println(innerValue.get(blackBox));

            input = scanner.nextLine();
        }

    }
}
