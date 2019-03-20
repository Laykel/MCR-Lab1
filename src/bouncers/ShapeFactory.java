package bouncers;

import bouncers.bouncable.Disk;
import bouncers.bouncable.Square;

public abstract class ShapeFactory {
    /**
     * Creates a new Square bouncable object
     * @return a reference to this square
     */
    public abstract Square createSquare();

    /**
     * Creates a new Disk bouncable object
     * @return a reference to this disk
     */
    public abstract Disk createDisk();
}
