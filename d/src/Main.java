
public class Main  {
    public  static void main (String[] args){
System.out.println( new Bannana("Banann").getTasty());
    }
    }
    class  Fruit{
    private final String name;
    Fruit() {;}
        Fruit(String name){
        this.name =name;
        }
        String getTasty(){
        return this.name +" isquit Ok";
        }

    }
    class Bannana extends Fruit{
    private String name;
    Bannana(String name){
        this.name=name;
    }
    String getTasty(){
        return this.name +" isyummy!";
    }
    }


