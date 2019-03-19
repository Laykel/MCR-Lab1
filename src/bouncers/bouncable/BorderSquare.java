package bouncers.bouncable;

import bouncers.BorderRenderer;

import java.awt.Color;

public class BorderSquare extends Square {
    public BorderSquare() {
       super(BorderRenderer.getInstance());
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
