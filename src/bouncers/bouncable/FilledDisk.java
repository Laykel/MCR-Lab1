package bouncers.bouncable;

import bouncers.FilledRenderer;
import bouncers.Renderable;

import java.awt.Color;

/**
 * BorderDisk class for full disks
 * @author Benjamin Le Guillou, Luc Wachter
 */
public class FilledDisk extends Disk {
    /**
     * Get the bouncer's color
     * @return the bouncer's color
     */
    @Override
    public Color getColor() {
        return Color.BLUE;
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
