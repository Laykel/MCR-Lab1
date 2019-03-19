package bouncers.bouncable;

import bouncers.FilledRenderer;
import bouncers.Renderable;

import java.awt.Color;

public class FilledSquare extends Square  {
    @Override
    public Color getColor() {
        return Color.ORANGE;
    }

    @Override
    public Renderable getRenderer() {
        return FilledRenderer.getInstance();
    }
}
