package bouncers;

import java.awt.Graphics2D;

/**
 * Singleton BorderRenderer class
 * @author Benjamin Le Guillou, Luc Wachter
 */
public class FilledRenderer implements Renderable {
    // Unique class instance
    private static FilledRenderer instance;

    // Private constructor to forbid object creation
    private FilledRenderer() {}

    /**
     * Draws a bouncable on a graphics object
     * @param g the graphics object to draw onto
     * @param b the bouncable object to draw
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
        g.fill(b.getShape());
    }

    /**
     * Gets a reference to the unique instance of FilledRenderer
     * @return a reference to FilledRenderer
     */
    public static FilledRenderer getInstance() {
        if (instance == null)
            instance = new FilledRenderer();
        return instance;
    }
}
