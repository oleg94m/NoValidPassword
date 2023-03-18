import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a= sc.nextLine();
        String c= sc.nextLine();
        String b= sc.nextLine();
 if (a.equals(b)&&b.equals(c)){
     System.out.println("Yes");
 } else System.out.println("No");
    }
}