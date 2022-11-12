package core.basesyntax;

import java.util.Random;

public class ColorSupplier {

    Random random = new Random();
    public String getRandomColor() {
        int randomColorNumber = random.nextInt(Color.values().length);
        return Color.values()[randomColorNumber].name();
    }
}
