package bouncers;

import java.awt.*;

public class BorderSquare extends Square {

    public BorderSquare() {
        super();
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.drawRect(x, y, size, size);
    }
}
