import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                boolean is_0 = false;
                for (int i = 0; i < n; i++){
                    int a = sc.nextInt();
                    if (a == 0){
                        is_0 = true;
                        break;
                    }
                }
                if (is_0)
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }

    }
