package bouncers.bouncable;

import bouncers.*;

import java.awt.*;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class BorderDisk extends Disk {
    public BorderDisk() {
        super(new RendererFilled());
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(x, y, size, size);
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
