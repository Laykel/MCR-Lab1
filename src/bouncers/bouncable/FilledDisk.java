package bouncers.bouncable;

import bouncers.FilledRenderer;
import bouncers.Renderable;

import java.awt.Color;

public class FilledDisk extends Disk {
    @Override
    public Color getColor() {
        return Color.BLUE;
    }

    @Override
    public Renderable getRenderer() {
        return FilledRenderer.getInstance();
    }
}
