// This is a number task. You can use this editor as a playground
class Task{
  public static void main(String[] args){
    int a = 255;
    int b = a++;
    a /= 8;
    b *= 2;
    int c = b / 10;
    if (a + b + c > 600){
      System.out.println(--b);
    }else{
      System.out.println(c++);
    }
  }
}