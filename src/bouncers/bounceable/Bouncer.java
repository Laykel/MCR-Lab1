package bouncers.bounceable;

import bouncers.gui.BouncersView;

import java.util.Random;

/**
 * Implementation of Bounceable
 * @author Benjamin Le Guillou, Luc Wachter
 */
public abstract class Bouncer implements Bounceable {
    // Shape properties
    private static final int MIN_SIZE = 30;
    private static final int MAX_SIZE = 60;
    private static final int MAX_SPEED = 5;

    // Coordinates
    protected int x, y;
    // Width and height of the shape
    protected int size;
    // Movement vector
    private int dx, dy;

    static Random rand = new Random();

    /**
     * Constructor
     * Sets the bouncer's properties randomly
     */
    public Bouncer() {
        // Set size
        size = rand.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;

        // x is the width of the panel - the width of the shape
        x = rand.nextInt(BouncersView.getInstance().getWidth() - size);
        // y is the height of the panel - the height of the shape
        y = rand.nextInt(BouncersView.getInstance().getHeight() - size);

        // Set movement vector
        dx = rand.nextInt((MAX_SPEED + 1) - -MAX_SPEED) + -MAX_SPEED;
        dy = rand.nextInt((MAX_SPEED + 1) - -MAX_SPEED) + -MAX_SPEED;
    }

    /**
     * Execute the bouncer's movement, and bounce on walls
     */
    @Override
    public void move() {
        // Adjust movement vectors
        // Bounce if on the wall on the left or on the right
        if (x + size + dx > BouncersView.getInstance().getWidth() || x + dx < 0)
            setMotion(-dx, dy);

        // Bounce if on the wall at the bottom or on top
        if (y + size + dy > BouncersView.getInstance().getHeight() || y + dy < 0)
            setMotion(dx, -dy);

        // Move the shape
        setPosition(x + dx, y + dy);
    }

    /**
     * Call the bouncer's renderer
     */
    @Override
    public void draw() {
        getRenderer().display(BouncersView.getInstance().getGraphics(), this);
    }

    /**
     * Set the bouncer's position
     * @param x its x position
     * @param y its y position
     */
    private void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Set the bouncer's velocity
     * @param dx its velocity on the x axis
     * @param dy its velocity on the y axis
     */
    private void setMotion(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }
}
