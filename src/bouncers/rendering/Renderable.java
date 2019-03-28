package bouncers.rendering;

import bouncers.bounceable.Bounceable;

import java.awt.Graphics2D;

public interface Renderable {
    /**
     * Draws a bounceable on a graphics object
     * @param g the graphics object to draw onto
     * @param b the bounceable object to draw
     */
    void display(Graphics2D g, Bounceable b);
}
