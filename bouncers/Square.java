package bouncers;

import java.awt.Graphics;
import java.awt.Color;

public class Square extends Shape {
    public Square() {
        super();
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, size, size);
    }
}
