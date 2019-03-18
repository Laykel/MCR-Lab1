package bouncers;

import java.awt.*;

public class FilledDisk extends Disk {


    public FilledDisk() {
        super();
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, size, size);
    }


}
