package core.basesyntax;

public class Main {

    private static FigureSupplier figureSupplier = new FigureSupplier();

    public static void main(String[] args) {

        Figure[] figures = new Figure[6];
        for (int i = 0; i < figures.length/2; i++) {
            figures[i] = figureSupplier.getRandomFigure();
            figures[i].draw();
        }
        figureSupplier.getDefaultFigure().draw();
    }
}
