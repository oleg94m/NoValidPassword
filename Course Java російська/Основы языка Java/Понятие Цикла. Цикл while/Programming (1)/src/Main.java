import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
        int c=0;
    while (a<=b){
        c=c+a;
        a++;

    }
        System.out.println(c);
}}