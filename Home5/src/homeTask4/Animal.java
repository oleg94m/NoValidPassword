package homeTask4;
import java.lang.reflect.*;

public class Animal {
    private int age;
    public String name;
    public double weight;

    public Animal(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

