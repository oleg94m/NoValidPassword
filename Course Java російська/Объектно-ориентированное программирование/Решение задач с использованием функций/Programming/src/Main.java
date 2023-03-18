import java.util.Scanner;

class Programm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(min(a, b, c, d));
    }

    public static int min(int a, int b, int c, int d) {
        if (a < b || a < c || a < d) {
            return a;
        }else
        if (d < b || d < c || d < a) {
            return b;
        }else
        if (c < b || c < a || c < d) {
            return c;
        }

        return d;
    }
}