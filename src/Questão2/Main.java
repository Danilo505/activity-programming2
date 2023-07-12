package Questão2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.toStringR();

        Rectangle rectangle = new Rectangle(15,7);
        rectangle.toStringR();

        Triangle triangle = new EquillateralTriangle(7);
        triangle.toStringR();

        Rectangle square = new Square(2);
        square.toStringR();
    }
}