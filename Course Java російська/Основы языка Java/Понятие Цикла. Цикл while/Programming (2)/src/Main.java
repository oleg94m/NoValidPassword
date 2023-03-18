import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int i=0;
        while (a<=b){

            if ((a%3==0)){
                if(a%5!=0){
                    i++;
                }

            }
a++;

        }

        System.out.println(i);
    }
}