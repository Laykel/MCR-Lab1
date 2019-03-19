package bouncers.bouncable;

import bouncers.Bouncable;
import bouncers.Renderable;

/**
 * Class Shape
 */
public abstract class Square extends Shape implements Bouncable {

    public Square(Renderable renderer) { super(renderer); }

}
