package o11_14_Reflection.p02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        Class<Reflection> clazz = Reflection.class;

        Method[] declaredMethods = clazz.getDeclaredMethods();

//        Method[] methods = o11_14_Reflection.p03HighQualityMistakes.Reflection.class.getDeclaredMethods(); Method[] getters = Arrays.stream(methods)
//                .filter(m -> m.getName().startsWith("get") && m.getParameterCount() == 0)
//                .sorted(Comparator.comparing(Method::getName))
//                .toArray(Method[]::new);
//        Arrays.stream(getters).forEach(m ->
//                System.out.printf("%s will return class %s%n",
//                        m.getName(), m.getReturnType().getName()));


        Arrays.stream(declaredMethods)
                .filter(m -> !m.getName().startsWith("toString"))
                .sorted((m1, m2) -> m1.getName().compareTo(m2.getName()))
                .forEach(m-> System.out.println(formatMethodInfo(m)));
        
    }

    public static String formatMethodInfo(Method m){
        if(m.getName().startsWith("get")){
            return m.getName() + " will return class " + m.getReturnType().getName();
        }
        return m.getName() + " and will set field of class " + m.getParameterTypes()[0].getName();
    }
}
