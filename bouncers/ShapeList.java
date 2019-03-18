package bouncers;

import bouncers.bouncable.Shape;

import java.awt.*;
import java.util.LinkedList;

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
    public ShapeList(int nbrOfShapes,ShapeFactory factory) {
        shapeList = new LinkedList<>();

        for (int i = 0; i < nbrOfShapes / 2; i++) {
            shapeList.add(factory.createDisk());
        }
        for (int i = 0; i < nbrOfShapes / 2; i++) {
            shapeList.add(factory.createSquare());
        }
    }

    /**
     * Method called by JPanel's paintComponent
     *
     * @param g the Graphics object on which to paint
     */
    public void drawAllShapes(Graphics2D g) {
        for (Shape s : shapeList) {
            s.getRenderer().display(g,s);

            //s.draw(g);
        }
    }

    public LinkedList<Shape> getShapeList() {
        return shapeList;
    }
}
