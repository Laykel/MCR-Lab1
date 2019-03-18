package bouncers;

import java.awt.*;

public class BorderDisk extends Disk {

    public BorderDisk(){super();}

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval(x, y, size, size);
    }
}
