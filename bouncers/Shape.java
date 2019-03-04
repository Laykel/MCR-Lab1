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
    private static final int INITIAL_PANEL_WIDTH = 750;
    private static final int INITIAL_PANEL_HEIGHT = 550;

    // Coordinates
    protected int x, y;
    // Movement vector
    private int dx, dy;
    // Width and height of the shape
    protected int size;

    /**
     * Constructor
     */
    public Shape() {
        Random rand = new Random();

        // Set size
        size = rand.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;

        // x is the width of the panel - the width of the shape
        x = rand.nextInt(INITIAL_PANEL_WIDTH - size);
        // y is the height of the panel - the height of the shape
        y = rand.nextInt(INITIAL_PANEL_HEIGHT - size);

        // Set movement vector
        dx = rand.nextInt(MAX_SPEED - -MAX_SPEED) + -MAX_SPEED;
        dy = rand.nextInt(MAX_SPEED - -MAX_SPEED) + -MAX_SPEED;
    }

    public void move(int panelWidth, int panelHeight) {
        // Adjust movement vectors
        // Bounce if on the wall on the left or on the right
        if (x + size + dx > panelWidth || x + dx < 0)
            setMotion(-dx, dy);

        // Bounce if on the wall at the bottom or on top
        if (y + size + dy > panelHeight || y + dy < 0)
            setMotion(dx, -dy);

        // Execute movement
        setPosition(x + dx, y + dy);
    }

    /**
     */
    abstract public void draw(Graphics g);

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setMotion(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }
}
