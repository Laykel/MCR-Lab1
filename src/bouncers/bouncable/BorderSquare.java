package bouncers.bouncable;

import bouncers.BorderRenderer;
import bouncers.Renderable;

import java.awt.Color;

public class BorderSquare extends Square {
    @Override
    public Color getColor() {
        return Color.RED;
    }

    @Override
    public Renderable getRenderer() {
        return BorderRenderer.getInstance();
    }
}
