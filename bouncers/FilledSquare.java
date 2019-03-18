package bouncers;

import java.awt.*;

public class FilledSquare extends Square  {

    public FilledSquare() {
        super();
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, size, size);
    }
}
