package bouncers.gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

/**
 * Singleton displayer class for the main app view
 * @author Benjamin Le Guillou, Luc Wachter
 */
@SuppressWarnings("serial")
public class BouncersView implements Displayer {
    // Singleton instance
    private static BouncersView instance;

    // Initial properties of the window
    private static final int INITIAL_FRAME_WIDTH = 800;
    private static final int INITIAL_FRAME_HEIGHT = 600;

    // The frame for the main view of the app
    private JFrame frame;
    // The panel where the magic happens
    private JPanel panel;

    // Image object representing the panel's drawing area
    private BufferedImage panelImage;

    /**
     * Constructor (private so that no instance can be made from the outside)
     */
    private BouncersView() {
        frame = new JFrame();
        frame.setSize(INITIAL_FRAME_WIDTH, INITIAL_FRAME_HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        frame.setContentPane(panel);

        panel.setFocusable(true);
        panel.requestFocusInWindow();

        frame.setVisible(true);

        // Create image from the panel's view
        panelImage = (BufferedImage) panel.createImage(getWidth(), getHeight());
    }

    /**
     * Method to get a reference to BouncersView
     * @return a reference to BouncersView
     */
    public static BouncersView getInstance() {
        if (instance == null)
            instance = new BouncersView(); // Lazy instantiation
        return instance;
    }

    /**
     * Gets the width of the panel
     * @return the width of the panel
     */
    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    /**
     * Gets the height of the panel
     * @return the height of the panel
     */
    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    /**
     * Sets the frame's title
     * @param title The wanted frame's title
     */
    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    /**
     * Gets an image object (as a Graphics2D) representing the panel's drawing area
     * @return a graphics area on which to draw, of the panel's size
     */
    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) panelImage.getGraphics();
    }

    /**
     * Draw the image with the shapes on the panel, and create a new image object
     */
    @Override
    public void repaint() {
        panel.getGraphics().drawImage(panelImage, 0, 0, null);
        panelImage = (BufferedImage) panel.createImage(getWidth(), getHeight());
    }

    /**
     * Adds a listener for keyboard events
     * @param ka The KeyAdapter we want the frame to respond to
     */
    @Override
    public void addKeyListener(KeyAdapter ka) {
        panel.addKeyListener(ka);
    }
}
