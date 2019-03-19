package bouncers.bouncable;

import bouncers.BorderRenderer;
import java.awt.Color;

public class BorderDisk extends Disk {
    public BorderDisk() {
        super(new BorderRenderer());
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
