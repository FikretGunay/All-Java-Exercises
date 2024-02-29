package KendiCalismalarim;

public class W3MultipleAttributes {
    String name= "Zeynep";
    String sname="Gunay";
    int age= 33;
    String job= "academician";

    public static void main(String[] args) {
        W3MultipleAttributes person1 = new W3MultipleAttributes();
        System.out.println("The name of the customer is " +(person1.name)+" "+person1.sname);
        System.out.println("The customer is "+ person1.age +" years old.");
        System.out.println("The customer is an "+person1.job+ ".");
    }
}
