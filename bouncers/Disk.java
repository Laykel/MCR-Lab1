package bouncers;

import java.awt.Graphics;
import java.awt.Color;

public class Disk extends Shape {
    public Disk() {
        super();
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, size, size);
    }
}
