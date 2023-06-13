package homeTask3;

import java.lang.reflect.*;

public class Main {
    private int field1;
    public String field2;
    protected double field3;

    public Main() {
        this.field1 = 0;
        this.field2 = "";
        this.field3 = 3.1;
    }

    public Main(int field1, String field2, double field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    public int getField1() {
        return this.field1;
    }

    public void setField1(int field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return this.field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public double isField3() {
        return this.field3;
    }

    public void setField3( double field3) {
        this.field3 = field3;
    }

    public static void main(String[] args) {
        Class<?> cls = Main.class;

        //  Всі поля
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Назва поля: " + field.getName());
            System.out.println("Назва типу: " + field.getType());
            System.out.println("Назва модікатора: " + Modifier.toString(field.getModifiers()));
        }

        // Всі конструктори
        Constructor<?>[] constructors = cls.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Назва конструктора: " + constructor.getName());
            System.out.println("модифікатор конструктора: " + Modifier.toString(constructor.getModifiers()));
            Parameter[] parameters = constructor.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("назва параметру: " + parameter.getName());
                System.out.println("тип параметру: " + parameter.getType());
            }
        }

        //  Всі методи
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("назва методу: " + method.getName());
            System.out.println("модифікатор методу: " + Modifier.toString(method.getModifiers()));
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters) {
                System.out.println("назва параметру: " + parameter.getName());
                System.out.println("тип параметру: " + parameter.getType());
            }
        }
    }
}