import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) {
        // The class we are trying to access
        Class<?> clazz = String.class;
        System.out.println("Trying to look into the " + clazz.getName() + " Class! \n");

        // Is to access all the Methods
        Method[] allMethods = clazz.getMethods();
        System.out.println("\n The Methods available are: ");

        for (Method method : allMethods) {
            System.out.println(method.getName());
        }

        // Is to access all the Fields
        Field[] allFields = clazz.getFields();
        System.out.println("\n\nThe Fields available are: ");
        for (Field field : allFields) {
            System.out.println(field.getName());
        }

        // Is to access all Constructors
        Constructor<?>[] construct = clazz.getConstructors();
        System.out.println("\n\nThe Constructors available are: ");
        for (Constructor<?> constructor : construct) {
            System.out.println(constructor.getName());
        }
    }
}