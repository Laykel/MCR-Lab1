package bouncers;

import bouncers.bouncable.Disk;
import bouncers.bouncable.Square;

public abstract class ShapeFactory {

    protected Renderable renderer;

    public ShapeFactory(Renderable renderer) {
        this.renderer = renderer;
    }

    public abstract Square createSquare();

    public abstract Disk createDisk();
}
