package KendiCalismalarim;

public class W3Method {
    static void myMethod(String name,int age){
        System.out.println("Welcome to your first method:) "+ name+". Your age is "+age);
    }

    static int add (int a,int b){
        return a+b;
    }
    static int add10(int a,int b){
        return 10+a+b;
    }
    public static void main(String[] args) {
        int z=add(5,5);
        System.out.println(add(4,5));
        System.out.println(z);
        System.out.println(add10(5,5));;
        myMethod("Zeynep",27);
        myMethod("Zehra",25);
        myMethod("Servet",23);
    }
}
