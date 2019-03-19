package bouncers.bouncable;

import bouncers.*;

import java.awt.*;
import java.awt.Shape;

public class BorderSquare extends Square {
    public BorderSquare() {
       super(new RendererBorder());
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
