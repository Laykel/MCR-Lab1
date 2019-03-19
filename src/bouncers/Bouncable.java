package bouncers;

import java.awt.Shape;
import java.awt.Color;

public interface Bouncable {
    void draw();
    void move();
    Renderable getRenderer();
    Color getColor();
    Shape getShape();
}
