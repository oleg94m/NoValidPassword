package homeTask2;

import java.lang.reflect.Field;

public class Task2 {
    static private final class SerchClass{

        public String firstEx = "Oleg";

        private int secondEx = 5;

        protected long thirdEx = 28;
    }

    public static void main(String[] args) {

        Class cl = SerchClass.class;
        Field[] fields = cl.getDeclaredFields();


        fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println( "\tName: " + field.getName());
            System.out.println("\tType: "  + fieldType.getName());

        }
    }
}