public class Hop {

        int id;
        String name;
        Address address;



        void display(){
            System.out.println(id+" "+name);
            System.out.println(address.city+" "+address.state+" "+address.country);
        }

        public static void main(String[] args) {
            Address address1=new Address("gzb","UP","india");
            Address address2=new Address("gno","UP","india");

            Emp e=new Emp(111,"varun",address1);
            Emp e2=new Emp(112,"arun",address2);
            display.e;


        }
    }
