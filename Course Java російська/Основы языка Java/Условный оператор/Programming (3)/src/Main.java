import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       double a = sc.nextDouble();
        double b = sc.nextDouble();

        if(b!=0){
            double c =a/b;
            System.out.println(c);
        }else
        System.out.println("Error");

    }
}