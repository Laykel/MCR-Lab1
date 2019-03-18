package bouncers;

import java.awt.Graphics;
import java.awt.Color;

public abstract class Square extends Shape {
    public Square() {
        super();
    }

    public abstract void draw(Graphics g);
}
