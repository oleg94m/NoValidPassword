package HomeTask2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Class {
    public static void main(String[] args) {
        int[] list= new int[10];
        for (int i=0;i<list.length;i++){
            list[i]=(int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(list));

        int sum =Arrays.stream(list).map(x->x*x).reduce(0,(acc,x)->acc+x);
        System.out.println("Sum of Squeres"+sum);


    }
}
