// You can experiment here, it won’t be checked

import java.util.Scanner;

public class Task {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s1 = sc.nextLine();
    String s2 = sc.nextLine();
    if (!s1.equals(s2)) {
      System.out.println("Строки не совпадают");
    }else{
      System.out.println("Строки совпадают");
    }
  }
}
