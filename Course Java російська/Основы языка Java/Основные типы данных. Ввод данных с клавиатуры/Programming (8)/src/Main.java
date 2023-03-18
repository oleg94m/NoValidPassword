import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        System.out.println(((a%10)+((a/10)%10)+(a/100)));
    }
}