package bouncers;

import java.awt.Graphics2D;

public class BorderRenderer implements Renderable {
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }
}
