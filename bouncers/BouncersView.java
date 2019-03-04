package bouncers;

import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/**
 * Singleton class representing the program's main view
 */
public class BouncersView implements Displayer {
    private static final BouncersView INSTANCE = new BouncersView();

    /**
     * Private constructor so that there are no public constructors
     */
    private BouncersView() {}

    /**
     * Method to get a reference to BouncersView
     * @return a reference to BouncersView
     */
    public static BouncersView getInstance() {
        return INSTANCE;
    }

    // Number of refresh per second
    private static final int UPDATE_RATE = 80;
    private static final int NBR_OF_SHAPES = 40;
    private static final int INITIAL_FRAME_WIDTH = 800;
    private static final int INITIAL_FRAME_HEIGHT = 600;

    // The panel where the magic happens
    private JFrame frame;
    private JPanel panel;
    // Generation of a list of random shapes
    private LinkedList<Shape> shapeList = new LinkedList<>();

    public int getWidth() {
        return panel.getWidth();
    }

    public int getHeight() {
        return panel.getHeight();
    }

    public Graphics2D getGraphics() {
        BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
        return img.createGraphics();
    }

    public void repaint() {
        panel.repaint();
    }

    public void setTitle(String s) {
        frame.setTitle(s);
    }

    /**
     * Method controlling the shapes' movements
     */
    private void run() {
        // Create a timer object
        Timer timer = new Timer();

        // And schedule a task to run immediately, and then
        // every UPDATE_RATE per second
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Change every shape's coordinates
                for (Shape shape : shapeList) {
                    shape.move(panel.getWidth(), panel.getHeight());
                }

                // Callback to paintComponent()
                repaint();
            }
        }, 0, 1000 / UPDATE_RATE);
    }
}

// Slides manner :
// public class BouncersView implements Displayer {
//     private static BouncersView instance;

//     // Private constructor so that there are no public constructors
//     private BouncersView() {}

//     public static BouncersView getInstance() {
//         if (instance == null)
//             instance = new BouncersView();
//         return instance;
//     }
// }
