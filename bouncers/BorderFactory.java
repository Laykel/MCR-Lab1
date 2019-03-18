package bouncers;

public class BorderFactory extends ShapeFactory {

    @Override
    public BorderDisk createDisk() {
        return new BorderDisk();
    }

    @Override
    public BorderSquare createSquare() {
        return new BorderSquare();
    }
}
