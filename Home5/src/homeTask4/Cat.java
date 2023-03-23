package homeTask4;

import java.lang.reflect.Field;

public class Cat {
    public static void main(String[] args) throws IllegalAccessException {
        Animal animal = new Animal(5, "біб", 3.2);

        // Access the fields of the Animal class
        Field[] fields = animal.getClass().getDeclaredFields();
        for (Field field : fields) {
            // Change the contents of each field
            field.setAccessible(true);
            if (field.getType() == int.class) {
                field.setInt(animal, 7);
            } else if (field.getType() == String.class) {
                field.set(animal, "боб");
            } else if (field.getType() == double.class) {
                field.setDouble(animal, 5.5);
            }
        }

        // Verify the fields have been changed
        System.out.println("New age: " + animal.getAge());
        System.out.println("New name: " + animal.name);
        System.out.println("New isAlive: " + animal.weight);
    }
}
