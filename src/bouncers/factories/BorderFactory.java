package bouncers.factories;

import bouncers.bounceable.BorderDisk;
import bouncers.bounceable.BorderSquare;

/**
 * Singleton BorderFactory class
 * @author Benjamin Le Guillou, Luc Wachter
 */
public class BorderFactory extends ShapeFactory {
    // Unique class instance
    private static BorderFactory instance;

    // Private constructor to forbid object creation
    private BorderFactory() {}

    /**
     * Gets a reference to the unique instance of BorderFactory
     * @return a reference to BorderFactory
     */
    public static BorderFactory getInstance() {
        if (instance == null)
            instance = new BorderFactory();
        return instance;
    }

    /**
     * Creates a new Disk bounceable object
     * @return a reference to this disk
     */
    @Override
    public BorderDisk createDisk() {
        return new BorderDisk();
    }

    /**
     * Creates a new Square bounceable object
     * @return a reference to this square
     */
    @Override
    public BorderSquare createSquare() {
        return new BorderSquare();
    }
}
