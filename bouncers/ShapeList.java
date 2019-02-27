package bouncers;

import java.util.LinkedList;
import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Class ShapeList
 */
public class ShapeList {
    /**
     * Class Shape
     */
    public class Shape {
        private int x, y;
        private int dx, dy;
        private int size;
        private boolean isCircle;

        /**
         * Constructor
         *
         * @param x the initial x coordinate of the shape
         * @param y the initial y coordinate of the shape
         * @param dx the x velocity of the shape
         * @param dy the y velocity of the shape
         * @param size the size of the shape (width and height)
         * @param isCircle whether the shape is a circle or a square
         */
        public Shape(int x, int y, int dx, int dy, int size, boolean isCircle) {
            this.x = x;
            this.y = y;
            this.dx = dx;
            this.dy = dy;
            this.size = size;
            this.isCircle = isCircle;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public int getDX() {
            return dx;
        }

        public int getDY() {
            return dy;
        }

        public int getSize() {
            return size;
        }

        public boolean getIsCircle() {
            return isCircle;
        }

        public void setPosition(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void setMotion(int dx, int dy) {
            this.dx = dx;
            this.dy = dy;
        }
    }

    LinkedList<Shape> shapeList;

    /**
     * Constructor
     *
     * @param nbrOfShapes The number of shapes to generate randomly
     */
    public ShapeList(int nbrOfShapes) {
        shapeList = new LinkedList<>();
        Random rand = new Random();

        int size;
        // Initial positions
        int x, y;
        // Initial motion vector
        int dx, dy;
        // Circle or square ?
        boolean isCircle = true;

        for (int i = 0; i < nbrOfShapes; i++) {
            size = rand.nextInt(80 - 30) + 20;
            // x is the width of the panel - the width of the shape
            x = rand.nextInt(750 - size);
            // y is the height of the panel - the height of the shape
            y = rand.nextInt(550 - size);
            dx = rand.nextInt(10 - -10) + -10;
            dy = rand.nextInt(10 - -10) + -10;

            if (i >= nbrOfShapes / 2)
                isCircle = false;

            shapeList.add(new Shape(x, y, dx, dy, size, isCircle));
        }
    }

    /**
     * Method called by JPanel's paintComponent
     *
     * @param g the Graphics object on which to paint
     */
    public void draw(Graphics g) {
        for (Shape s : shapeList) {
            if (s.getIsCircle()) {
                g.setColor(Color.BLUE);
                g.fillOval(s.x, s.y, s.size, s.size);
            }
            else {
                g.setColor(Color.YELLOW);
                g.fillRect(s.x, s.y, s.size, s.size);
            }
        }
    }
}
