package bouncers.bounceable;

import bouncers.rendering.FilledRenderer;
import bouncers.rendering.Renderable;

import java.awt.Color;

/**
 * BorderSquare class for full square
 * @author Benjamin Le Guillou, Luc Wachter
 */
public class FilledSquare extends Square  {
    /**
     * Get the bouncer's color
     * @return the bouncer's color
     */
    @Override
    public Color getColor() {
        return Color.ORANGE;
    }

    /**
     * Get the bouncer's renderer
     * @return the bouncer's renderer
     */
    @Override
    public Renderable getRenderer() {
        return FilledRenderer.getInstance();
    }
}
