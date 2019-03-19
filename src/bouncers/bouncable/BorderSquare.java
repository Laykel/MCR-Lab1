package bouncers.bouncable;

import bouncers.*;

import java.awt.*;
import java.awt.Shape;

public class BorderSquare extends Square {
    public BorderSquare() {
       super(new RendererBorder());
    }

    @Override
    public void draw() {
    }

    @Override
    public void move() {
    }

    @Override
    public Shape getShape() {
        return new Rectangle(x,y,size,size);
    }


    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
