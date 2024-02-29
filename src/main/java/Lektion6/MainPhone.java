package Lektion6;

public class MainPhone {
    public static void main(String[] args) {
        Phone myPhone= new Phone("Apple", "");
        Phone mySecondPhone= new Phone("Apple", "iPhone 15");
        myPhone.call();
        mySecondPhone.call();

    }
}
