package bouncers.bouncable;

import bouncers.FilledRenderer;
import java.awt.Color;

public class FilledDisk extends Disk {
    public FilledDisk() {
        super(FilledRenderer.getInstance());
    }

    @Override
    public Color getColor() {
        return Color.BLUE;
    }
}
