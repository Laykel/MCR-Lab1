package bouncers;

import javax.swing.JFrame;
import java.lang.Thread;

/**
 * Extension of the JFrame class
 */
@SuppressWarnings("serial")
public class BFrame extends JFrame {
    // Number of refresh per second
    private static final int UPDATE_RATE = 80;
    private static final int NBR_OF_SHAPES = 40;

    // The panel where the magic happens
    private BPanel pan;
    // Generation of a list of random shapes
    private ShapeList shapeList = new ShapeList(NBR_OF_SHAPES);

    /**
     * Constructor
     */
    public BFrame() {
        this.setTitle("Bouncers");

        this.setSize(800, 600);
        // this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pan = new BPanel(shapeList);
        this.setContentPane(pan);

        this.setVisible(true);

        move();
    }

    /**
     * Method controlling the shapes' movements
     */
    private void move() {
        while (true) {
            for (ShapeList.Shape s : shapeList.shapeList) {
                // Get shape's current parameters
                int x = s.getX();
                int y = s.getY();
                int dx = s.getDX();
                int dy = s.getDY();
                int size = s.getSize();

                // Adjust motion vectors
                // Bounce if on the wall on the left or on the right
                if (x + size + dx > pan.getWidth() || x + dx < 0)
                    s.setMotion(-dx, dy);

                // Bounce if on the wall at the bottom or on top
                if (y + size + dy > pan.getHeight() || y + dy < 0)
                    s.setMotion(dx, -dy);

                // Execute movement
                s.setPosition(x + dx, y + dy);
            }

            // Callback to paintComponent()
            pan.repaint();

            // Wait before next frame
            try {
                Thread.sleep(1000 / UPDATE_RATE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
