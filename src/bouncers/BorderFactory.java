package bouncers;

import bouncers.bouncable.BorderDisk;
import bouncers.bouncable.BorderSquare;

public class BorderFactory extends ShapeFactory {
    private static BorderFactory instance;

    private BorderFactory() {}

    public static BorderFactory getInstance() {
        if (instance == null)
            new BorderFactory();
        return instance;
    }

    @Override
    public BorderDisk createDisk() {
        return new BorderDisk(new RendererBorder());
    }

    @Override
    public BorderSquare createSquare() {
        return new BorderSquare(new RendererBorder());
    }
}
