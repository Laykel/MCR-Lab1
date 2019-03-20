package bouncers.bouncable;

import bouncers.BorderRenderer;
import bouncers.Renderable;

import java.awt.Color;

/**
 * BorderDisk class for empty disks
 * @author Benjamin Le Guillou, Luc Wachter
 */
public class BorderDisk extends Disk {
    /**
     * Get the bouncer's color
     * @return the bouncer's color
     */
    @Override
    public Color getColor() {
        return Color.GREEN;
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
