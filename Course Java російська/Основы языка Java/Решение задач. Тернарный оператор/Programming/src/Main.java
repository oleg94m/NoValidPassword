import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        if(a>=21){
            System.out.println("Да");
        }else System.out.println("Нет");

    }
}