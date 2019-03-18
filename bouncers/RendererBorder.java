package bouncers;

import java.awt.*;

public class RendererBorder implements Renderable {

    @Override
    public void display(Graphics2D g, Bouncable b) {

        g.setColor(b.getColor());
        g.draw(b.getShape());
    }
}