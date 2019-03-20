package bouncers.bouncable;

import bouncers.BorderRenderer;
import bouncers.Renderable;

import java.awt.Color;

/**
 * BorderSquare class for empty squares
 * @author Benjamin Le Guillou, Luc Wachter
 */
public class BorderSquare extends Square {
    /**
     * Get the bouncer's color
     * @return the bouncer's color
     */
    @Override
    public Color getColor() {
        return Color.RED;
    }

    /**
     * Get the bouncer's renderer
     * @return the bouncer's renderer
     */
    @Override
    public Renderable getRenderer() {
        return BorderRenderer.getInstance();
    }
}
