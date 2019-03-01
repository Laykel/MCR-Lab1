package bouncers;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

/**
 * Extension of the JPanel class
 */
@SuppressWarnings("serial")
public class BPanel extends JPanel {
    private ShapeList shapeList;

    /**
     * Constructor
     */
    public BPanel(ShapeList shapeList) {
        this.shapeList = shapeList;
    }

    /**
     * Override of paintComponent to display the shapes (calls ShapeList.draw())
     *
     * @param g the graphics object on which to paint
     */
    @Override
    public void paintComponent(Graphics g) {
        // Use Graphics2D for awesome antialiasing
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                             RenderingHints.VALUE_ANTIALIAS_ON);
        // Repaint background
        super.paintComponent(g2d);

        // Paint all shapes
        shapeList.drawAllShapes(g2d);
    }
}
