package bouncers.factories;

import bouncers.bounceable.FilledDisk;
import bouncers.bounceable.FilledSquare;

/**
 * Singleton FilledFactory class
 * @author Benjamin Le Guillou, Luc Wachter
 */
public  class FilledFactory extends ShapeFactory{
    // Unique class instance
    private static FilledFactory instance;

    // Private constructor to forbid object creation
    private FilledFactory() {}

    /**
     * Gets a reference to the unique instance of FilledFactory
     * @return a reference to FilledFactory
     */
    public static FilledFactory getInstance() {
        if (instance == null)
            instance = new FilledFactory();
        return instance;
    }

    /**
     * Creates a new Disk bounceable object
     * @return a reference to this disk
     */
    @Override
    public FilledDisk createDisk() {
        return new FilledDisk();
    }

    /**
     * Creates a new Square bounceable object
     * @return a reference to this square
     */
    @Override
    public FilledSquare createSquare() {
        return new FilledSquare();
    }
}
