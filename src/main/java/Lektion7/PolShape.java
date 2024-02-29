package Lektion7;

abstract class Shape {
    abstract void draw();

}
class Circle extends Shape {
    double radius;
    @Override
    void draw(){
        System.out.println("Draw a circle");
    }

}
class Square extends Shape{
    double side;
    @Override
    void draw(){
        System.out.println("Draw a square");
    }

}
class Triangle extends Shape{
    double base;
    double height;
    @Override
    void draw(){
        System.out.println("Draw a triangle");
    }

}
class printArea {
    static void printArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            double area = Math.PI * Math.pow(circle.radius, 2);
            System.out.println("The area of the circle is: " + area);
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            double area = Math.pow(square.side, 2);
            System.out.println("The area of the square is: " + area);
        } else if (shape instanceof Triangle) {
            Triangle triangle = (Triangle) shape;
            double area = 0.5 * triangle.base * triangle.height;
            System.out.println("The area of the triangle is: " + area);
        }
    }
}