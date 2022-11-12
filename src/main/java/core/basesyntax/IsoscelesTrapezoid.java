package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double width;
    private final double length;
    private final double height;

    public IsoscelesTrapezoid(String color, double width,double length, double height){
        super(color);
        this.width = width;
        this.length = length;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("Figure: IsoscelesTrapezoid, "
                + "area: " + getArea()
                + " sq.units, "
                + "width: " + width + " units, "
                + "length: " + length + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor());

    }

    @Override
    public double getArea() {
        double area = (width + length) / 2 * height;
        return area;
    }
}
