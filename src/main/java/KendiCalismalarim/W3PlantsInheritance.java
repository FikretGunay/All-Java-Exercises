package KendiCalismalarim;

public class W3PlantsInheritance {
}
class Plants{
    protected String plant= "Mint";
    protected String colour= "Green";
    public void grow(){
        System.out.println("A plant needs water and sun to grow.");
    }}
class GreenPlants extends Plants{
    public static void main(String[] args) {
        Plants myPlant= new Plants();
        myPlant.grow();
        System.out.println("My plant is "+myPlant.plant+" the colour of my plant is"+ myPlant.colour);
    }
}
