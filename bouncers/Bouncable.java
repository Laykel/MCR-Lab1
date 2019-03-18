package bouncers;

import java.awt.*;

public interface Bouncable
{
    public void draw();
    public void move();
    public Renderable getRenderer();
    public Color getColor();
    public Shape getShape();
}