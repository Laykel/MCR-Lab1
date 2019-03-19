package bouncers.bouncable;

import bouncers.*;

import java.awt.*;
import java.awt.Shape;

public class FilledSquare extends Square  {
    public FilledSquare() {
        super(new RendererFilled());
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
