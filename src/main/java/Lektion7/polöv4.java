package Lektion7;

import java.util.ArrayList;

public class polöv4 {
    public static void main(String[] args) {

        ArrayList<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle());
        shapeList.add(new Square());
        shapeList.add(new Triangle());

        for (Shape shape: shapeList){
            shape.draw();
        }
    }
}
