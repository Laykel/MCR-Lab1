package bouncers.bouncable;

import bouncers.*;
import java.util.Random;

/**
 * Class BShape
 */
public abstract class BShape implements Bouncable {
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

    protected Renderable renderer;

    /**
     * Constructor
     */
    public BShape(Renderable renderer) {
        Random rand = new Random();

        this.renderer = renderer;

        // Set size
        size = rand.nextInt(MAX_SIZE - MIN_SIZE) + MIN_SIZE;

        // x is the width of the panel - the width of the shape
        x = rand.nextInt(BFrame.getInstance().getWidth() - size);
        // y is the height of the panel - the height of the shape
        y = rand.nextInt(BFrame.getInstance().getHeight() - size);

        // Set movement vector
        dx = rand.nextInt((MAX_SPEED + 1) - -MAX_SPEED) + -MAX_SPEED;
        dy = rand.nextInt((MAX_SPEED + 1) - -MAX_SPEED) + -MAX_SPEED;
    }

    @Override
    public void move() {
        // Adjust movement vectors
        // Bounce if on the wall on the left or on the right
        if (x + size + dx > BFrame.getInstance().getWidth() || x + dx < 0)
            setMotion(-dx, dy);

        // Bounce if on the wall at the bottom or on top
        if (y + size + dy > BFrame.getInstance().getHeight() || y + dy < 0)
            setMotion(dx, -dy);

        // Move the shape
        setPosition(x + dx, y + dy);
    }

    @Override
    public void draw() {
        getRenderer().display(BFrame.getInstance().getGraphics(), this);
    }

    @Override
    public Renderable getRenderer() {
        return renderer;
    }

    /**
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setMotion(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }
}
