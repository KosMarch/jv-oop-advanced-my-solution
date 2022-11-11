package core.basesyntax;

public abstract class Figures implements Getable, Drawable{

    private String color;
    private float area;

    public Figures(){}
    public Figures(String color){
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
