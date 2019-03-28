package bouncers.bounceable;

import bouncers.rendering.Renderable;

import java.awt.Shape;
import java.awt.Color;

public interface Bounceable {
    /**
     * Call the bouncer's renderer
     */
    void draw();

    /**
     * Execute the bouncer's movement, and bounce on walls
     */
    void move();

    /**
     * Get the bouncer's renderer
     * @return the bouncer's renderer
     */
    Renderable getRenderer();

    /**
     * Get the bouncer's color
     * @return the bouncer's color
     */
    Color getColor();

    /**
     * Get the shape of the bouncer
     * @return the AWT shape of the bouncer
     */
    Shape getShape();
}
