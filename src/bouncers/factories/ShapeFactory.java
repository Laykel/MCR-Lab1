package bouncers.factories;

import bouncers.bounceable.Disk;
import bouncers.bounceable.Square;

public abstract class ShapeFactory {
    /**
     * Creates a new Square bounceable object
     * @return a reference to this square
     */
    public abstract Square createSquare();

    /**
     * Creates a new Disk bounceable object
     * @return a reference to this disk
     */
    public abstract Disk createDisk();
}
