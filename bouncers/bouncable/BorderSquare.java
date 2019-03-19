package bouncers.bouncable;

import bouncers.Renderable;

import java.awt.*;
import java.awt.Shape;

public class BorderSquare extends Square {

    public BorderSquare(Renderable renderer) { super(renderer); }

    @Override
    public Shape getShape() {
        return new Rectangle(x,y,size,size);
    }


    @Override
    public Color getColor() {
        return Color.RED;
    }
}
