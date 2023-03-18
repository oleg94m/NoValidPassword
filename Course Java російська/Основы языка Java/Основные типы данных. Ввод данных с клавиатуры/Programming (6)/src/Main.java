import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
       int a=sc.nextInt();
       int b= sc.nextInt();
       int n = sc.nextInt();

        System.out.print((a*n) + (b*n)/100 + " " + (b*n)%100);
    }
}