package bouncers.bouncable;

import bouncers.Bouncable;
import bouncers.Renderable;

import java.awt.Graphics;

public abstract class Square extends Shape implements Bouncable {
    public Square(Renderable renderer) { super(renderer); }

}
