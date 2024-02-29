package Lektion7;

public class PolShapeMain {
    public static void main(String[] args) {
        //Skapa en array av Shape
        Shape[] myShapes = {new Circle(), new Square(), new Triangle()};
        //Loopa igenom och anropa draw metoden för varje form
        for (Shape shape : myShapes) {
            shape.draw();
            printArea.printArea(shape);
        }
    }

    }

