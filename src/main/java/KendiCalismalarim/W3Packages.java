package KendiCalismalarim;
import java.util.Scanner;
class W3Packages {
    public static void main(String[] args) {
        Scanner person=new Scanner(System.in);
        String username;
        String pass;
        System.out.println("Enter a username");
        username=person.nextLine();
        System.out.println("Enter a password");
        pass=person.nextLine();

        System.out.println("User name is "+username+" password is "+pass);

    }

}
