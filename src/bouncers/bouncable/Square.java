package bouncers.bouncable;

import bouncers.Bouncable;
import bouncers.Renderable;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Shape;

public abstract class Square extends Shape implements Bouncable {
    public Square(Renderable renderer) {
        super(renderer);
    }

    @Override
    public Shape getShape() {
        return new Rectangle(x, y, size, size);
    }
}
