package KendiCalismalarim;
//Create a Car object named myCar.
// Call the fullThrottle() and speed() methods
// on the myCar object, and run the program:

public class W3AccessMethods {
    public static void main(String[] args) {
        W3AccessMethods car= new W3AccessMethods();
        car.fullThrottle();
        car.speed(320);
    }
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can.");
    }
    public void speed(int maxSpeed){
        System.out.println("Max speed is "+maxSpeed+".");
    }

}
