package bouncers.gui;

import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;

public interface Displayer {
    /**
     * Gets the width of the panel
     * @return the width of the panel
     */
    int getWidth();

    /**
     * Gets the height of the panel
     * @return the height of the panel
     */
    int getHeight();

    /**
     * Gets an image object (as a Graphics2D) representing the panel's drawing area
     * @return a graphics area on which to draw, of the panel's size
     */
    Graphics2D getGraphics();

    /**
     * Draw the image with the shapes on the panel, and create a new image object
     */
    void repaint();

    /**
     * Sets the frame's title
     * @param s The wanted frame's title
     */
    void setTitle(String s);

    /**
     * Adds a listener for keyboard events
     * @param ka The KeyAdapter we want the frame to respond to
     */
    void addKeyListener(KeyAdapter ka);
}
