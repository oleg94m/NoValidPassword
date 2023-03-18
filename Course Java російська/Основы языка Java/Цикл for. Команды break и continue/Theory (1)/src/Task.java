// You can experiment here, it won’t be checked

public class Task {
  public static void main(String[] args) {
    for (int i = 0; i < 15; i++){
      if (i == 9){
        System.out.println("9 найдено");
        continue;
      }
      System.out.println("это число " + i);
    }
    System.out.println("конец программы");
  }
}
