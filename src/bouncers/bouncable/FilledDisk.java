package bouncers.bouncable;

import bouncers.Renderable;

import java.awt.*;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class FilledDisk extends Disk {
    public FilledDisk(Renderable renderer) {
        super(renderer);
    }

    @Override
    public void draw() {

    }

    @Override
    public void move() {

    }

    @Override
    public Shape getShape() {
        return  new Ellipse2D.Double(x,y,size,size);
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
