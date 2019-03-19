package bouncers;

import bouncers.bouncable.Shape;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.awt.event.KeyAdapter;

/**
 * Singleton extension of the JFrame class
 */
@SuppressWarnings("serial")
public class BFrame extends JFrame implements Displayer {
    // Singleton instance
    private static BFrame instance;

    private static final int INITIAL_FRAME_WIDTH = 800;
    private static final int INITIAL_FRAME_HEIGHT = 600;

    // The panel where the magic happens
    private JPanel panel;

    // Graphics object representing the panel's area
    Graphics2D g2d;

    /**
     * Constructor (private so that no instance can be made from the outside)
     */
    private BFrame() {
        super.setTitle("Bouncers");

        this.setSize(INITIAL_FRAME_WIDTH, INITIAL_FRAME_HEIGHT);
        // this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel() {
            /**
             * Override of paintComponent to display the shapes
             * (calls ShapeList.draw())
             *
             * @param g the graphics object on which to paint
             */
            @Override
            public void paintComponent(Graphics g) {
                // Use Graphics2D for awesome antialiasing
                g2d = (Graphics2D) g;

                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                                     RenderingHints.VALUE_ANTIALIAS_ON);
                // Repaint background
                super.paintComponent(g2d);

                // Paint all shapes
                // shapeList.drawAllShapes(g2d);
            }
        };
        this.setContentPane(panel);

        panel.setFocusable(true);
        panel.requestFocusInWindow();

        this.setVisible(true);
    }

    /**
     * Method to get a reference to BouncersView
     * @return a reference to BouncersView
     */
    public static BFrame getInstance() {
        if (instance == null)
            instance = new BFrame(); // Lazy instanciation
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
        return g2d;
    }

    @Override
    public void repaint() {
        panel.repaint();
    }

    @Override
    public void addKeyListener(KeyAdapter ka) {
        panel.addKeyListener(ka);
    }
}
