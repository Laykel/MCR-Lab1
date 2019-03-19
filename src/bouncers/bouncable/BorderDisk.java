package bouncers.bouncable;

import bouncers.BorderRenderer;
import bouncers.Renderable;

import java.awt.Color;

public class BorderDisk extends Disk {
    @Override
    public Color getColor() {
        return Color.GREEN;
    }

    @Override
    public Renderable getRenderer() {
        return BorderRenderer.getInstance();
    }
}
