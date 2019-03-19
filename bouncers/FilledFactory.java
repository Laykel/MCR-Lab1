package bouncers;

import bouncers.bouncable.FilledDisk;
import bouncers.bouncable.FilledSquare;

public  class FilledFactory extends ShapeFactory{

    private static FilledFactory instance;

    private FilledFactory(RendererFill renderer){super(renderer);}

    public static FilledFactory getInstance(RendererFill renderer){

        if (instance == null)
            instance = new FilledFactory(renderer);// instanciation retardée

        return instance;
    }

    @Override
    public FilledDisk createDisk() {
        return new FilledDisk( renderer);
    }

    @Override
    public FilledSquare createSquare() {
        return new FilledSquare( renderer);
    }
}
