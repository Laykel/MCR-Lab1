package bouncers;

import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Main entrypoint for the Bouncers app
 * @author Benjamin Le Guillou, Luc Wachter
 */
public class BounceApp {
    private LinkedList<Bouncable> bouncers = new LinkedList<>();

    // The frame for the main view, singleton with access to panel properties
    private BouncersView frame;

    // Rate at which the redrawing will happen in milliseconds
    private static final int UPDATE_RATE = 10;
    private static final int NBR_OF_SHAPES = 10;

    /**
     * Constructor of the main class
     * Create frame and adds its key listeners
     */
    public BounceApp() {
        frame = BouncersView.getInstance();
        frame.setTitle("Bouncers");

        // Respond to key presses
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // Get key code of the pressed key
                switch (e.getKeyCode()) {
                    // Spawn empty shapes
                    case KeyEvent.VK_B: for (int i = 0; i < NBR_OF_SHAPES; i++) {
                                            bouncers.add(BorderFactory.getInstance().createSquare());
                                            bouncers.add(BorderFactory.getInstance().createDisk());
                                        }
                                        break;

                    // Spawn full shapes
                    case KeyEvent.VK_F: for (int i = 0; i < NBR_OF_SHAPES; i++) {
                                            bouncers.add(FilledFactory.getInstance().createSquare());
                                            bouncers.add(FilledFactory.getInstance().createDisk());
                                        }
                                        break;

                    // Clear the list of shapes
                    case KeyEvent.VK_E: bouncers.clear();
                                        break;

                    // Quit app
                    case KeyEvent.VK_Q: System.exit(0);
                }
            }
        });
    }

    /**
     * Main display loop
     * Runs in a fixed rate timer loop
     */
    public void loop() {
        // Schedule a task to run immediately, and then
        // every UPDATE_RATE per second
        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Change every shape's coordinates
                for (Bouncable bouncer : bouncers) {
                    bouncer.move();
                    bouncer.draw();
                }

                // Callback to paintComponent()
                frame.repaint();
            }
        }, 0, UPDATE_RATE);
    }

    /**
     * Main program
     * @param args arguments to the app, not used
     */
    public static void main(String ... args) {
        new BounceApp().loop();
    }
}
