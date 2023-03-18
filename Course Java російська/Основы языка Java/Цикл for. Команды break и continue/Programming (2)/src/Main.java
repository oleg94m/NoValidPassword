import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int suma=0;

        for (int i = a;i<=b;i++) {
            suma += i;

        }

        System.out.println(suma);
    }
}