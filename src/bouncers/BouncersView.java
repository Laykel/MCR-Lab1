package bouncers;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

/**
 * Singleton extension of the JFrame class
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

    @Override
    public int getWidth() {
        return panel.getWidth();
    }

    @Override
    public int getHeight() {
        return panel.getHeight();
    }

    @Override
    public void setTitle(String title) {
        frame.setTitle(title);
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) panelImage.getGraphics();
    }

    @Override
    public void repaint() {
        panel.getGraphics().drawImage(panelImage, 0, 0, null);
        panelImage = (BufferedImage) panel.createImage(getWidth(), getHeight());
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        panel.addKeyListener(ka);
    }
}
