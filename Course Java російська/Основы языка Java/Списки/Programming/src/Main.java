import java.util.ArrayList;
import java.util.Scanner;

class MyProgram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String>  myArrrayList =new ArrayList<String>();
        myArrrayList.add("1,2,3,3,4");
        for (int i = 0; i < myArrrayList.size(); i++){
            System.out.println(myArrrayList.get(i));
        }
    }
}