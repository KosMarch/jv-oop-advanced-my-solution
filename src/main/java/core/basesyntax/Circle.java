package core.basesyntax;

import javax.swing.*;

public class Circle extends Figures {

    private final int radius;
    public Circle(String color, int radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, "
                + "area: " + getArea()
                + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor());

    }

    @Override
    public double getArea() {
        double area = 3.14 * radius * radius;
        return area;
    }
}
