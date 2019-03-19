package bouncers;

import bouncers.bouncable.FilledDisk;
import bouncers.bouncable.FilledSquare;

public  class FilledFactory extends ShapeFactory{
    private static FilledFactory instance;

    private FilledFactory() {}

    public static FilledFactory getInstance() {
        if (instance == null)
            instance = new FilledFactory();
        return instance;
    }

    @Override
    public FilledDisk createDisk() {
        return new FilledDisk();
    }

    @Override
    public FilledSquare createSquare() {
        return new FilledSquare();
    }
}
