package bouncers;

import bouncers.bouncable.Shape;

import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

/**
 * Singleton class representing the program's main view
 */
public class BouncersView /*implements Displayer*/ {
    // Singleton instance
    private static final BouncersView INSTANCE = new BouncersView();

    // Number of refresh per second
    private static final int UPDATE_RATE = 80;
    private static final int NBR_OF_SHAPES = 40;
    private static final int INITIAL_FRAME_WIDTH = 800;
    private static final int INITIAL_FRAME_HEIGHT = 600;

    // The panel where the magic happens
    private JFrame frame;
    private JPanel panel;
    // Generation of a list of random shapes
    private ShapeList shapeList = new ShapeList(NBR_OF_SHAPES, new BorderFactory(new RendererBorder()));

    /**
     * Private constructor so that there are no public constructors
     */
    private BouncersView() {
        frame = new JFrame("Bouncers");
        frame.setSize(INITIAL_FRAME_WIDTH, INITIAL_FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel() {
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
        };
        frame.setContentPane(panel);

        frame.setVisible(true);
    }

    /**
     * Method to get a reference to BouncersView
     * @return a reference to BouncersView
     */
    public static BouncersView getInstance() {
        return INSTANCE;
    }
/*
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
*/
    /**
     * Method controlling the shapes' movements
     */
    public void run() {
        // And schedule a task to run immediately, and then
        // every UPDATE_RATE per second
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Change every shape's coordinates
                for (Shape shape : shapeList.getShapeList()) {
                    shape.move(panel.getWidth(), panel.getHeight());
                }

                // Callback to paintComponent()
                panel.repaint();
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
