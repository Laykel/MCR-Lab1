package bouncers.bouncable;

import java.awt.Shape;
import java.awt.Rectangle;

/**
 * Abstract square class
 * @author Benjamin Le Guillou, Luc Wachter
 */
public abstract class Square extends Bouncer {
    /**
     * Get the shape of the bouncer
     * @return the AWT shape of the bouncer
     */
    @Override
    public Shape getShape() {
        return new Rectangle(x, y, size, size);
    }
}
