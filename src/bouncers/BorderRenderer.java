package bouncers;

import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.RenderingHints;

/**
 * Singleton BorderRenderer class
 * @author Benjamin Le Guillou, Luc Wachter
 */
public class BorderRenderer implements Renderable {
    // Unique class instance
    private static BorderRenderer instance;

    // Private constructor to forbid object creation
    private BorderRenderer() {}

    /**
     * Draws a bouncable on a graphics object
     * @param g the graphics object to draw onto
     * @param b the bouncable object to draw
     */
    @Override
    public void display(Graphics2D g, Bouncable b) {
        // Add a bit of antialiasing :-D
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
            RenderingHints.VALUE_ANTIALIAS_ON);
        g.setStroke(new BasicStroke(2));
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }

    /**
     * Gets a reference to the unique instance of BorderRenderer
     * @return a reference to BorderRenderer
     */
    public static BorderRenderer getInstance() {
        if (instance == null)
            instance = new BorderRenderer(); // Lazy instantiation
        return instance;
    }
}
