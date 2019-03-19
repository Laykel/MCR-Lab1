package bouncers.bouncable;

import bouncers.Renderable;
import java.awt.Shape;
import java.awt.Rectangle;

public abstract class Square extends BShape {
    public Square(Renderable renderer) {
        super(renderer);
    }

    @Override
    public Shape getShape() {
        return new Rectangle(x, y, size, size);
    }
}
