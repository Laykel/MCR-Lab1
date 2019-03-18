package bouncers;

import bouncers.bouncable.FilledDisk;
import bouncers.bouncable.FilledSquare;

public  class FilledFactory extends ShapeFactory{

    public FilledFactory(RendererFill renderer){super(renderer);}

    @Override
    public FilledDisk createDisk() {
        return new FilledDisk( renderer);
    }

    @Override
    public FilledSquare createSquare() {
        return new FilledSquare( renderer);
    }
}
