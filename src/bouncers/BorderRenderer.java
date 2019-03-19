package bouncers;

import java.awt.Graphics2D;

public class BorderRenderer implements Renderable {
    private static BorderRenderer instance;

    private BorderRenderer() {}

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
    }

    public static BorderRenderer getInstance() {
        if (instance == null)
            instance = new BorderRenderer();
        return instance;
    }
}
