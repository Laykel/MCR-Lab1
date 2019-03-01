package bouncers;

import java.util.Random;
import java.awt.Graphics;

/**
 * Class Shape
 */
abstract public class Shape {
    private static final int MAX_SIZE = 60;
    private static final int MIN_SIZE = 30;
    private static final int MAX_SPEED = 5;

    // Coordinates
    private int x, y;
    // Motion vector
    private int dx, dy;
    private int size;

    /**
     * Constructor
     */
    public Shape() {
        Random rand = new Random();

        // Set size
        size = rand.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;

        // x is the width of the panel - the width of the shape
        x = rand.nextInt(750 - size);
        // y is the height of the panel - the height of the shape
        y = rand.nextInt(550 - size);

        // Set motion vector
        dx = rand.nextInt(MAX_SPEED - -MAX_SPEED) + -MAX_SPEED;
        dy = rand.nextInt(MAX_SPEED - -MAX_SPEED) + -MAX_SPEED;
    }

    /**
     */
    abstract public void draw(Graphics g);

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

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setMotion(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }
}
