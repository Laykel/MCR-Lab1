package bouncers;

import bouncers.bouncable.BorderDisk;
import bouncers.bouncable.BorderSquare;

public class BorderFactory extends ShapeFactory {

    private static BorderFactory instance;

    private BorderFactory(RendererBorder renderer){super(renderer);}

    public static BorderFactory getInstance(RendererBorder renderer){

        if (instance == null)
            instance = new BorderFactory(renderer);// instanciation retardée

        return instance;
    }

    @Override
    public BorderDisk createDisk() {
        return new BorderDisk(renderer);
    }

    @Override
    public BorderSquare createSquare() {
        return new BorderSquare(renderer);
    }
}
