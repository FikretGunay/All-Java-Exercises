package Lektion6;

public class Phone {
    public String brand;

    public String model;

    public void call(){
        System.out.println(model+" is calling...");
    }

    public Phone(String brand, String model){
        this.brand=brand;
        this.model=model;
    }

    //buraya kadar olan kisim övning 9.yani klassi kurmak buraya kadar.
}
