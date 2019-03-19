package bouncers;

import java.awt.*;

public class RendererFilled implements Renderable {
    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape()); // Get shape from bouncable
        g.fill(b.getShape());
    }
}
