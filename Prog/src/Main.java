public class Main {


        String color;
        double weight;
        int year;
        double speed;
        Main(String color,double weight, int year, double speed){
            this.color=color;
            this.year=year;
            this.weight =weight;
            this.speed =speed;
        }

        void beep(){
            System.out.println("BEEP!!!");
              }
              void acceleration(double a){
            speed=speed+a;
              }
              void deceleration(double b){
            if( speed-b>=0) speed=speed-b;
              }
              void print(){
            System.out.println("Color"+color);
            System.out.println("Weight:"+weight);
            System.out.println("Year"+year);
            System.out.println("Speed:"+speed);
              }
              Main repairCar(Main a, String newcolor){
            a.color=newcolor;
            return a;
              }
    public static void main(String[] args){
            Main m1= new Main("green",1222,1999,100);
            m1.print();
            m1.repairCar(m1,"black");
            m1.print();
            m1.deceleration(20);
            m1.print();
            m1.acceleration(20);
    }
}
