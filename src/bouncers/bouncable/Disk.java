package bouncers.bouncable;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public abstract class Disk extends Bouncer {
    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(x, y, size, size);
    }
}
