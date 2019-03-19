package bouncers.bouncable;

import bouncers.FilledRenderer;
import java.awt.Color;

public class FilledSquare extends Square  {
    public FilledSquare() {
        super(new FilledRenderer());
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}
