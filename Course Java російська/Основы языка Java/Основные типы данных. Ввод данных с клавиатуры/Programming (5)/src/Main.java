import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();


        System.out.println(n+2-(n%2));
    }
}