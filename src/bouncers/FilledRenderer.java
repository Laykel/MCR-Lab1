package bouncers;

import java.awt.Graphics2D;

public class FilledRenderer implements Renderable {
    private static FilledRenderer instance;

    private FilledRenderer() {}

    @Override
    public void display(Graphics2D g, Bouncable b) {
        g.setColor(b.getColor());
        g.draw(b.getShape());
        g.fill(b.getShape());
    }

    public static FilledRenderer getInstance() {
        if (instance == null)
            instance = new FilledRenderer();
        return instance;
    }
}
