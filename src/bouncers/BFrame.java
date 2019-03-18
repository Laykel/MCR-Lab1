package bouncers;

import bouncers.bouncable.Shape;

import javax.swing.JFrame;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Extension of the JFrame class
 */
@SuppressWarnings("serial")
public class BFrame extends JFrame {

    private static BFrame instance;


    // Number of refresh per second
    private static final int UPDATE_RATE = 80;
    private static final int NBR_OF_SHAPES = 40;
    private static final int INITIAL_FRAME_WIDTH = 800;
    private static final int INITIAL_FRAME_HEIGHT = 600;

    // The panel where the magic happens
    private BPanel pan;
    // Generation of a list of random shapes

    RendererBorder rendereBorder = new RendererBorder();
    RendererFill rendererFill= new RendererFill();

    private ShapeList shapeList = new ShapeList(NBR_OF_SHAPES, new BorderFactory(rendereBorder));

    /**
     * Constructor
     */
    public BFrame() {
        this.setTitle("Bouncers");

        this.setSize(INITIAL_FRAME_WIDTH, INITIAL_FRAME_HEIGHT);
        // this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pan = new BPanel(shapeList);
        this.setContentPane(pan);

        this.setVisible(true);

        move();
    }



    public static BFrame getInstance() {
        if (instance == null)
            instance = new BFrame(); // instanciation retardée
        return instance;
    }

    /**
     * Method controlling the shapes' movements
     */
    private void move() {
        // Create a timer object
        Timer timer = new Timer();

        // And schedule a task to run immediately, and then
        // every UPDATE_RATE per secondm
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Change every shape's coordinates
                for (Shape shape : shapeList.getShapeList()) {
                    shape.move(pan.getWidth(), pan.getHeight());
                }

                // Callback to paintComponent()
                pan.repaint();
            }
        }, 0, 1000 / UPDATE_RATE);
    }
}