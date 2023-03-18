import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int milkAmount = 40; // ml
        int powderAmount = 50; // g
        int eggsCount = 30; // items
        int sugarAmount = 500; // g
        int oilAmount = 30; // ml
        int appleCount = 1;

boolean counter = false;
        if (milkAmount >= 1000 && powderAmount >= 400 && oilAmount >= 30 && sugarAmount >= 10) {
            counter =true;

            //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
            System.out.println(" can bake Pancakes");
        }

        if (milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5) {
            counter =true;

            //milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Omelette");
        }
        if (milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4 && appleCount >=3){
        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
            counter =true;
        System.out.println("Apple pie");}
        if (counter==false){
            System.out.println("не вийдет");
        }

    }
}
