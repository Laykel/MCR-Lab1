package bouncers;

import java.awt.Graphics2D;

public interface Renderable {
    /**
     * Draws a bouncable on a graphics object
     * @param g the graphics object to draw onto
     * @param b the bouncable object to draw
     */
    void display(Graphics2D g, Bouncable b);
}
