import java.util.Scanner;

class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        twoWords(s1, s2);
    }
     public static  void twoWords(String s1, String s2){

         if (s1.length()>s2.length()){
             System.out.println("Первая строка длиннее");
         }

         if (s1.length()<s2.length()){
             System.out.println("Вторая строка длиннее");
         }

         if (s1.length()==s2.length()){
             System.out.println("Равная длина");
         }
     }

    //разместите свою функцию, например здесь
}