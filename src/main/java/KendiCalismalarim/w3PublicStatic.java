package KendiCalismalarim;

public class w3PublicStatic {
    public static void main(String[] args) {
        myStatic();
        // myPublic(); gives an error, I should create an object
        w3PublicStatic myObj= new w3PublicStatic();
        myObj.myPublic();

    }
    public void myPublic(){
        System.out.println("Public methods must be called by creating objects");
    }
    static void myStatic(){
        System.out.println("Static methods can be called without creating objects");
    }

}
