package bouncers.bouncable;

import java.awt.Shape;
import java.awt.Rectangle;

public abstract class Square extends Bouncer {
    @Override
    public Shape getShape() {
        return new Rectangle(x, y, size, size);
    }
}
