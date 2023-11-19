package o11_14_Reflection.p01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;
        //System.out.println(clazz.getTypeName());
        System.out.println(clazz);
        //System.out.println(clazz.getSuperclass().getSimpleName());
        System.out.println(clazz.getSuperclass());

        Class<?>[] interfaces = clazz.getInterfaces();

        for (Class<?> i : interfaces) {
            //System.out.println(i.getSimpleName());
            System.out.println(i);
        }

        //o11_14_Reflection.p03HighQualityMistakes.Reflection reflection = new o11_14_Reflection.p03HighQualityMistakes.Reflection();
        Constructor<Reflection> constructor = clazz.getConstructor();
        Reflection reflection = constructor.newInstance();

        System.out.println(reflection);

    }
}
