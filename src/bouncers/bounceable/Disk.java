package bouncers.bounceable;

import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 * Abstract disk class
 * @author Benjamin Le Guillou, Luc Wachter
 */
public abstract class Disk extends Bouncer {
    /**
     * Get the shape of the bouncer
     * @return the AWT shape of the bouncer
     */
    @Override
    public Shape getShape() {
        return new Ellipse2D.Double(x, y, size, size);
    }
}
