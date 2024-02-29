package JUnit;
/*public String firstName;
    public String lastName;
    public Person (String firstName, String lastName){
        this.firstName=firstName;
        this.lastName= lastName;
    }
    public String getFullName (){
        return firstName+ " " +lastName;  (bu hocanin cözumu)*/
public class Person {
    public String firstName;
    public String lastName;

    public Person(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public String getFullName (){

        return firstName+" "+lastName;
    }
}
