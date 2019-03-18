package bouncers;

import javax.swing.JFrame;
import java.awt.*;

public interface Displayer
{
    int getWidth();
    int getHeight();
    Graphics2D getGraphics();
    void repaint();
    void setTitle(String s);
}