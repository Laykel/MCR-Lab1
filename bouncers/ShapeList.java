package bouncers;

import java.util.LinkedList;
import java.awt.Graphics;

/**
 * Class ShapeList
 */
public class ShapeList {
    private LinkedList<Shape> shapeList;

    /**
     * Constructor
     *
     * @param nbrOfShapes The number of shapes to generate randomly
     */
    public ShapeList(int nbrOfShapes) {
        shapeList = new LinkedList<>();

        for (int i = 0; i < nbrOfShapes / 2; i++) {
            shapeList.add(new Disk());
        }
        for (int i = 0; i < nbrOfShapes / 2; i++) {
            shapeList.add(new Square());
        }
    }

    /**
     * Method called by JPanel's paintComponent
     *
     * @param g the Graphics object on which to paint
     */
    public void drawAllShapes(Graphics g) {
        for (Shape s : shapeList) {
            s.draw(g);
        }
    }

    public LinkedList<Shape> getShapeList() {
        return shapeList;
    }
}
