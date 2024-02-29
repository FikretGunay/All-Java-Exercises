package KendiCalismalarim;

public class Main {

    //w3 Multiple objects in a class
        int x=5;

        public static void main(String[] args) {
            KendiCalismalarim.Main obj1= new KendiCalismalarim.Main();
            KendiCalismalarim.Main obj2= new KendiCalismalarim.Main();
            KendiCalismalarim.Main obj3= new KendiCalismalarim.Main();
            obj2.x=10;
            obj3.x=15;
            System.out.println(obj1.x);
            System.out.println(obj2.x);
            System.out.println(obj3.x);

        }
    }

