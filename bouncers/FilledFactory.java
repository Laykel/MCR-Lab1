package bouncers;

public  class FilledFactory extends ShapeFactory{

    @Override
    public FilledDisk createDisk() {
        return new FilledDisk();
    }

    @Override
    public FilledSquare createSquare() {
        return new FilledSquare();
    }
}
