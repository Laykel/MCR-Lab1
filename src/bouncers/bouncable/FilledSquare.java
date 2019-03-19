package bouncers.bouncable;

import bouncers.*;

import java.awt.*;
import java.awt.Shape;

public class FilledSquare extends Square  {
    public FilledSquare() {
        super(new RendererFilled());
    }

    @Override
    public Color getColor() {
        return Color.ORANGE;
    }
}
