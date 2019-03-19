package bouncers.bouncable;

import bouncers.Renderable;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public abstract class Disk extends BShape {
    public Disk(Renderable renderer) {
        super(renderer);
    }

    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(x, y, size, size);
    }
}
