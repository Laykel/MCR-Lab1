package bouncers;

import bouncers.bouncable.BorderDisk;
import bouncers.bouncable.BorderSquare;

public class BorderFactory extends ShapeFactory {

    public BorderFactory(RendererBorder renderer) {
        super(renderer);
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
