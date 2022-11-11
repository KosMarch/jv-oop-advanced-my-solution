package core.basesyntax;

public class Main {
    public static void main(String[] args) {
    Circle circle = new Circle("red",2);
    circle.draw();
    Square square = new Square("blue",5);
    square.draw();
    Rectangle rectangle = new Rectangle("grey",5,8);
    rectangle.draw();
    RightTriangle rightTriangle = new RightTriangle("black",5,3.5);
    rightTriangle.draw();
    IsoscelesTrapezoid isoscelesTrapezoid = new IsoscelesTrapezoid("yellow",6,8.6, 5);
    isoscelesTrapezoid.draw();

    }
}
