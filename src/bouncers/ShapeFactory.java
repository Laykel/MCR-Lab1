package bouncers;

import bouncers.bouncable.Disk;
import bouncers.bouncable.Square;

public abstract class ShapeFactory {
    public abstract Square createSquare();

    public abstract Disk createDisk();
}
