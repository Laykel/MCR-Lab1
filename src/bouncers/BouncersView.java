package bouncers;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyAdapter;
import java.awt.image.BufferedImage;

/**
 * Singleton extension of the JFrame class
 */
@SuppressWarnings("serial")
public class BouncersView extends JFrame implements Displayer {
    // Singleton instance
    private static BouncersView instance;

    private static final int INITIAL_FRAME_WIDTH = 800;
    private static final int INITIAL_FRAME_HEIGHT = 600;

    // The panel where the magic happens
    private JPanel panel;

    // Image object representing the panel's drawing area
    private BufferedImage panelImage;

    /**
     * Constructor (private so that no instance can be made from the outside)
     */
    private BouncersView() {
        super.setTitle("Bouncers");

        this.setSize(INITIAL_FRAME_WIDTH, INITIAL_FRAME_HEIGHT);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();

//        panel = new JPanel() {
//            /**
//             * Override of paintComponent to display the shapes
//             *
//             * @param g the graphics object on which to paint
//             */
//            @Override
//            public void paintComponent(Graphics g) {
//                // // Use Graphics2D for awesome antialiasing
//                // Graphics2D g2d = (Graphics2D) g;
//
//                // g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
//                //                      RenderingHints.VALUE_ANTIALIAS_ON);
//                // // Repaint background
//                // super.paintComponent(g2d);
//
//                // Repaint background
//                super.paintComponent(g);
//
//                // Paint all shapes
//                g.drawImage(panelImage, getWidth(), getHeight(), null);
//            }
//        };

        this.setContentPane(panel);

        panel.setFocusable(true);
        panel.requestFocusInWindow();

        this.setVisible(true);
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
        this.setTitle(title);
    }

    @Override
    public Graphics2D getGraphics() {
        return (Graphics2D) panelImage.getGraphics();
    }

    @Override
    public void repaint() {
        panel.getGraphics().drawImage(panelImage, 0, 0, null);
        panelImage = (BufferedImage) panel.createImage(getWidth(), getHeight());
        //panel.repaint();
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        panel.addKeyListener(ka);
    }
}
