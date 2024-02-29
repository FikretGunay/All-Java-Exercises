package KendiCalismalarim;

public class W3Constrcutor {
    int modelYear;
    String modelName;
    public W3Constrcutor(int year, String name){
        modelYear=year;
        modelName=name;
    }

    public static void main(String[] args) {
        W3Constrcutor car1= new W3Constrcutor(2010, "Volvo s60");
        System.out.println(car1.modelYear+" "+car1.modelName);
        W3Constrcutor myCar=new W3Constrcutor(2023,"Tesla");
        System.out.println(myCar.modelYear+" "+myCar.modelName);
    }
}
