package bouncers.bouncable;

import bouncers.FilledRenderer;
import java.awt.Color;

public class FilledSquare extends Square  {
    public FilledSquare() {
        super(FilledRenderer.getInstance());
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}
