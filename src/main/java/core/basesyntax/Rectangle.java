package core.basesyntax;

public class Rectangle extends Figures{

    private final double width;
    private final double length;
    public Rectangle(String color, double width, double length) {
        super(color);
        this.width = width;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, "
                + "area: " + getArea()
                + " sq.units, "
                + "width: " + width + " units, "
                + "length: " + length + " units, "
                + "color: " + getColor());

    }

    @Override
    public double getArea() {
        double area = width * length;
        return area;
    }
}
