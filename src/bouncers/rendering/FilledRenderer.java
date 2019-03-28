package bouncers.rendering;

import bouncers.bounceable.Bounceable;

import java.awt.Graphics2D;
import java.awt.RenderingHints;

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
     * Draws a bounceable on a graphics object
     * @param g the graphics object to draw onto
     * @param b the bounceable object to draw
     */
    @Override
    public void display(Graphics2D g, Bounceable b) {
        // Add a bit of antialiasing :-D
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                           RenderingHints.VALUE_ANTIALIAS_ON);
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
